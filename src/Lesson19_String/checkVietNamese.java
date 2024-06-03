package Lesson19_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkVietNamese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        Boolean result = checkVietnameseName(name);
        if (result){
            String nameEdit = toUpperCase(name);
            System.out.println("Result : " + nameEdit);
        } else {
            System.out.println("Name no good");
        }
    }
    public static String toUpperCase(String name){
        String[] strings = name.trim().split("\\s+");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0,1).toUpperCase() + strings[i].substring(1);
        }
        name = String.join(" ",strings);
        return name;
    }
    public static Boolean checkVietnameseName(String name) {
        String regex = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĐđỲỳẢảẤấẦầẨẩẪẫẬậẮắẰằẲẳẴẵẶặẸẹẺẻẼẽỀềỂểỄễỆệỈỉỊịỌọỎỏỐốỒồỔổỖỗỘộỚớỜờỞởỠỡỢợỤụỦủỨứỪừỬửỮữỰựỶỷỸỹ][a-zàáâãèéêìíòóôõùúýđỳảấầẩẫậắằẳặéèếềểễệíìỉịóòỏọốồổỗộớờởợúùủụưứừửữựỷỳỹ]+(\\s+[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĐđỲỳẢảẤấẦầẨẩẪẫẬậẮắẰằẲẳẴẵẶặẸẹẺẻẼẽỀềỂểỄễỆệỈỉỊịỌọỎỏỐốỒồỔổỖỗỘộỚớỜờỞởỠỡỢợỤụỦủỨứỪừỬửỮữỰựỶỷỸỹ][a-zàáâãèéêìíòóôõùúýđỳảấầẩẫậắằẳặéèếềểễệíìỉịóòỏọốồổỗộớờởợúùủụưứừửữựỷỳỹ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }
}
