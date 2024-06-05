package lesson16_IO_File.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị tất cả sản phẩm");
                System.out.println("3. Tìm kiếm sản phẩm theo mã");
                System.out.println("4. Xóa sản phẩm theo mã");
                System.out.println("5. Thoát");
                System.out.print("Chọn một tùy chọn: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addProduct(scanner);
                        break;
                    case 2:
                        displayAllProducts();
                        break;
                    case 3:
                        searchProductById(scanner);
                        break;
                    case 4:
                        deleteProductById(scanner);
                        break;
                    case 5:
                        System.out.println("Tạm biệt!");
                        return;
                    default:
                        System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
                }
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, description);
        ProductManager.addProduct(product);
        System.out.println("Sản phẩm đã được thêm thành công.");
    }

    private static void displayAllProducts() {
        List<Product> products = ProductManager.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private static void searchProductById(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = scanner.nextLine();
        Product product = ProductManager.findProductById(id);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã " + id);
        }
    }

    private static void deleteProductById(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        boolean isDeleted = ProductManager.deleteProductById(id);
        if (isDeleted) {
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã " + id);
        }
    }
}
