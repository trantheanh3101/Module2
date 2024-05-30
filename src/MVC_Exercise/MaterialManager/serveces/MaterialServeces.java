package MVC_Exercise.MaterialManager.serveces;

import MVC_Exercise.MaterialManager.model.CrispyFlour;
import MVC_Exercise.MaterialManager.model.Material;
import MVC_Exercise.MaterialManager.model.Meat;
import MVC_Exercise.MaterialManager.repositories.MaterialManager;
import MVC_Exercise.MaterialManager.view.MaterialView;

import java.util.ArrayList;
import java.util.Comparator;

public class MaterialServeces {
    MaterialManager materialManager;

    public MaterialServeces() {
        this.materialManager = new MaterialManager();
    }

    public void addCrispyFlour(MaterialView materialView) {
        CrispyFlour crispyFlour = materialView.getDetailCrispyFlour();
        materialManager.addMaterial(crispyFlour);
        materialView.getMessengerOK();
    }

    public void addMeat(MaterialView materialView) {
        Meat meat = materialView.getDetailMeat();
        materialManager.addMaterial(meat);
        materialView.getMessengerOK();
    }

    public void displayMaterial(MaterialView materialView) {
        ArrayList<Material> materialArrayList = materialManager.getMaterials();
        materialView.displayMaterial(materialArrayList);
    }

    public void deleteMaterial(MaterialView materialView) {
        String id = materialView.getIdMaterialbyId();
        materialManager.removeMaterial(id);
        materialView.getMessengerOK();
    }

    public void calculateTotalCost() {
        double total = 0;
        ArrayList<Material> materials = materialManager.getMaterials();
        for (Material material : materials) {
            if (material instanceof Discount) {
                total += ((Discount) material).getRealMoney();
            } else {
                total += material.getAmount();
            }
        }
        System.out.println("Sum cost material : " + total);
    }

    public void getDiscountDifference() {
        double diff =  getTotalAmount() - getTotalDiscountedAmount();
        System.out.println("diff = " + diff);
    }

    public double getTotalAmount() {
        ArrayList<Material> materials = materialManager.getMaterials();
        double total = 0;
        for (Material material : materials) {
            total += material.getAmount();
        }
        return total;
    }

    public double getTotalDiscountedAmount() {
        ArrayList<Material> materials = materialManager.getMaterials();
        double total = 0;
        for (Material material : materials) {
            if (material instanceof Discount) {
                total += ((Discount) material).getRealMoney();
            }
        }
        return total;
    }

    public void sortMaterialsByCost() {
        ArrayList<Material> materials = materialManager.getMaterials();
//        materials.sort(Comparator.comparingInt(Material::getCost));
        materials.sort((m1, m2) -> Integer.compare(m1.getCost(), m2.getCost()));
    }

    public void editMaterial(MaterialView materialView) {
        ArrayList<Material> materials = materialManager.getMaterials();
        String id = materialView.getIdMaterialbyId();
//        Material material = findMateriaById(id);
        for (int i = 0; i < materials.size();i++){
            boolean check = materials.get(i).getId().equals(id);
            if (materials.get(i) instanceof CrispyFlour && check){
                Material newMaterial = materialView.getDetailCrispyFlour();
                materials.set(i,newMaterial);
                materialView.getMessengerOK();
                return;
            }
            if (materials.get(i) instanceof Meat && check){
                Material newMaterial = materialView.getDetailMeat();
                materials.set(i, newMaterial);
                materialView.getMessengerOK();
                return;
            }
        }
        materialView.getMessengerEdit();
    }

    private Material findMateriaById(String id) {
        ArrayList<Material> materials = materialManager.getMaterials();
        for (Material material : materials){
            if (material.getId().equals(id))
                return material;
        }
        return null;
    }


}
