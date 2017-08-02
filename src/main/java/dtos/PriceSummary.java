package dtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by merdinmacic on 2/22/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sub_total",
        "total",
        "sub_components"
})
public class PriceSummary {

    @JsonProperty("sub_total")
    private SubTotal subTotal;
    @JsonProperty("total")
    private Total total;
    @JsonProperty("sub_components")
    private List<Object> subComponents = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sub_total")
    public SubTotal getSubTotal() {
        return subTotal;
    }

    @JsonProperty("sub_total")
    public void setSubTotal(SubTotal subTotal) {
        this.subTotal = subTotal;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total total) {
        this.total = total;
    }

    @JsonProperty("sub_components")
    public List<Object> getSubComponents() {
        return subComponents;
    }

    @JsonProperty("sub_components")
    public void setSubComponents(List<Object> subComponents) {
        this.subComponents = subComponents;
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
