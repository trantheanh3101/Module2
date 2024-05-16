package Lesson7_Abstract_Class.Test_abstract_interface.animal;

import Lesson7_Abstract_Class.Test_abstract_interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howtoEat() {
        return " could be fried ";
    }
}
