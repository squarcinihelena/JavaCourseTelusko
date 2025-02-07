public class Main {
    public static void main(String[] args) {

        Laptop obj=new Laptop();
        obj.model="Lenevo Yoga";
        obj.price=1000;

        Laptop obj2=new Laptop();
        obj2.model="Lenevo Yoga";
        //   	obj2.model="Lenevo Yoga1";
        obj2.price=1000;

        boolean result = obj.equals(obj2);

        System.out.println(obj.toString());
//   	System.out.println(obj);

    }
}