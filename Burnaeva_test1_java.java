import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("введи число a");
    int a = scanner.nextInt();
    System.out.println("введи число b");
    int b = scanner.nextInt();
        int sum = a+b;
        int vychet = a-b;
        int umnog = a*b;
        double del = (double)a/b;
  if(a > b) {
    System.out.println("a > b "+", сумма="+sum+", вычитание="+vychet+", умножение="+umnog+" , деление="+del);
  } if(a < b) {
    System.out.println("a < b"+", сумма="+sum+", вычитание="+vychet+", умножение="+umnog+" , деление="+del);
    } if (a == b) {
  System.out.println("a = b"+", сумма="+sum+", вычитание="+vychet+", умножение="+umnog+" , деление="+del);
    }
}
}
