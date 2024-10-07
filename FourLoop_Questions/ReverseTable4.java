//Print the Reverse Table

import java.util.Scanner;

public class ReverseTable4 {
   public static void main(String[] args) {
    int n;
    System.out.print("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    n= scanner.nextInt();
    for (int i = 10; i >= 1; i--) {
        System.out.println(n*i);
    }
   } 
}
