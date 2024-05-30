package MVC_Exercise.MaterialManager.model;

import MVC_Exercise.MaterialManager.serveces.Discount;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour: " +
                super.toString() +
                " quantity=" + quantity ;
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if (getExpiryDate().isBefore(now.plusMonths(4))){
            return getAmount() * 0.8;
        } else {
            return getAmount() * 0.95;
        }
    }
}
