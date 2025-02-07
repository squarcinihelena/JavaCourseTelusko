public class Main {

    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human( 18, "Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // obj.setage(30);

    }
}