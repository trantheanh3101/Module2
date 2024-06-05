package TryHard.ProductManager.repository;

import TryHard.ProductManager.model.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductManager{
    private static final String FILE_PATH = "C:\\Users\\admin\\Desktop\\TheanhCode\\Module2\\src\\TryHard\\ProductManager\\repository\\productFile.csv";

    public static ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                if (attributes.length == 3) {
                    Product product = new Product(Integer.parseInt(attributes[0]), attributes[1], Double.parseDouble(attributes[2]));
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

    private void saveAllProduct(ArrayList<Product> products) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
            for (Product product : products){
                bw.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addProduct(Product product) {
        ArrayList<Product> products = getAllProducts();
        products.add(product);
        saveAllProduct(products);
    }

    public void deleteProduct(int id) {
        ArrayList<Product> products = getAllProducts();
        products.removeIf(product -> product.getId() == id);
        saveAllProduct(products);
    }

    public void updateProduct(Product productEdit) {

    }
}
