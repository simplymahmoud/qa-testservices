package dtos.catalog;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalHits",
        "page",
        "facets"
})
public class SearchOfferedProductsByResponse {

    @JsonProperty("totalHits")
    private Integer totalHits;
    @JsonProperty("page")
    private List<Page> page = null;
    @JsonProperty("facets")
    private Facets facets;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalHits")
    public Integer getTotalHits() {
        return totalHits;
    }

    @JsonProperty("totalHits")
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    @JsonProperty("page")
    public List<Page> getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(List<Page> page) {
        this.page = page;
    }

    @JsonProperty("facets")
    public Facets getFacets() {
        return facets;
    }

    @JsonProperty("facets")
    public void setFacets(Facets facets) {
        this.facets = facets;
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