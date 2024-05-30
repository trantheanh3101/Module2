package MVC_Exercise.MaterialManager.controller;

import MVC_Exercise.MaterialManager.view.MaterialView;

public class MainM {
    public static void main(String[] args) {
        MaterialView materialView = new MaterialView();
        MaterialController materialController = new MaterialController(materialView);
        materialController.run();
    }
}
