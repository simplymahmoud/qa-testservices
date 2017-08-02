package apicalls;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.util.EntityUtils;
import static org.apache.http.HttpHeaders.USER_AGENT;

import java.io.IOException;

public class ApiBaseCall {
    private String host = "api.noon.com";
    private String catalogHost = "cp-catalog.ext.prod.aws.fastfish.io";

    public HttpPost post = new HttpPost();
    public HttpGet get = new HttpGet();
    public HttpPut put = new HttpPut();
    public HttpPatch patch = new HttpPatch();

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCatalogHost() {return catalogHost;}

    public void setCatalogHost(String catalogHost) {this.catalogHost = catalogHost;}

    public void setupPOSTCall(String path){
        String url = "https://" + getHost() + path;
        post = new HttpPost(url);
        post.setHeader("Accept",
                "application/json");
        post.setHeader("Content-Type", "application/json");
    }

    public void setupAuthorizedPOSTCall(String path, String token){
        String url = "https://" + getHost() + path;
        post = new HttpPost(url);
        post.setHeader("Accept",
                "application/json");
        post.setHeader("Content-Type", "application/json");
        post.setHeader("Authorization", "Bearer "  + token);
    }

    public void setupAuthorizedPUTCall(String path, String token){
        String url = "https://" + getHost() + path;
        put = new HttpPut(url);
        put.setHeader("Accept",
                "application/json");
        put.setHeader("Content-Type", "application/json");
        put.setHeader("Authorization", "Bearer "  + token);
    }

    public void setupAuthorizedPATCHCall(String path, String token){
        String url = "https://" + getHost() + path;
        patch = new HttpPatch(url);
        patch.setHeader("Accept",
                "application/json");
        patch.setHeader("Content-Type", "application/json");
        patch.setHeader("accept-encoding", "gzip, deflate, br");
        patch.setHeader("Connection", "keep-alive");
        patch.setHeader("Authorization", "Bearer "  + token);
    }

    public void setupGETCall(String path){
        String url = "https://" + getHost() + path;
        get = new HttpGet(url);
        get.setHeader("Accept",
                "application/json");
        get.setHeader("Content-Type", "application/json");
    }

    public void setupPOSTCallForHost(String host, String path){
        String url = "https://" + getCatalogHost() + path;
        post = new HttpPost(url);
        post.setHeader("Accept",
                "application/json");
        post.setHeader("Content-Type", "application/json");
    }

    public void setupGETCallForHost(String host, String path){
        String url = "https://" + getCatalogHost() + path;
        get = new HttpGet(url);
        get.setHeader("Accept",
                "application/json");
        get.setHeader("Content-Type", "application/json");
        get.setHeader("User-Agent", USER_AGENT);
    }

    public static <T> T retrieveResourceFromResponse(HttpResponse response, Class<T> clazz)
            throws IOException {
        String jsonFromResponse = EntityUtils.toString(response.getEntity());
        ObjectMapper mapper = new ObjectMapper().
                configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonFromResponse, clazz);
    }
}
