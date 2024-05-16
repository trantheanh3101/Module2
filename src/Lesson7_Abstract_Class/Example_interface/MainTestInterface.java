package Lesson7_Abstract_Class.Example_interface;

public class MainTestInterface {
    public static void main(String[] args) {
        Edible stuff = new Chicken("ga tay ");

        System.out.println("How to eat " + ((Chicken) stuff).getName() + stuff.howToEat());
//
//        eat(stuff);
//        stuff = new Duck();
//        eat(stuff);
//        stuff = new Broccoli();
//        eat(stuff);
    }
//    public static void eat(Edible animal) {
//        String ani =  animal.howToEat();
//        System.out.println("how to est : " + ani);
//    }
}
