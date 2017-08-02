package apicalls.cart;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.CartResponse;
import jsonobjects.CartProduct;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class CartCall extends ApiBaseCall {

    private static final Logger LOG = getLogger(CartCall.class);

    private String path = "/cp-cart/cart";

    HttpClient httpClient = HttpClientBuilder.create().build();
    CartResponse cartResponse = new CartResponse();

    public CartResponse addProduct(CartProduct cartProduct, String token){
        setupAuthorizedPUTCall(path, token);

        try{

            ObjectMapper cartProductMapper = new ObjectMapper();
            String jsonParams = "[" + cartProductMapper.writeValueAsString(cartProduct) + "]";
            System.out.println("json String: " + jsonParams);
            StringEntity params = new StringEntity(jsonParams);
            put.setEntity(params);
            HttpResponse response = httpClient.execute(put);

            System.out.println("Cart call: " +  response.getStatusLine().toString());

            cartResponse = retrieveResourceFromResponse(response, CartResponse.class);

        }catch(Exception e){
            e.getStackTrace();
        }

        return cartResponse;
    }



}
