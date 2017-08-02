package dtos;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cents",
        "currency",
        "decimal_places"
})
public class Price {

    @JsonProperty("cents")
    private Integer cents;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("decimal_places")
    private Integer decimalPlaces;
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

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("decimal_places")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("decimal_places")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
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
