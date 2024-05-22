package Lesson10_Colection_List.DSA_Stack_Queue.TowerOfHanoi;

import java.util.ArrayList;

public class Tower {
    private ArrayList<Disk> disks; // Danh sách các đĩa trong tháp

    public Tower() {
        this.disks = new ArrayList<>(); // Khởi tạo danh sách đĩa rỗng
    }

    public boolean isEmpty() {
        return disks.isEmpty(); // Kiểm tra tháp có rỗng hay không
    }

    public Disk getTopDisk() {
        if (isEmpty()) {
            return null; // Nếu tháp rỗng, trả về null
        }
        return disks.get(disks.size() - 1); // Trả về đĩa trên cùng của tháp
    }

    public void addDisk(Disk disk) {
        disks.add(disk); // Thêm đĩa vào đỉnh tháp
    }

    public Disk removeTopDisk() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove disk from empty tower"); // Nếu tháp rỗng, ném ra ngoại lệ
        }
        return disks.remove(disks.size() - 1); // Loại bỏ và trả về đĩa trên cùng của tháp
    }

    public void moveTopDiskTo(Tower destinationTower) {
        Disk topDisk = this.removeTopDisk(); // Loại bỏ đĩa trên cùng của tháp hiện tại
        destinationTower.addDisk(topDisk); // Thêm đĩa này vào tháp đích
    }

    @Override
    public String toString() {
        if (disks.isEmpty()) {
            return ""; // Nếu tháp rỗng, trả về chuỗi rỗng
        }
        StringBuilder sb = new StringBuilder();
        for (int i = disks.size() - 1; i >= 0; i--) {
            sb.append(disks.get(i).getSize()).append(" "); // Thêm kích thước của từng đĩa vào chuỗi
        }
        return sb.toString().trim(); // Trả về chuỗi đại diện cho các đĩa trong tháp, cách nhau bởi dấu cách
    }
}

