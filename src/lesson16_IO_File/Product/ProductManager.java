package lesson16_IO_File.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final String FILE_PATH = "C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\lesson16_IO_File\\Product\\product.csv";

    public static void addProduct(Product product) {
        List<Product> products = getAllProducts();
        products.add(product);
        saveAllProducts(products);
    }

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                if (attributes.length == 5) {
                    Product product = new Product(attributes[0], attributes[1], Double.parseDouble(attributes[2]), attributes[3], attributes[4]);
                    products.add(product);
                }
            }
        } catch (FileNotFoundException e) {
            // File not found, return empty list
        } catch (IOException e) {
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

    public static boolean deleteProductById(String id) {
        List<Product> products = getAllProducts();
        boolean isRemoved = products.removeIf(product -> product.getId().equals(id));
        if (isRemoved) {
            saveAllProducts(products);
        }
        return isRemoved;
    }

    private static void saveAllProducts(List<Product> products) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Product product : products) {
                bw.write(product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getManufacturer() + "," + product.getDescription());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
