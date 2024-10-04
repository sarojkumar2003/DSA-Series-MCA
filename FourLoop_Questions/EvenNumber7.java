//Write a progrma to print even number
import java.util.Scanner;

public class EvenNumber7 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
            
        }
    }
}
