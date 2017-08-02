package dtos;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(value = {
        "id",
        "items",
        "delivery_options",
        "selected_delivery_option",
        "price_summary"
})
public class Shipment {

    @JsonProperty("id")
    private String id;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("delivery_options")
    private List<DeliveryOption> deliveryOptions = null;
    @JsonProperty("selected_delivery_option")
    private String selectedDeliveryOption;
    @JsonProperty("price_summary")
    private PriceSummary priceSummary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("delivery_options")
    public List<DeliveryOption> getDeliveryOptions() {
        return deliveryOptions;
    }

    @JsonProperty("delivery_options")
    public void setDeliveryOptions(List<DeliveryOption> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    @JsonProperty("selected_delivery_option")
    public String getSelectedDeliveryOption() {
        return selectedDeliveryOption;
    }

    @JsonProperty("selected_delivery_option")
    public void setSelectedDeliveryOption(String selectedDeliveryOption) {
        this.selectedDeliveryOption = selectedDeliveryOption;
    }

    @JsonProperty("price_summary")
    public PriceSummary getPriceSummary() {
        return priceSummary;
    }

    @JsonProperty("price_summary")
    public void setPriceSummary(PriceSummary priceSummary) {
        this.priceSummary = priceSummary;
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
