package services;


import apicalls.usermanagement.UserAccountCall;
import apicalls.usermanagement.UserAccountVerifyCall;
import dtos.RegisteredEmailUser;
import dtos.Uuid;
import objects.User;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class UserCreationService {

    private static final Logger LOG = getLogger(UserAccountVerifyCall.class);

    private User user;

    public UserCreationService(){}

    public UserCreationService(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(String email) {
        this.user = user;
    }

    RegisteredEmailUser newUser = new RegisteredEmailUser();
    UserAccountCall userAccountCall = new UserAccountCall();
    UserAccountVerifyCall userAccountVerifyCall = new UserAccountVerifyCall();

    public RegisteredEmailUser createUser(User user){
        Uuid uuid = userAccountCall.performCall(user);

        try {
            Thread.sleep(8000);
        }catch(Exception e){}

        OTPExtractionService otpExtractionService = new OTPExtractionService();
        String verificationCode = otpExtractionService.getVerificationCodeRegistration();
        newUser = userAccountVerifyCall.performCall(uuid.getUuid(), verificationCode);
        return newUser;
    }

}
