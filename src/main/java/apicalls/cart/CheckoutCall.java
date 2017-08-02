package apicalls.cart;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.CheckoutResponse;
import jsonobjects.CheckoutProduct;
import jsonobjects.PlaceOrderProduct;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class CheckoutCall extends ApiBaseCall {

    private static final Logger LOG = getLogger(CheckoutCall.class);

    private String path = "/cp-cart/cart/checkout";

    HttpClient httpClient = HttpClientBuilder.create().build();
    CheckoutResponse checkoutResponse = new CheckoutResponse();
    PlaceOrderProduct placeOrderProduct = new PlaceOrderProduct();

    public CheckoutResponse performCheckoutPatch(CheckoutProduct checkoutProduct, String token){
        setupAuthorizedPATCHCall(path,token);

        try{
            ObjectMapper checkoutProductMapper = new ObjectMapper();
            String jsonParams = checkoutProductMapper.writeValueAsString(checkoutProduct);

            StringEntity params = new StringEntity(jsonParams);
            patch.setEntity(params);
            HttpResponse response = httpClient.execute(patch);

            System.out.println("Checkout call PATCH: " +  response.getStatusLine().toString());

            checkoutResponse = retrieveResourceFromResponse(response, CheckoutResponse.class);
        }catch(Exception e){
            e.getStackTrace();
        }

        return checkoutResponse;

    }

    public PlaceOrderProduct performCheckoutPOST(CheckoutResponse checkoutResultDTO, String token){
        setupAuthorizedPOSTCall(path, token);

        try{
            ObjectMapper checkoutProductMapper = new ObjectMapper();
            String jsonParams = checkoutProductMapper.writeValueAsString(checkoutResultDTO);

            StringEntity params = new StringEntity(jsonParams);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("Checkout call POST: " +  response.getStatusLine().toString());

            placeOrderProduct = retrieveResourceFromResponse(response, PlaceOrderProduct.class);
        }catch(Exception e){
            e.getStackTrace();
        }

        return placeOrderProduct;
    }
}
