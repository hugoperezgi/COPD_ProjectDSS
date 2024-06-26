package gui;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entities.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import sql.DbManager;

import static org.kie.internal.task.query.TaskVariableQueryBuilder.OrderBy.id;

public class AdminController implements Initializable{

    public ErrorPopup err = new ErrorPopup();
    public SuccessPopup succ = new SuccessPopup();

    @FXML
    public Pane paneNewPatient;
    @FXML
    public PasswordField pswFieldPatient;
    @FXML
    public TextField textFieldUsernamePatient;
    @FXML
    public TextField textFieldNamePatient;
    @FXML
    public TextField textFieldMedCardNumPatient;
    @FXML
    public DatePicker datePickerBirthdate;
    @FXML
    public Button buttonCreatePatient;

    @FXML
    public Pane paneNewStaffMember;
    @FXML
    public PasswordField pswFieldStaffMember;
    @FXML
    public TextField textFieldUsernameStaffMember;
    @FXML
    public ComboBox<String> comboBoxRole;
    public String[] roles = {"doctor", "admin"};
    @FXML
    public Button buttonCreateStaffMember;

    @FXML
    public Pane paneDeleteUser;
    @FXML
    public TableView<User> tableViewUsers;
    @FXML
    public TableColumn<User, Integer> columnUserIds;
    @FXML
    public TableColumn<User, String> columnUserNames;
    @FXML
    public TableColumn<User, String> columnUserRoles;
    @FXML
    public ComboBox<String> comboBoxUsers;
    public List<Integer> usersIDs = new ArrayList<>();
    @FXML
    public Button buttonDeleteUser;


    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxRole.getItems().setAll(roles);

        columnUserIds.setCellValueFactory(new PropertyValueFactory<>("userID"));
        columnUserNames.setCellValueFactory(new PropertyValueFactory<>("username"));
        columnUserRoles.setCellValueFactory(new PropertyValueFactory<>("role"));
    }     
        
    
    public void logOut(){
        System.exit(0);
    }

    public void createPatient() throws Exception {
        if(textFieldUsernamePatient.getText().isEmpty() || pswFieldPatient.getText().isEmpty() || textFieldNamePatient.getText().isEmpty() || textFieldMedCardNumPatient.getText().isEmpty()){
            err.errorPopup("Fill in all of the mandatory fields");
        } else {
            String username = textFieldUsernamePatient.getText();
            String password = pswFieldPatient.getText();
            String role = "patient";
            User new_user = new User(username, password, role);
            if (DbManager.check_user(new_user.getUsername(), new_user.getEncryptedPassword()) == null) {
                String patientname = textFieldNamePatient.getText();
                int medicalCardNumber = Integer.parseInt(textFieldMedCardNumPatient.getText());
                Date birthdate = Date.valueOf(datePickerBirthdate.getValue());
                int user_id = DbManager.createUser(new_user.getUsername(), new_user.getEncryptedPassword(), new_user.getRole());
                DbManager.createPatient(patientname, medicalCardNumber, birthdate, user_id);
                succ.successPopup(4);
            } else {
                err.errorPopup("Combination user and password not valid");
            }
        }


    }

    public void createStaffMember() throws Exception {
        if(textFieldUsernameStaffMember.getText().isEmpty() || pswFieldStaffMember.getText().isEmpty() || comboBoxRole.getSelectionModel().isEmpty()){
            err.errorPopup("Fill in all of the mandatory fields");
        } else {
            String username = textFieldUsernameStaffMember.getText();
            String password = pswFieldStaffMember.getText();
            String role = comboBoxRole.getSelectionModel().getSelectedItem();
            User new_user = new User(username, password, role);
            if (DbManager.check_user(new_user.getUsername(), new_user.getEncryptedPassword()) == null) {
                DbManager.createUser(new_user.getUsername(), new_user.getEncryptedPassword(), new_user.getRole());
                succ.successPopup(5);
            } else {
                err.errorPopup("Combination user and password not valid");
            }
        }
    }



    public void deleteUser() throws Exception {
        if(comboBoxUsers.getSelectionModel().isEmpty()){
            err.errorPopup("Fill in all of the mandatory fields");
        }
        String id = comboBoxUsers.getSelectionModel().getSelectedItem();
        DbManager.deleteUser(Integer.parseInt(id));
        succ.successPopup(6);
    }

    public void newPatient(){
        hideAll();
        showAndResetCreatePatientPane();
    }

    public void newStaffMember(){
        hideAll();
        showAndResetCreateStaffMemberPane();
    }

    public void deleteUserMenu() throws Exception {
        hideAll();
        showAndResetDeleteUserPane();
        List<User> allusers = DbManager.getAllUsers();
        int userCount = allusers.size();
        String aaaa[] = new String[userCount];
        int i=0;
        for (User f : allusers) {
            aaaa[i]=f.getUserID().toString();i++;
        }
        comboBoxUsers.getItems().setAll(aaaa);
        tableViewUsers.getItems().setAll(allusers);
    }

    public void hideAll(){
        paneNewPatient.setVisible(false);
        paneNewPatient.setDisable(true);

        paneNewStaffMember.setVisible(false);
        paneNewStaffMember.setDisable(true);

        paneDeleteUser.setVisible(false);
        paneDeleteUser.setDisable(true);
    }

    public void showAndResetCreatePatientPane(){
        paneNewPatient.setVisible(true);
        paneNewPatient.setDisable(false);

        pswFieldPatient.clear();
        textFieldUsernamePatient.clear();
        textFieldNamePatient.clear();
        textFieldMedCardNumPatient.clear();
        datePickerBirthdate.setValue(null);
    }

    public void showAndResetCreateStaffMemberPane(){
        paneNewStaffMember.setVisible(true);
        paneNewStaffMember.setDisable(false);

        pswFieldStaffMember.clear();
        textFieldUsernameStaffMember.clear();
        comboBoxRole.getSelectionModel().clearSelection();
    }

    public void showAndResetDeleteUserPane(){
        paneDeleteUser.setVisible(true);
        paneDeleteUser.setDisable(false);

        comboBoxUsers.getSelectionModel().clearSelection();
    }
}