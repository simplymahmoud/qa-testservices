package apicalls.consumerprofile;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.Address;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class AddressCall extends ApiBaseCall {

    private static final Logger LOG = getLogger(AddressCall.class);

    private String path = "/consumer-profile/account/address";

    HttpClient httpClient = HttpClientBuilder.create().build();

    Address address = new Address();

    public Address addAddress(jsonobjects.Address address, String token){

        setupAuthorizedPOSTCall(path,token);

        try{
            ObjectMapper addressMapper = new ObjectMapper();
            String jsonParams = addressMapper.writeValueAsString(address);
            StringEntity params = new StringEntity(jsonParams);
            post.setEntity(params);
            HttpResponse response = httpClient.execute(post);

            System.out.println("Address: " + response.getStatusLine().toString());

            this.address = retrieveResourceFromResponse(response, Address.class);
        }catch(Exception e){
            e.getStackTrace();
        }

        return this.address;
    }

}
