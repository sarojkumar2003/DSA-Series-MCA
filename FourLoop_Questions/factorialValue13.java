//Writa a program to print factorial of a number

import java.util.Scanner;

public class factorialValue13 {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            fact = fact*i;
            System.out.println(fact);              
        }
    }
}
