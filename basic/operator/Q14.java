package basic.operator;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.println(num1 + " is either equal to 30 or 40 : " + ((num1 == 30) || (num1 == 40)));
    }
}

