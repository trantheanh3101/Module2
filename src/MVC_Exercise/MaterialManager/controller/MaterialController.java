package MVC_Exercise.MaterialManager.controller;

import MVC_Exercise.MaterialManager.serveces.MaterialServeces;
import MVC_Exercise.MaterialManager.view.MaterialView;

public class MaterialController {
    MaterialView materialView ;
    MaterialServeces materialServeces;

    public MaterialController(MaterialView materialView) {
        this.materialView = materialView;
        this.materialServeces = new MaterialServeces();
    }

    public void run(){
        boolean exit = false;
        while (!exit){
            int choise = materialView.getMenuChoise();
            switch (choise){
                case 1:
                    int options = materialView.getMaterialChoise();
                    switch (options){
                        case 1:
                            materialServeces.addCrispyFlour(materialView);
                            break;
                        case 2:
                            materialServeces.addMeat(materialView);
                            break;
                        default:
                            materialView.getMessenger();
                            break;
                    }
                    break;
                case 2:
                    materialServeces.editMaterial(materialView);
                    break;
                case 3:
                    materialServeces.displayMaterial(materialView);
                    break;
                case 4:
                    materialServeces.deleteMaterial(materialView);
                    break;
                case 5:
                    materialServeces.calculateTotalCost();
                    break;
                case 6:
                    materialServeces.getDiscountDifference();
                    break;
                case 7:
                    materialServeces.sortMaterialsByCost();
                    materialServeces.displayMaterial(materialView);
                case 8:
                    exit = true;
                    break;
                default:
                    materialView.getMessenger();
                    break;
            }
        }
    }
}
