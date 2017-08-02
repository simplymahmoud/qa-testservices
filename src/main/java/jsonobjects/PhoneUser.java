package jsonobjects;


public class PhoneUser {
    private String phoneNumber;
    private String password;

    public PhoneUser(){}

    public PhoneUser(String phoneNumber, String password){
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
