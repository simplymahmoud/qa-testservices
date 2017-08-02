package jsonobjects;


public class CartProduct {

    private String offer_id;
    private int quantity;

    public CartProduct(){}

    public CartProduct(String offer_id, int quantity){
        this.offer_id = offer_id;
        this.quantity = quantity;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
