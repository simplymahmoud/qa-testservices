package dtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "credit_card",
        "cash"
})
public class PaymentMethods {

    @JsonProperty("credit_card")
    private List<Object> creditCard = null;
    @JsonProperty("cash")
    private List<Object> cash = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("credit_card")
    public List<Object> getCreditCard() {
        return creditCard;
    }

    @JsonProperty("credit_card")
    public void setCreditCard(List<Object> creditCard) {
        this.creditCard = creditCard;
    }

    @JsonProperty("cash")
    public List<Object> getCash() {
        return cash;
    }

    @JsonProperty("cash")
    public void setCash(List<Object> cash) {
        this.cash = cash;
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
