package TryHard.String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_duplicate_characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("String : ");
        String string = scanner.nextLine();

        char[] chars = string.toCharArray();

        HashMap<Character,Integer> hashMap = demItem(chars);
        System.out.print("\nkey vs value : ");
        System.out.println(hashMap);

        System.out.println("Các phần tử trùng lặp: ");
        hashMap.entrySet().forEach(element -> {
            if (element.getValue() != 1){
                System.out.println(element.getKey() + " : " + element.getValue() + " lần");
            }
        });
    }

    public static HashMap<Character,Integer> demItem(char[] array){
        HashMap<Character,Integer> countElement = new HashMap<>();
        int count;
        for (Character element : array){
            if (countElement.containsKey(element)){
                count = countElement.get(element);
                countElement.put(element,count + 1);
            } else {
                countElement.put(element,1);
            }
        }
        return countElement;
    }
}
