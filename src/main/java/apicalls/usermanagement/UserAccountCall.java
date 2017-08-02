package apicalls.usermanagement;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.Uuid;
import objects.User;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.slf4j.LoggerFactory.getLogger;
import org.slf4j.Logger;

public class UserAccountCall extends ApiBaseCall {

    private static final Logger LOG = getLogger(UserAccountCall.class);

    private String path = "/user-management/user/account";

    private Uuid uuid = new Uuid();

    HttpClient httpClient = HttpClientBuilder.create().build();

    public Uuid performCall(User user){
        try {
            String url = "https://" + getHost() + path;
            HttpPost post = new HttpPost(url);
            post.setHeader("Accept",
                    "application/json");
            post.setHeader("content-type", "application/json");

            String nameStr = String.format("\"name\":\"%s\",", user.getUsername());
            String emailStr = String.format("\"email\":\"%s\",", user.getEmail());
            String passwordStr = String.format("\"password\":\"%s\"", user.getPassword());
            String jsonParamsStr = String.format( "{"+ nameStr + emailStr + passwordStr +"}");

            StringEntity params = new StringEntity(jsonParamsStr);

            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            LOG.info(response.getStatusLine().toString());

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                uuid = mapper.readValue(output, Uuid.class);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return uuid;
    }
}
