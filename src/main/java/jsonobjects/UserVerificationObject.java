package jsonobjects;


public class UserVerificationObject {


    private String uuid;
    private String verificationCode;

    public UserVerificationObject(){}

    public UserVerificationObject(String uuid, String verificationCode) {
        this.uuid = uuid;
        this.verificationCode = verificationCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
