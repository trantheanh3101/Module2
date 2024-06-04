package MVC_Exercise.MaterialManager.repositories;

import MVC_Exercise.MaterialManager.model.CrispyFlour;
import MVC_Exercise.MaterialManager.model.Material;
import MVC_Exercise.MaterialManager.model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialManager {
    private ArrayList<Material> materials ;

    public MaterialManager() {
        materials = new ArrayList<>();
        materialOrigin();
    }

    public void materialOrigin() {

        // Adding 5 CrispyFlour
        addMaterial(new CrispyFlour("CF1", "Crispy Flour 1", LocalDate.of(2023, 5, 1), 20, 100));
        addMaterial(new CrispyFlour("CF3", "Crispy Flour 3", LocalDate.of(2023, 7, 1), 30, 300));
        addMaterial(new CrispyFlour("CF2", "Crispy Flour 2", LocalDate.of(2023, 6, 1), 25, 200));
        addMaterial(new CrispyFlour("CF4", "Crispy Flour 4", LocalDate.of(2023, 8, 1), 35, 400));
        addMaterial(new CrispyFlour("CF5", "Crispy Flour 5", LocalDate.of(2023, 9, 1), 40, 500));

        // Adding 5 Meat
        addMaterial(new Meat("M1", "Meat 1", LocalDate.of(2024, 5, 22), 100, 10));
        addMaterial(new Meat("M2", "Meat 2", LocalDate.of(2024, 5, 23), 150, 15));
        addMaterial(new Meat("M4", "Meat 4", LocalDate.of(2024, 5, 25), 250, 25));
        addMaterial(new Meat("M3", "Meat 3", LocalDate.of(2024, 5, 24), 200, 20));
        addMaterial(new Meat("M5", "Meat 5", LocalDate.of(2024, 5, 26), 300, 30));
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void removeMaterial(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }
}
