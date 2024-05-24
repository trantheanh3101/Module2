package MVC_Exercise.ProductManager.repository;

import MVC_Exercise.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager{
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
        ArrayList<Product> result = new ArrayList<>();  // boi vi name co the giong nhau nhieu nen tao mang
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public void sortProductsByPriceIncrease() {
//        productList.sort(Comparator.comparingDouble(Product::getPrice));

//        int n = productList.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (productList.get(j).getPrice() > productList.get(j + 1).getPrice()) {
//                    Product temp = productList.get(j);
//                    productList.set(j, productList.get(j + 1));
//                    productList.set(j + 1, temp);
//                }
//            }
//        }

        Collections.sort(productList);
    }

    public void sortProductsByPriceDecrease() {
//        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());

//        int n = productList.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (productList.get(j).getPrice() < productList.get(j + 1).getPrice()) {
//                    Product temp = productList.get(j);
//                    productList.set(j, productList.get(j + 1));
//                    productList.set(j + 1, temp);
//                }
//            }
//        }
        Collections.sort(productList);
        Collections.reverse(productList);
    }
}
