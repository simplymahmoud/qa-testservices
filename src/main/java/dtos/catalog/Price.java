package dtos.catalog;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "label",
        "id",
        "min",
        "max",
        "selectedMin",
        "selectedMax"
})
public class Price {

    @JsonProperty("label")
    private String label;
    @JsonProperty("id")
    private String id;
    @JsonProperty("min")
    private Integer min;
    @JsonProperty("max")
    private Integer max;
    @JsonProperty("selectedMin")
    private Integer selectedMin;
    @JsonProperty("selectedMax")
    private Integer selectedMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    @JsonProperty("selectedMin")
    public Integer getSelectedMin() {
        return selectedMin;
    }

    @JsonProperty("selectedMin")
    public void setSelectedMin(Integer selectedMin) {
        this.selectedMin = selectedMin;
    }

    @JsonProperty("selectedMax")
    public Integer getSelectedMax() {
        return selectedMax;
    }

    @JsonProperty("selectedMax")
    public void setSelectedMax(Integer selectedMax) {
        this.selectedMax = selectedMax;
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
