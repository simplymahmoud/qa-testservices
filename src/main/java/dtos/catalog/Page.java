package dtos.catalog;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nin",
        "gtin",
        "typeName",
        "familyName",
        "variantOf",
        "name",
        "description",
        "brandName",
        "mainImageName",
        "imageNames",
        "manufacturerPartNumber",
        "msrp",
        "categoryIds",
        "gpcIds",
        "attrs",
        "sellingOfferId",
        "sellingPrice",
        "originalPrice"
})
public class Page {

    @JsonProperty("nin")
    private String nin;
    @JsonProperty("gtin")
    private String gtin;
    @JsonProperty("typeName")
    private String typeName;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("variantOf")
    private String variantOf;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("mainImageName")
    private String mainImageName;
    @JsonProperty("imageNames")
    private List<String> imageNames = null;
    @JsonProperty("manufacturerPartNumber")
    private String manufacturerPartNumber;
    @JsonProperty("msrp")
    private Msrp msrp;
    @JsonProperty("categoryIds")
    private List<String> categoryIds = null;
    @JsonProperty("gpcIds")
    private List<String> gpcIds = null;
    @JsonProperty("attrs")
    private Attrs attrs;
    @JsonProperty("sellingOfferId")
    private String sellingOfferId;
    @JsonProperty("sellingPrice")
    private SellingPrice sellingPrice;
    @JsonProperty("originalPrice")
    private OriginalPrice originalPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nin")
    public String getNin() {
        return nin;
    }

    @JsonProperty("nin")
    public void setNin(String nin) {
        this.nin = nin;
    }

    @JsonProperty("gtin")
    public String getGtin() {
        return gtin;
    }

    @JsonProperty("gtin")
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    @JsonProperty("typeName")
    public String getTypeName() {
        return typeName;
    }

    @JsonProperty("typeName")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("variantOf")
    public String getVariantOf() {
        return variantOf;
    }

    @JsonProperty("variantOf")
    public void setVariantOf(String variantOf) {
        this.variantOf = variantOf;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("mainImageName")
    public String getMainImageName() {
        return mainImageName;
    }

    @JsonProperty("mainImageName")
    public void setMainImageName(String mainImageName) {
        this.mainImageName = mainImageName;
    }

    @JsonProperty("imageNames")
    public List<String> getImageNames() {
        return imageNames;
    }

    @JsonProperty("imageNames")
    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }

    @JsonProperty("manufacturerPartNumber")
    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    @JsonProperty("manufacturerPartNumber")
    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    @JsonProperty("msrp")
    public Msrp getMsrp() {
        return msrp;
    }

    @JsonProperty("msrp")
    public void setMsrp(Msrp msrp) {
        this.msrp = msrp;
    }

    @JsonProperty("categoryIds")
    public List<String> getCategoryIds() {
        return categoryIds;
    }

    @JsonProperty("categoryIds")
    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    @JsonProperty("gpcIds")
    public List<String> getGpcIds() {
        return gpcIds;
    }

    @JsonProperty("gpcIds")
    public void setGpcIds(List<String> gpcIds) {
        this.gpcIds = gpcIds;
    }

    @JsonProperty("attrs")
    public Attrs getAttrs() {
        return attrs;
    }

    @JsonProperty("attrs")
    public void setAttrs(Attrs attrs) {
        this.attrs = attrs;
    }

    @JsonProperty("sellingOfferId")
    public String getSellingOfferId() {
        return sellingOfferId;
    }

    @JsonProperty("sellingOfferId")
    public void setSellingOfferId(String sellingOfferId) {
        this.sellingOfferId = sellingOfferId;
    }

    @JsonProperty("sellingPrice")
    public SellingPrice getSellingPrice() {
        return sellingPrice;
    }

    @JsonProperty("sellingPrice")
    public void setSellingPrice(SellingPrice sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @JsonProperty("originalPrice")
    public OriginalPrice getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("originalPrice")
    public void setOriginalPrice(OriginalPrice originalPrice) {
        this.originalPrice = originalPrice;
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
