package jsonobjects;

public class ShipmentProduct {

    private String selected_delivery_option;
    private String shipment_id;

    public ShipmentProduct(){}

    public ShipmentProduct(String selected_delivery_option, String shipment_id){
        this.selected_delivery_option = selected_delivery_option;
        this.shipment_id = shipment_id;
    }

    public String getSelected_delivery_option() {
        return selected_delivery_option;
    }

    public void setSelected_delivery_option(String selected_delivery_option) {
        this.selected_delivery_option = selected_delivery_option;
    }

    public String getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(String shipment_id) {
        this.shipment_id = shipment_id;
    }
}
