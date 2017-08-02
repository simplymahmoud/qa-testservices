package dtos;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "checkout_id",
        "shipments",
        "shipping_addresses",
        "payment_methods",
        "is_cod_eligible",
        "price_summary",
        "selected_address_id",
        "selected_payment_id",
        "errors"
})
public class CheckoutResponse {

    @JsonProperty("checkout_id")
    private String checkoutId;
    @JsonProperty("shipments")
    private List<Shipment> shipments = null;
    @JsonProperty("shipping_addresses")
    private List<ShippingAddress> shippingAddresses = null;
    @JsonProperty("payment_methods")
    private PaymentMethods paymentMethods;
    @JsonProperty("is_cod_eligible")
    private Boolean isCodEligible;
    @JsonProperty("price_summary")
    private PriceSummary priceSummary;
    @JsonProperty("selected_address_id")
    private String selectedAddressId;
    @JsonProperty("selected_payment_id")
    private String selectedPaymentId;
    @JsonProperty("errors")
    private List<Object> errors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("checkout_id")
    public String getCheckoutId() {
        return checkoutId;
    }

    @JsonProperty("checkout_id")
    public void setCheckoutId(String checkoutId) {
        this.checkoutId = checkoutId;
    }

    @JsonProperty("shipments")
    public List<Shipment> getShipments() {
        return shipments;
    }

    @JsonProperty("shipments")
    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    @JsonProperty("shipping_addresses")
    public List<ShippingAddress> getShippingAddresses() {
        return shippingAddresses;
    }

    @JsonProperty("shipping_addresses")
    public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    @JsonProperty("payment_methods")
    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    @JsonProperty("payment_methods")
    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @JsonProperty("is_cod_eligible")
    public Boolean getIsCodEligible() {
        return isCodEligible;
    }

    @JsonProperty("is_cod_eligible")
    public void setIsCodEligible(Boolean isCodEligible) {
        this.isCodEligible = isCodEligible;
    }

    @JsonProperty("price_summary")
    public PriceSummary getPriceSummary() {
        return priceSummary;
    }

    @JsonProperty("price_summary")
    public void setPriceSummary(PriceSummary priceSummary) {
        this.priceSummary = priceSummary;
    }

    @JsonProperty("selected_address_id")
    public String getSelectedAddressId() {
        return selectedAddressId;
    }

    @JsonProperty("selected_address_id")
    public void setSelectedAddressId(String selectedAddressId) {
        this.selectedAddressId = selectedAddressId;
    }

    @JsonProperty("selected_payment_id")
    public String getSelectedPaymentId() {
        return selectedPaymentId;
    }

    @JsonProperty("selected_payment_id")
    public void setSelectedPaymentId(String selectedPaymentId) {
        this.selectedPaymentId = selectedPaymentId;
    }

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}