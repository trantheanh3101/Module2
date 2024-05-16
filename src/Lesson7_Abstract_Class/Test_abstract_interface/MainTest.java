package Lesson7_Abstract_Class.Test_abstract_interface;


import Lesson7_Abstract_Class.Test_abstract_interface.animal.Animal;
import Lesson7_Abstract_Class.Test_abstract_interface.animal.Chicken;
import Lesson7_Abstract_Class.Test_abstract_interface.animal.Tiger;
import Lesson7_Abstract_Class.Test_abstract_interface.fruit.Apple;
import Lesson7_Abstract_Class.Test_abstract_interface.fruit.Fruit;
import Lesson7_Abstract_Class.Test_abstract_interface.fruit.Orange;
import Lesson7_Abstract_Class.Test_abstract_interface.edible.Edible;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals = new  Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howtoEat());
        }
    }
}
