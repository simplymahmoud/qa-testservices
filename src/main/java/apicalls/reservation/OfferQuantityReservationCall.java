package apicalls.reservation;

import apicalls.ApiBaseCall;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.catalog.SearchOfferedProductsByResponse;
import dtos.reservation.ReservationQuantityResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class OfferQuantityReservationCall extends ApiBaseCall {

    private String path = "/offer-quantity-reservation/reservation/get_quantity/" ;
    HttpClient httpClient = HttpClientBuilder.create().build();
    ReservationQuantityResponse reservationQuantityResponse = new ReservationQuantityResponse();

    public ReservationQuantityResponse getAvailability(String sellingOfferId){
        setupGETCall(path + "/" + sellingOfferId);

        try {
            HttpResponse response = httpClient.execute(get);
            System.out.println("OfferQuantityReservationCall call: " + response.getStatusLine().toString());

            reservationQuantityResponse = retrieveResourceFromResponse(response, ReservationQuantityResponse.class);
        } catch(Exception e){e.getStackTrace();}

        return reservationQuantityResponse;
    }

}
