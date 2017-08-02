package jsonobjects;


public class CheckoutProduct {
    private String payment_method_id;
    private String shipping_address_id;

    public CheckoutProduct(){}

    public CheckoutProduct(String payment_method_id, String shipping_address_id){
        this.payment_method_id = payment_method_id;
        this.shipping_address_id = shipping_address_id;
    }

    public String getPayment_method_id() {
        return payment_method_id;
    }

    public String getShipping_address_id() {
        return shipping_address_id;
    }

    public void setPayment_method_id(String payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public void setShipping_address_id(String shipping_address_id) {
        this.shipping_address_id = shipping_address_id;
    }
}
