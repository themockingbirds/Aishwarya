package basic.operator;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.println(num1 + " is +ive or -ive : " + ((num1 > 0) ? "+ive" : "-ive"));
    }
}
