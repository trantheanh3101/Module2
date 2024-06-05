package TryHard.ProductManager.services;

import TryHard.ProductManager.model.Product;
import TryHard.ProductManager.repository.ProductManager;
import TryHard.ProductManager.view.ProductView;

import java.util.ArrayList;

public class ProductServices {
    private ProductView view;
    private ProductManager productManager;

    public ProductServices() {
        productManager = new ProductManager();
    }

    public boolean checkID(int id){
        ArrayList<Product> products = ProductManager.getAllProducts();
        boolean exists = products.stream().anyMatch(product -> product.getId() == id );
        if (exists) return true;
        return false;
    }

    public void addProduct(ProductView view) {
        while (true){
            Product product = view.getProductDetails();
            if (!checkID(product.getId())){
                productManager.addProduct(product);
                view.displayMessageOK();
                break;
            } else {
                view.getMessID();
            }
        }
    }

    public void displayProducts(ProductView view) {
        ArrayList<Product> products = ProductManager.getAllProducts();
        if (products.isEmpty()) {
            view.getMessDisplay();
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void deleteProduct(ProductView view) {
        ArrayList<Product> products = ProductManager.getAllProducts();
        int id = view.getProductId();
        boolean exists = products.stream().anyMatch(product -> product.getId() == id);
        if (exists){
            productManager.deleteProduct(id);
            view.displayMessageOK();
        } else
            view.displayMessageNOK();
    }

    public void searchProductByName(ProductView view) {
        ArrayList<Product> products = ProductManager.getAllProducts();
        String name = view.getProductName();
        boolean exists = products.stream().anyMatch(product -> product.getName().equals(name));
        if (exists){
//            ArrayList<Product> productsByName = new ArrayList<>();
            for (Product product : products){
                if (product.getName().equalsIgnoreCase(name))
                    System.out.println(product);
            }
        } else
            view.displayMessageNOK();
    }

    public void editProduct(ProductView view) {
        while (true){
            int id = view.getProductId();
            if (checkID(id)){
//                Product productEdit = view.getUpdateProductDetails(id);
//                productManager.updateProduct(productEdit);
                break;
            } else {
                view.displayMessageNOK();
            }
        }
    }
}
