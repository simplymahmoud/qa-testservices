package dtos;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "delivery_range_time",
        "price"
})
public class DeliveryOption {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("delivery_range_time")
    private DeliveryRangeTime deliveryRangeTime;
    @JsonProperty("price")
    private dtos.catalog.Price price;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("delivery_range_time")
    public DeliveryRangeTime getDeliveryRangeTime() {
        return deliveryRangeTime;
    }

    @JsonProperty("delivery_range_time")
    public void setDeliveryRangeTime(DeliveryRangeTime deliveryRangeTime) {
        this.deliveryRangeTime = deliveryRangeTime;
    }

    @JsonProperty("price")
    public dtos.catalog.Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(dtos.catalog.Price price) {
        this.price = price;
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
