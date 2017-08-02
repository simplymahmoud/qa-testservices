package apicalls.usermanagement;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.ResetPasswordRepsonse;
import dtos.Token;
import dtos.Uuid;
import jsonobjects.Email;
import jsonobjects.UserPasswordResetObject;
import jsonobjects.UserVerificationObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ResetPasswordCall extends ApiBaseCall {

    private static final Logger LOG = getLogger(ResetPasswordCall.class);

    private String pathRequest = "/user-management/user/password/request";
    private String pathVerify = "/user-management/user/password/verify";
    private String pathReset = "/user-management/user/password/reset";

    HttpClient httpClient = HttpClientBuilder.create().build();

    Uuid uuid = new Uuid();
    Token token = new Token();
    ResetPasswordRepsonse resetPasswordRepsonse = new ResetPasswordRepsonse();

    public Uuid requestPassword(Email email){
        setupPOSTCall(pathRequest);

        try {
            ObjectMapper requestPasswordMapper = new ObjectMapper();
            String jsonParamsStr = requestPasswordMapper.writeValueAsString(email);
            StringEntity params = new StringEntity(jsonParamsStr);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("RequestPassword call: " +  response.getStatusLine().toString());
            uuid = retrieveResourceFromResponse(response, Uuid.class);

        }catch(Exception e){
            e.getStackTrace();
        }
        return uuid;

    }

    public Token verifyPassword(UserVerificationObject userVerificationObject){
        setupPOSTCall(pathVerify);

        try {
            ObjectMapper verifyPasswordMapper = new ObjectMapper();
            String jsonParamsStr = verifyPasswordMapper.writeValueAsString(userVerificationObject);
            StringEntity params = new StringEntity(jsonParamsStr);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("VerifyPassword call: " +  response.getStatusLine().toString());
            token = retrieveResourceFromResponse(response, Token.class);

        }catch(Exception e){
            e.getStackTrace();
        }
        return token;
    }

    public ResetPasswordRepsonse resetPassword(UserPasswordResetObject userPasswordResetObject){
        setupPOSTCall(pathReset);

        try {
            ObjectMapper resetPasswordMapper = new ObjectMapper();
            String jsonParamsStr = resetPasswordMapper.writeValueAsString(userPasswordResetObject);
            StringEntity params = new StringEntity(jsonParamsStr);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("ResetPassword call: " +  response.getStatusLine().toString());
            resetPasswordRepsonse = retrieveResourceFromResponse(response, ResetPasswordRepsonse.class);

        }catch(Exception e){
            e.getStackTrace();
        }
        return resetPasswordRepsonse;
    }
}
