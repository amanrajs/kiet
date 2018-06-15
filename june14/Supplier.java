package june14;

/**
 * Created by VISHAL on 14-06-2018.
 */
public class Supplier {

    private int suppId;
    private String sName;
    private Address address;

    public Supplier() {
    }

    public Supplier(int suppId, String sName, Address address) {
        this.suppId = suppId;
        this.sName = sName;
        this.address = address;
    }

    public int getSuppId() {
        return suppId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "suppId=" + suppId +
                ", sName='" + sName + '\'' +
                ", address=" + address +
                '}';
    }
}
