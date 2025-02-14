public class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    static {
        name="Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand="";
        price=200;
//		name="Phone";
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }


}