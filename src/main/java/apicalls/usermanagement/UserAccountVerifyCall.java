package apicalls.usermanagement;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.RegisteredEmailUser;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.slf4j.LoggerFactory.getLogger;
import org.slf4j.Logger;

public class UserAccountVerifyCall extends ApiBaseCall {
    private static final Logger LOG = getLogger(UserAccountVerifyCall.class);

    private String path = "/user-management/user/verify";

    HttpClient httpClient = HttpClientBuilder.create().build();

    private RegisteredEmailUser registeredEmailUser = new RegisteredEmailUser();

    public RegisteredEmailUser performCall(String uuid, String verificationCode){
        try {
            String url = "https://" + getHost() + path;
            HttpPost post = new HttpPost(url);

            post.setHeader("Accept",
                    "application/json");
            post.setHeader("Content-Type", "application/json");

            String uuidStr = String.format("\"uuid\":\"%s\",", uuid);
            String verificationCodeStr = String.format("\"verificationCode\":\"%s\"", verificationCode);
            String jsonParamsStr = String.format( "{"+ uuidStr + verificationCodeStr +"}");

            StringEntity params = new StringEntity(jsonParamsStr);

            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            LOG.info(response.getStatusLine().toString());

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                registeredEmailUser = mapper.readValue(output, RegisteredEmailUser.class);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return registeredEmailUser;
    }
}
