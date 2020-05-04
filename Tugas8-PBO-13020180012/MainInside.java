public class MainInside{
public static void main(String[] args){
test obj1 = new test();
test obj2 = new test();
test obj3 = new test();
obj1.addCounter();
System.out.println("Counter milik obj1 ="+ obj1.getCounter());
System.out.println("Counter milik obj2 ="+ obj2.getCounter());
System.out.println("Counter milik obj3 ="+ obj3.getCounter());
}
} 