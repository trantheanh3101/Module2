package TryHard.ProductManager.Controller;

import TryHard.ProductManager.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);
        controller.start();
    }
}
