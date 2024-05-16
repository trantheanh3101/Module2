package Lesson7_Abstract_Class.Example_abstract;

 abstract class Animal {
     public abstract String howToEat();
 }

 class Chicken extends Animal {
     @Override
     public String howToEat() {
         return "Fry it";
     }
 }

 class Duck extends Animal {
     @Override
     public String howToEat() {
         return "Roast it";
     }
 }