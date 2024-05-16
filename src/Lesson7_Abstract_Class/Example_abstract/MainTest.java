package Lesson7_Abstract_Class.Example_abstract;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = new Chicken();
//        eat(animal);
        System.out.println(animal.howToEat());
        animal = new Duck();
        System.out.println( animal.howToEat());
//        eat(animal);
    }
//    public static void eat(Animal ani) {
//        String howToEat = ani.howToEat();
//        System.out.println("How to eat: " + howToEat);
//    }
}
