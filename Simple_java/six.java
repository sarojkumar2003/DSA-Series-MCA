package Simple_java;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num%5==0) {
            System.out.println("Number is Divisible by 5: "+ num);
        }else{
            System.out.println("number is not divisible by 5: "+ num);
        }
           
        
    }
}
