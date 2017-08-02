package dtos;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "type",
        "user_title",
        "user_name",
        "zip_code",
        "company_name",
        "mobile_number",
        "apartment_number",
        "floor_number",
        "building_name",
        "area_name",
        "landmark",
        "city",
        "country",
        "gps_lat",
        "gps_long",
        "is_default",
        "is_deliverable"
})
public class ShippingAddress {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user_title")
    private String userTitle;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("mobile_number")
    private String mobileNumber;
    @JsonProperty("apartment_number")
    private String apartmentNumber;
    @JsonProperty("floor_number")
    private String floorNumber;
    @JsonProperty("building_name")
    private String buildingName;
    @JsonProperty("area_name")
    private String areaName;
    @JsonProperty("landmark")
    private String landmark;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("gps_lat")
    private String gpsLat;
    @JsonProperty("gps_long")
    private String gpsLong;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("is_deliverable")
    private Boolean isDeliverable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("user_title")
    public String getUserTitle() {
        return userTitle;
    }

    @JsonProperty("user_title")
    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    @JsonProperty("user_name")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("company_name")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobile_number")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("apartment_number")
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    @JsonProperty("apartment_number")
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @JsonProperty("floor_number")
    public String getFloorNumber() {
        return floorNumber;
    }

    @JsonProperty("floor_number")
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @JsonProperty("building_name")
    public String getBuildingName() {
        return buildingName;
    }

    @JsonProperty("building_name")
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @JsonProperty("area_name")
    public String getAreaName() {
        return areaName;
    }

    @JsonProperty("area_name")
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @JsonProperty("landmark")
    public String getLandmark() {
        return landmark;
    }

    @JsonProperty("landmark")
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("gps_lat")
    public String getGpsLat() {
        return gpsLat;
    }

    @JsonProperty("gps_lat")
    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    @JsonProperty("gps_long")
    public String getGpsLong() {
        return gpsLong;
    }

    @JsonProperty("gps_long")
    public void setGpsLong(String gpsLong) {
        this.gpsLong = gpsLong;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("is_deliverable")
    public Boolean getIsDeliverable() {
        return isDeliverable;
    }

    @JsonProperty("is_deliverable")
    public void setIsDeliverable(Boolean isDeliverable) {
        this.isDeliverable = isDeliverable;
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
