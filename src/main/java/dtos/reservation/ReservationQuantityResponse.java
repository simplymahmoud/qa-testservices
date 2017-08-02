package dtos.reservation;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "available",
        "reserved"
})
public class ReservationQuantityResponse {

    @JsonProperty("available")
    private Integer available;
    @JsonProperty("reserved")
    private Integer reserved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("available")
    public Integer getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Integer available) {
        this.available = available;
    }

    @JsonProperty("reserved")
    public Integer getReserved() {
        return reserved;
    }

    @JsonProperty("reserved")
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
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
