package apicalls.cart;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonobjects.PlaceOrderProduct;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class PlaceOrderCall extends ApiBaseCall {
    private static final Logger LOG = getLogger(PlaceOrderCall.class);

    private String path = "/cp-cart/cart/placeOrder";

    HttpClient httpClient = HttpClientBuilder.create().build();
    String responseStr = "";

    public String placeOrder(PlaceOrderProduct placeOrderProduct, String token){
        setupAuthorizedPOSTCall(path, token);

        try{
            ObjectMapper checkoutProductMapper = new ObjectMapper();
            String jsonParams = checkoutProductMapper.writeValueAsString(placeOrderProduct);

            StringEntity params = new StringEntity(jsonParams);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);
            responseStr = response.getStatusLine().toString();

            System.out.println("PlaceOrder call: " +  responseStr);

        }catch(Exception e){
            e.getStackTrace();
        }
        return responseStr;
    }

}
