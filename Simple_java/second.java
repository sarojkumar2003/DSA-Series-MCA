// Java Program to Find the Sum of Even and Odd Numbers

package Simple_java;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int sumE = 0; int sumO = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (num%2==0) {
                sumE = sumE+i;
                System.out.println("Number is:"+ sumE);
            }
            if (num%2!=0) {
                sumO = sumO+i;
                System.out.println("Number is:"+ sumO); 
            }
              
        }
        
    }
}
