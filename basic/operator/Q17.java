package basic.operator;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.println(num1 + " is Even or Odd : " + ((num1 % 2 == 0) ? "Even" : "Odd"));
    }
}
