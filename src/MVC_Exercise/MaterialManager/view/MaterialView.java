package MVC_Exercise.MaterialManager.view;

import MVC_Exercise.MaterialManager.model.CrispyFlour;
import MVC_Exercise.MaterialManager.model.Material;
import MVC_Exercise.MaterialManager.model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MaterialView {
    Scanner sc = new Scanner(System.in);

    public int getMenuChoise(){
        System.out.println("-------------Employee Menu---------------");
        System.out.println("-------------1.Add Material-------------");
        System.out.println("-------------2.Edit Material-------------");
        System.out.println("-------------3.Display Material-------------");
        System.out.println("-------------4.Delete Material.-------------");
        System.out.println("-------------5.Sum cost Material.-------------");
        System.out.println("-------------6.chênh lệch Discount.-------------");
        System.out.println("-------------7.Sort by Cost.-------------");
        System.out.println("-------------8.Exit programing.-------------");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int getMaterialChoise() {
        System.out.println("-------------Employee Menu---------------");
        System.out.println("-------------1.CrispyFlour-------------");
        System.out.println("-------------2.Meat-------------");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void getMessenger() {
        System.out.println("choise again !!!");
    }

    public void getMessengerOK() {
        System.out.println("Thanh cong");
    }

    public CrispyFlour getDetailCrispyFlour() {
        System.out.println("Enter id : ");
        String id = sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter manufacturingDate(year/month/day) : ");
        int years = Integer.parseInt(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        LocalDate manufacturingDate = LocalDate.of(years,months,days);
        System.out.println("Enter cost : ");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter quantity : ");
        int quantity = Integer.parseInt(sc.nextLine());
        return new CrispyFlour(id,name,manufacturingDate,cost,quantity);
    }

    public Meat getDetailMeat() {
        System.out.println("Enter id : ");
        String id = sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter manufacturingDate(year/month/day) : ");
        int years = Integer.parseInt(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        LocalDate manufacturingDate = LocalDate.of(years,months,days);
        System.out.println("Enter cost : ");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter weight : ");
        double weight = Double.parseDouble(sc.nextLine());
        return new Meat(id,name,manufacturingDate,cost,weight);
    }

    public void displayMaterial(ArrayList<Material> materialArrayList) {
        if (materialArrayList.isEmpty()) {
            System.out.println("There are no material in the database");
        } else {
            for (Material material : materialArrayList) {
                System.out.println(material);
            }
        }
    }

    public String getIdMaterialbyId() {
        System.out.println("Id material want to delete: ");
        String id = sc.nextLine();
        return id;
    }

    public void getMessengerEdit() {
        System.out.println("There are no material in the database");
    }
}
