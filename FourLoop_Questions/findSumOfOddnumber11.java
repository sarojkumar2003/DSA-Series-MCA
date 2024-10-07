//Write a progrma to print sum of all odd number between 1 to n

import java.util.Scanner;

public class findSumOfOddnumber11 {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.print("Enter the numebr: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%2==1) {
                sum = sum+i;
                System.out.println(sum);
            }
        }
    }
}
