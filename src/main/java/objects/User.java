package objects;

import utils.Utils;

import java.sql.Timestamp;

public class User {

    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.username = Utils.generateRandomString(15);
        this.email = "noonnoontest+" + String.valueOf(timestamp.getTime()) + "@gmail.com";;
        this.password = "noontest12";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNonTimestampedEmail(){
        String nonTimestampedEmail = "noonnoontest@gmail.com";
        return nonTimestampedEmail;
    }
}
