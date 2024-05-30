package MVC_Exercise.MaterialManager.model;

import MVC_Exercise.MaterialManager.serveces.Discount;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat:        " +
                super.toString() +
                " weight=" + weight ;
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if (getExpiryDate().isBefore(now.plusDays(5))){
            return getAmount() * 0.7;
        } else {
            return getCost() * 0.9;
        }
    }
}
