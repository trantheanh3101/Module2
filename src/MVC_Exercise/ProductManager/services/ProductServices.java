package MVC_Exercise.ProductManager.services;


import MVC_Exercise.ProductManager.model.Product;
import MVC_Exercise.ProductManager.repository.ProductManager;
import MVC_Exercise.ProductManager.view.ProductView;

import java.util.ArrayList;

public class ProductServices {
    private ProductManager productManager;

    public ProductServices() {
        this.productManager = new ProductManager();
    }

    public void addProduct(ProductView view) {
        Product product = view.getProductDetails();
        productManager.addProduct(product);
        view.displayMessageOK();
    }

    public void editProduct(ProductView view) {
        int id = view.getProductId();
        Product product = productManager.findProductById(id);
        if (product != null) {
            Product newDetails = view.getProductDetails();
            productManager.updateProduct(id, newDetails);
            view.displayMessageOK();
        } else {
            view.displayMessageNOK();
        }
    }

    public void deleteProduct(ProductView view) {
        int id = view.getProductId();
        productManager.deleteProduct(id);
        view.displayMessageOK();
    }

    public void displayProducts(ProductView view) {
        ArrayList<Product> productList = productManager.getProductList();
        view.displayProductList(productList);
    }

    public void searchProductByName(ProductView view) {
        String name = view.getProductName();
        ArrayList<Product> result = productManager.searchProductByName(name);
        view.displayProductList(result);
    }

    public void sortProductsByPriceAscending(ProductView view) {
        productManager.sortProductsByPriceAscending();
        view.displayMessageSort();
    }

    public void sortProductsByPriceDescending(ProductView view) {
        productManager.sortProductsByPriceDescending();
        view.displayMessageSort();
    }
}
