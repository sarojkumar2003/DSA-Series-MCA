package Simple_java;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the number A: ");
        int num = sc.nextInt();
        System.out.print("Enter the number B: ");
        int num2 = sc.nextInt();
        int temp =0;
        temp =num;
        num=num2;
        num2=temp;
        System.out.println("num A: "+ num);
        System.out.println("num B: "+ num2);
        
    }
    
}
