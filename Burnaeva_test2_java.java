import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("введи строку a");
    String a = scanner.nextLine();
    System.out.println("введи строку b");
    String b = scanner.nextLine();
        Boolean isMatch = (a.equals(b));
        if (isMatch == true) {
             System.out.println("строки идентичны");
        } else {
            System.out.println("строки неидентичны");
        }
    }
 }
