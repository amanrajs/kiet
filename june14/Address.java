package june14;

/**
 * Created by VISHAL on 14-06-2018.
 */
public class Address {

    private String street, area, city, pincode;

    public Address() {
    }

    public Address(String street, String area, String city, String pincode) {
        this.street = street;
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Address : " +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode;
    }
}
