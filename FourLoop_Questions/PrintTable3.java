//Write to print table

import java.util.Scanner;

public class PrintTable3 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +"*"+i+"="+ n*i);
        }
    }
}
