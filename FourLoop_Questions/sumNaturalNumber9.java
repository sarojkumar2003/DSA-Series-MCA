//Write a progrma to print the sum of natural Number
import java.util.Scanner;

public class sumNaturalNumber9 {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            sum= sum+i;
            System.out.println(sum);
        }
    }
}
