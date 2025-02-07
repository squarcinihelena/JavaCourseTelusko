public class Main {
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//
//    	System.out.println(i);

//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();

        A obj = new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}