//Writa a progrma to print sum of Even numbers.

import java.util.Scanner;

public class sumEven10 {
    public static void main(String[] args) {
        int n; 
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        n=  scanner.nextInt();
        int sum=0;
               
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sum= sum+i;
                System.out.println("The sum of EvenNumber is: "+sum);
            }
        }
    }
}
