package apicalls.usermanagement;


import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.RegisteredEmailUser;
import dtos.RegisteredPhoneUser;
import jsonobjects.EmailUser;
import jsonobjects.PhoneUser;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class LoginCall extends ApiBaseCall {
    private static final Logger LOG = getLogger(LoginCall.class);

    private String path = "/user-management/user/login";

    HttpClient httpClient = HttpClientBuilder.create().build();

    RegisteredEmailUser registeredEmailUser = new RegisteredEmailUser();
    RegisteredPhoneUser registeredPhoneUser = new RegisteredPhoneUser();

    public RegisteredEmailUser loginWithEmail(String email, String password) {

        setupPOSTCall(path);

        try {
            ObjectMapper emailUserMapper = new ObjectMapper();
            EmailUser user = new EmailUser(email,password);
            String jsonParamsStr = emailUserMapper.writeValueAsString(user);
            StringEntity params = new StringEntity(jsonParamsStr);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("Login call: " +  response.getStatusLine().toString());
            registeredEmailUser = retrieveResourceFromResponse(response, RegisteredEmailUser.class);

        }catch(Exception e){
            e.getStackTrace();
        }
        return registeredEmailUser;
    }

    public RegisteredPhoneUser loginWithPhoneNumber(String phoneNumber, String password){
        setupPOSTCall(path);

        try {
            ObjectMapper emailUserMapper = new ObjectMapper();
            PhoneUser user = new PhoneUser(phoneNumber,password);
            String jsonParamsStr = emailUserMapper.writeValueAsString(user);
            StringEntity params = new StringEntity(jsonParamsStr);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            LOG.info(response.getStatusLine().toString());
            registeredPhoneUser = retrieveResourceFromResponse(response, RegisteredPhoneUser.class);
        }
        catch(Exception e){
            e.getStackTrace();
        }

        return registeredPhoneUser;
    }

}
