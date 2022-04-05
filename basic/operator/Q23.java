package basic.operator;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.print("Input 2nd num : ");
        num2 = sc.nextInt();
        System.out.print("Input 3rd num : ");
        int num3 = sc.nextInt();
        String findSmallest = (num1 < num2) && (num1 < num3) ? num1 + " is smallest" :
                (num2 < num1) && (num2 < num3) ? num2 + " is Smallest" : num3 + " is Smallest";
        System.out.println(findSmallest);

    }
}

