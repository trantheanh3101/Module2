package MVC_Exercise.ProductManager.repository;

import MVC_Exercise.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int id, Product newProduct) {
        Product product = findProductById(id);
        if (product != null) {
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
        }
    }

    public void deleteProduct(int id) {
        Product product = findProductById(id);
        if (product != null) {
            productList.remove(product);
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> searchProductByName(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public void sortProductsByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductsByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
