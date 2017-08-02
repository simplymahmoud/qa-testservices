package dtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "title",
        "offer_id",
        "nin",
        "old_price",
        "new_price",
        "quantity",
        "image",
        "attributes"
})
public class Item {

    @JsonProperty("name")
    private String name;
    @JsonProperty("title")
    private String title;
    @JsonProperty("offer_id")
    private String offerId;
    @JsonProperty("nin")
    private String nin;
    @JsonProperty("old_price")
    private OldPrice oldPrice;
    @JsonProperty("new_price")
    private NewPrice newPrice;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("attributes")
    private List<Object> attributes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("offer_id")
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty("offer_id")
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    @JsonProperty("nin")
    public String getNin() {
        return nin;
    }

    @JsonProperty("nin")
    public void setNin(String nin) {
        this.nin = nin;
    }

    @JsonProperty("old_price")
    public OldPrice getOldPrice() {
        return oldPrice;
    }

    @JsonProperty("old_price")
    public void setOldPrice(OldPrice oldPrice) {
        this.oldPrice = oldPrice;
    }

    @JsonProperty("new_price")
    public NewPrice getNewPrice() {
        return newPrice;
    }

    @JsonProperty("new_price")
    public void setNewPrice(NewPrice newPrice) {
        this.newPrice = newPrice;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("attributes")
    public List<Object> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
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
