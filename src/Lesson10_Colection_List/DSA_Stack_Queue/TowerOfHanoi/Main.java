package Lesson10_Colection_List.DSA_Stack_Queue.TowerOfHanoi;

public class Main {
    public static void main(String[] args) {
        int numDisks = 10; // Số lượng đĩa

        // Khởi tạo các cọc
        Tower sourceTower = new Tower(); // Cọc xuất phát
        Tower destinationTower = new Tower(); // Cọc đích
        Tower auxiliaryTower = new Tower(); // Cọc phụ

        // Khởi tạo tháp đĩa ban đầu
        for (int i = numDisks; i >= 1; i--) {
            sourceTower.addDisk(new Disk(i)); // Thêm các đĩa vào cọc xuất phát theo thứ tự giảm dần
        }

        // In ra tình trạng ban đầu
        System.out.println("Tình trạng ban đầu:");
        printTowers(sourceTower, destinationTower, auxiliaryTower); // In tình trạng các cọc

        // Giải quyết bài toán
        solveHanoi(numDisks, sourceTower, destinationTower, auxiliaryTower); // Giải bài toán Tháp Hà Nội

        // In ra tình trạng sau khi giải
        System.out.println("Tình trạng sau khi giải:");
        printTowers(sourceTower, destinationTower, auxiliaryTower); // In tình trạng các cọc
    }

    // Phương thức đệ quy để giải bài toán Tháp Hà Nội
    public static void solveHanoi(int n, Tower sourceTower, Tower destinationTower, Tower auxiliaryTower) {
        if (n == 1) {
            moveDisk(sourceTower, destinationTower); // Di chuyển đĩa duy nhất từ cọc xuất phát đến cọc đích
            return;
        }

        solveHanoi(n - 1, sourceTower, auxiliaryTower, destinationTower); // Di chuyển n-1 đĩa từ cọc xuất phát đến cọc phụ
        moveDisk(sourceTower, destinationTower); // Di chuyển đĩa thứ n từ cọc xuất phát đến cọc đích
        solveHanoi(n - 1, auxiliaryTower, destinationTower, sourceTower); // Di chuyển n-1 đĩa từ cọc phụ đến cọc đích
    }

    // Phương thức di chuyển đĩa từ cọc nguồn sang cọc đích
    public static void moveDisk(Tower sourceTower, Tower destinationTower) {
        if (sourceTower.isEmpty()) {
            throw new RuntimeException("Cannot move disk from empty tower"); // Nếu cọc nguồn rỗng, ném ra ngoại lệ
        }

        Disk topDisk = sourceTower.getTopDisk(); // Lấy đĩa trên cùng từ cọc nguồn

        if (destinationTower.isEmpty() || topDisk.getSize() < destinationTower.getTopDisk().getSize()) {
            sourceTower.moveTopDiskTo(destinationTower); // Nếu cọc đích rỗng hoặc đĩa trên cùng của cọc nguồn nhỏ hơn đĩa trên cùng của cọc đích, di chuyển đĩa
        } else {
            throw new RuntimeException("Cannot place larger disk on top of smaller disk"); // Nếu không, ném ra ngoại lệ
        }
    }

    // Phương thức in tình trạng của các cọc
    public static void printTowers(Tower sourceTower, Tower destinationTower, Tower auxiliaryTower) {
        System.out.println("Cọc xuất phát: " + sourceTower.toString()); // In tình trạng của cọc xuất phát
        System.out.println("Cọc đích: " + destinationTower.toString()); // In tình trạng của cọc đích
        System.out.println("Cọc phụ: " + auxiliaryTower.toString()); // In tình trạng của cọc phụ
    }
}
