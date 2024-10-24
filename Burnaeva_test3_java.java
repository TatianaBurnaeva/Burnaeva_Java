import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[ ] decima = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        
        for (int t: decima) {
            if (t%2 != 0) continue;
            System.out.println(t); 
        }
    }
 }
