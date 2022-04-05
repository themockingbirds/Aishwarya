package basic.operator;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.println(num1 + " is greater than 50 but less than 100   : " + ((num1 > 50) && (num1 < 100)));
    }
}
