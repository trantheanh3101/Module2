package TryHard.ProductManager.Controller;

import TryHard.ProductManager.services.ProductServices;
import TryHard.ProductManager.view.ProductView;

public class ProductController {
    private ProductServices productServices;
    private ProductView view;

    public ProductController(ProductView view) {
        this.productServices = new ProductServices();
        this.view = view;
    }

    public void start() {
        boolean run = true;
        while (run) {
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    productServices.addProduct(view);
                    break;
                case 2:
                    productServices.editProduct(view);
                    break;
                case 3:
                    productServices.deleteProduct(view);
                    break;
                case 4:
                    productServices.displayProducts(view);
                    break;
                case 5:
                    productServices.searchProductByName(view);
                    break;
                case 6:
//                    productServices.sortProductsByPriceAscending(view);
                    break;
                case 7:
//                    productServices.sortProductsByPriceDescending(view);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    view.displayMessage();
            }
        }
    }
}