package Simple_java;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        int a=5; int b= 15; int c =15;
        if (a>b) {
            System.out.println(a);
        }
        if (b>c) {
            System.out.println(b);
        }
        if (c>a) {
            System.out.println(c);
        }
        if (a==b || b==c || c==a) {
            System.out.println("Number is same");
        }
    }
}
