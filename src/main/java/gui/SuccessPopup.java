package gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SuccessPopup {

    /**
     * When called displays a new window with a success msg in function of the int passed to the function
     * <p> {@code 0} General success (unspecified)
     * <p> {@code 1} Success edit patient 
     * <p> {@code 2} Success edit worker    
     * <p> {@code 3} Success link worker+patient    
     * <p> {@code 4} Success create patient     
     * <p> {@code 5} Success create worker
     * <p> {@code 6} Success delete User
     * <p> {@code 7} welp
     * <p> {@code X} idk keep adding stuff here...
     *
     * @param successType - int
     * @throws IOException
     */
    public void successPopup(int successType) throws IOException {
        FXMLLoader loaderSuccess;
        Parent rootSuccess;
        Scene sceneSuccess;
        Stage stageSuccess;
        Image icon;
        SuccessPopupController successPopupController;
        switch (successType) {
            case 0:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Success :).");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

			icon = new Image("img/successIcon.png");
			stageSuccess.getIcons().add(icon);

			stageSuccess.setTitle("Success");
			stageSuccess.show();

                break;
            case 1:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Edited Patient Correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 2:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Edited Worker Correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 3:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Linked Patient and Worker Correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 4:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Created Patient Correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 5:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Created Doctor Correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 6:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("User deleted correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 7:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Worker deleted correctly.");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 8:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Success :).");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 9:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Treatment successfully saved in the database");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 10:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Shifts successfully exported to XML file");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 11:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Shifts from XML successfully added to the database");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 12:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Password successfully updated");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 13:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("XML successfully converted into HTML");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 14:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Workers successfully exported to XML file");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 15:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Workers from XML successfully added to the database");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            case 16:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Medical Test successfully saved in the database");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
            default:
                loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
                rootSuccess = loaderSuccess.load(); 
                successPopupController = loaderSuccess.getController();
                successPopupController.displaySuccessText("Success :).");
                sceneSuccess = new Scene(rootSuccess);
                stageSuccess = new Stage();
                stageSuccess.setScene(sceneSuccess);

                icon = new Image("img/successIcon.png");
                stageSuccess.getIcons().add(icon);	        

                stageSuccess.setTitle("Success");
                stageSuccess.setResizable(false);
                stageSuccess.show();

                break;
        }
    }
    
    public void successPopup(String scssMsg) throws IOException {
        FXMLLoader loaderSuccess;
        Parent rootSuccess;
        Scene sceneSuccess;
        Stage stageSuccess;
        Image icon;
        SuccessPopupController successPopupController;
        loaderSuccess = new FXMLLoader(getClass().getResource("SuccessPopup.fxml")); 
        rootSuccess = loaderSuccess.load(); 
        successPopupController = loaderSuccess.getController();
        successPopupController.displaySuccessText(scssMsg);
        sceneSuccess = new Scene(rootSuccess);
        stageSuccess = new Stage();
        stageSuccess.setScene(sceneSuccess);

        icon = new Image("img/successIcon.png");
        stageSuccess.getIcons().add(icon);

        stageSuccess.setTitle("Success");
        stageSuccess.show();
    }

}
