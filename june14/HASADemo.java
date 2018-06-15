package june14;

/**
 * Created by VISHAL on 14-06-2018.
 */
public class HASADemo {
    public static void main(String[] args) {

        Supplier supp = new Supplier();
        supp.setSuppId(101);
        supp.setsName("ABC & Co");
        supp.setAddress(new Address("S P Road", "Muradnagar", "Gaziyabad", "222222"));

        System.out.println(supp);
    }
}
