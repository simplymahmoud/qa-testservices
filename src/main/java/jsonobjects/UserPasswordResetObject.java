package jsonobjects;

public class UserPasswordResetObject {

    private String uuid;
    private String token;
    private String newPassword;

    public UserPasswordResetObject(){}

    public UserPasswordResetObject(String uuid, String token, String password) {
        this.uuid = uuid;
        this.token = token;
        this.newPassword = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
