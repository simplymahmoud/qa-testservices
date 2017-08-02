package jsonobjects;

public class Address {

    private String type;
    private String user_title;
    private String user_name;
    private String zip_code;
    private String company_name;
    private String mobile_number;
    private String apartment_number;
    private String floor_number;
    private String building_name;
    private String street_name;
    private String area_name;
    private String landmark;
    private String city;
    private String country;
    private String address_name;
    private String gps_lat;
    private String gps_long;
    private boolean is_default;
    private boolean deliverable;

    public Address(){}

    public Address(String type, String user_title, String user_name, String zip_code, String company_name, String mobile_number, String apartment_number,
                   String floor_number, String building_name, String street_name, String area_name, String landmark, String city, String country,
                   String address_name, String gps_lat, String gps_long, boolean is_default, boolean deliverable){

        this.type = type;
        this.user_title = user_title;
        this.user_name = user_name;
        this.zip_code = zip_code;
        this.company_name = company_name;
        this.mobile_number = mobile_number;
        this.apartment_number = apartment_number;
        this.floor_number = floor_number;
        this.building_name = building_name;
        this.street_name = street_name;
        this.area_name = area_name;
        this.landmark = landmark;
        this.city = city;
        this.country = country;
        this.address_name = address_name;
        this.gps_lat = gps_lat;
        this.gps_long = gps_long;
        this.is_default = is_default;
        this.deliverable = deliverable;

    }

    public String getAddress_name() {
        return address_name;
    }

    public String getApartment_number() {
        return apartment_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser_title() {
        return user_title;
    }

    public void setUser_title(String user_title) {
        this.user_title = user_title;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setApartment_number(String apartment_number) {
        this.apartment_number = apartment_number;
    }

    public String getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(String floor_number) {
        this.floor_number = floor_number;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getGps_lat() {
        return gps_lat;
    }

    public void setGps_lat(String gps_lat) {
        this.gps_lat = gps_lat;
    }

    public String getGps_long() {
        return gps_long;
    }

    public void setGps_long(String gps_long) {
        this.gps_long = gps_long;
    }

    public boolean getIsDefault() {
        return is_default;
    }

    public void setIsDefault(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean getDeliverable() {
        return deliverable;
    }

    public void setDeliverable(boolean deliverable) {
        this.deliverable = deliverable;
    }
}
