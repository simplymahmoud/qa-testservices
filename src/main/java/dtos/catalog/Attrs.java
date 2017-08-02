package dtos.catalog;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "colorName",
        "colorFamilyName",
        "targetGender",
        "material"
})
public class Attrs {

    @JsonProperty("colorName")
    private String colorName;
    @JsonProperty("colorFamilyName")
    private String colorFamilyName;
    @JsonProperty("targetGender")
    private String targetGender;
    @JsonProperty("material")
    private String material;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("colorName")
    public String getColorName() {
        return colorName;
    }

    @JsonProperty("colorName")
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @JsonProperty("colorFamilyName")
    public String getColorFamilyName() {
        return colorFamilyName;
    }

    @JsonProperty("colorFamilyName")
    public void setColorFamilyName(String colorFamilyName) {
        this.colorFamilyName = colorFamilyName;
    }

    @JsonProperty("targetGender")
    public String getTargetGender() {
        return targetGender;
    }

    @JsonProperty("targetGender")
    public void setTargetGender(String targetGender) {
        this.targetGender = targetGender;
    }

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
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
