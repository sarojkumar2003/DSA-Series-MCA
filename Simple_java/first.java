// Java Program to Check Whether a Given Number is Even or Odd

package Simple_java;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num %2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
