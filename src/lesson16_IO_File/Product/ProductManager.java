package lesson16_IO_File.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final String FILE_PATH = "C:\\Users\\Theanh36\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\Product\\product.csv";

    public static void addProduct(Product product) {
        List<Product> products = getAllProducts();
        products.add(product);
        saveAllProducts(products);
    }

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            products = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File not found, return empty list
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static Product findProductById(String id) {
        List<Product> products = getAllProducts();
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    private static void saveAllProducts(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
