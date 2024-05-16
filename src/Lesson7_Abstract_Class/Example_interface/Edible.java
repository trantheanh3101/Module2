package Lesson7_Abstract_Class.Example_interface;

public interface Edible {
    public String howToEat();
}
class Chicken implements Edible {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String howToEat() {
        return "Fry it";
    }
}
class Duck implements Edible {
    @Override
    public String howToEat() {
        return "Roast it";
    }
}
class Broccoli implements Edible {
    @Override
    public String howToEat() {
        return "Stir-fry it";
    }
}