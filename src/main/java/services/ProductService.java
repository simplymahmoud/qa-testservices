package services;

import apicalls.catalog.SearchOfferedProductsByCall;
import apicalls.reservation.OfferQuantityReservationCall;
import dtos.catalog.Page;
import dtos.catalog.SearchOfferedProductsByResponse;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public ProductService(){}

    SearchOfferedProductsByCall searchOfferedProductsByCall = new SearchOfferedProductsByCall();
    OfferQuantityReservationCall offerQuantityReservationCall = new OfferQuantityReservationCall();
    Page aPage = new Page();

    public Page getRandomProduct(){
        SearchOfferedProductsByResponse searchOfferedProductsByResponse = searchOfferedProductsByCall.findProduct();
        List<Page> pages = new ArrayList<Page>();
        pages.addAll(searchOfferedProductsByResponse.getPage());
        for(Page page: pages) {
            String sellingOfferId = page.getSellingOfferId();
            int available = offerQuantityReservationCall.getAvailability(sellingOfferId).getAvailable();
            if(available > 2)
                aPage = page;
            return aPage;
        }

        return aPage;
    }



}

