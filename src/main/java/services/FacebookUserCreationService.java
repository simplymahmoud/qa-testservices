package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.FacebookUser;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.apache.http.HttpHeaders.USER_AGENT;
import static org.slf4j.LoggerFactory.getLogger;
import org.slf4j.Logger;


public class FacebookUserCreationService {

    private static final Logger LOG = getLogger(FacebookUserCreationService.class);

    private final String host = "https://graph.facebook.com";
    private final String testUserId = "1160894500697127";
    private final String path = "/" + testUserId + "/accounts/test-users";
    private final String accessToken = "1160894500697127|6ee76e6d9bb35c1afd72e407efdd8275";
    private String url = host + path;

    FacebookUser fbUser = new FacebookUser();

    public FacebookUser createNewFacebookUser(){
        return performCreateUserCall();
    }

    private FacebookUser performCreateUserCall(){
        LOG.info("Facebook user creation started.....");

        HttpClient httpClient = HttpClientBuilder.create().build();

        try {
            HttpPost post = new HttpPost(url);
            post.setHeader("User-Agent", USER_AGENT);
            post.setHeader("Host", "graph.facebook.com");
            post.setHeader("Accept",
                    "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            post.setHeader("Accept-Language", "en-US,en;q=0.5");
            post.setHeader("Connection", "keep-alive");
            post.setHeader("Content-Type", "application/x-www-form-urlencoded");

            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("installed", "true"));
            urlParameters.add(new BasicNameValuePair("locale", "en_US"));
            urlParameters.add(new BasicNameValuePair("name", "John Doe"));
            urlParameters.add(new BasicNameValuePair("permissions", "read_stream"));
            urlParameters.add(new BasicNameValuePair("access_token", accessToken));

            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            HttpResponse response = httpClient.execute(post);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
                ObjectMapper mapper = new ObjectMapper();
                fbUser = mapper.readValue(output, FacebookUser.class);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return fbUser;
    }

}
