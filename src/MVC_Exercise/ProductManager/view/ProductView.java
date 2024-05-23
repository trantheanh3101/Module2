package MVC_Exercise.ProductManager.view;

import MVC_Exercise.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);

    public int getMenuChoice() {
        System.out.println("Product Management System");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Display Products");
        System.out.println("5. Search Product by Name");
        System.out.println("6. Sort Products by Price Ascending");
        System.out.println("7. Sort Products by Price Descending");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public Product getProductDetails() {
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();
        System.out.print("Enter product name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        return new Product(id, name, price);
    }

    public int getProductId() {
        System.out.print("Enter Id of product want to edit id: ");
        return scanner.nextInt();
    }

    public String getProductName() {
        System.out.print("Enter product name: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void displayProductList(ArrayList<Product> productList) {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public void displayMessageOK() {
        System.out.println("successfully.");
    }

    public void displayMessageNOK(){
        System.out.println("Product not found.");
    }

    public void displayMessageSort() {
        System.out.println("Products sorted by price in order.");
    }

    public void displayMessage() {
        System.out.println("Please try again.");
    }
}
