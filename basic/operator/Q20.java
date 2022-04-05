package basic.operator;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.print("Input 2nd num : ");
        num2 = sc.nextInt();
        System.out.println((num1 < num2) ? num1 + " is Smallest" : num2 + " is Smallest");
    }
}
