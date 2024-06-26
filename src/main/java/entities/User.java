package entities;

import org.mindrot.jbcrypt.BCrypt;

public class User {

    private Integer userID;
        //Unique key for the db

    private String username;
    private String encryptedPassword;
        //User login info

    private String role;

    public User(Integer id, String uname, String psw, String role) throws Exception {
        this.userID=id;
        this.username=uname;
        this.setPassword(psw);
        this.setRole(role);
    }
    public User(String uname, String psw, String role) throws Exception {
        this.username=uname;
        this.setPassword(psw);
        this.setRole(role);
    }

    public User () {

    }


    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    static public String encryptPassword(String password) {
        return BCrypt.hashpw(password, "$2a$12$1234567890123456789012");
    }

    public String getRole() {
        return role;
    }
    public String getUsername() {
        return username;
    }
    public Integer getUserID() {
        return userID;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String psw) {
        this.encryptedPassword = encryptPassword(psw);
    }

    public void setRole(String role) throws Exception {
        if(role.equalsIgnoreCase("admin")||role.equalsIgnoreCase("patient")||role.equalsIgnoreCase("doctor")){
            this.role = role;
        }
        else throw new Exception("Invalid role, the available options are: admin, doctor or patient");
    }
}
