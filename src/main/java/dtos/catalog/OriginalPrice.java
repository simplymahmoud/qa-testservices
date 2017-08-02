package dtos.catalog;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cents",
        "decimal_places",
        "currency"
})
public class OriginalPrice {

    @JsonProperty("cents")
    private Integer cents;
    @JsonProperty("decimal_places")
    private Integer decimalPlaces;
    @JsonProperty("currency")
    private String currency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cents")
    public Integer getCents() {
        return cents;
    }

    @JsonProperty("cents")
    public void setCents(Integer cents) {
        this.cents = cents;
    }

    @JsonProperty("decimal_places")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("decimal_places")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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
