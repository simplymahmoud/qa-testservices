package jsonobjects;


import dtos.NewPrice;
import dtos.OldPrice;

import java.util.List;

public class PlaceOrderProduct {

    private String checkout_id;
    private String selected_address_id;
    private String selected_payment_id;
    private List<ShipmentProduct> shipments;
    private OldPrice oldPrice;
    private NewPrice newPrice;

    public PlaceOrderProduct(){}

    public PlaceOrderProduct(String checkout_id, String selected_address_id, String selected_payment_id, List<ShipmentProduct> shipments, OldPrice oldPrice, NewPrice newPrice){
        this.checkout_id = checkout_id;
        this.selected_address_id = selected_address_id;
        this.selected_payment_id = selected_payment_id;
        this.shipments = shipments;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;

    }

    public String getCheckout_id() {
        return checkout_id;
    }

    public void setCheckout_id(String checkout_id) {
        this.checkout_id = checkout_id;
    }

    public String getSelected_address_id() {
        return selected_address_id;
    }

    public void setSelected_address_id(String selected_address_id) {
        this.selected_address_id = selected_address_id;
    }

    public String getSelected_payment_id() {
        return selected_payment_id;
    }

    public void setSelected_payment_id(String selected_payment_id) {
        this.selected_payment_id = selected_payment_id;
    }

    public List<ShipmentProduct> getShipments() {
        return shipments;
    }

    public void setShipments(List<ShipmentProduct> shipments) {
        this.shipments = shipments;
    }

    public OldPrice getOldPrice() {
        return oldPrice;
    }

    public void setCartPriceDTO(OldPrice oldPrice) {
        this.oldPrice = oldPrice;
    }

    public NewPrice getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(NewPrice newPrice) {
        this.newPrice = newPrice;
    }
}
