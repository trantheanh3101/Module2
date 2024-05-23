package MVC_Exercise.ProductManager.Controller;

import MVC_Exercise.ProductManager.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);
        controller.start();
    }
}
