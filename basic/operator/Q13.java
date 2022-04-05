package basic.operator;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.println(num1 + " is lies between 30 to 100 : " + ((num1 > 30) && (num1 < 100)));
    }
}
