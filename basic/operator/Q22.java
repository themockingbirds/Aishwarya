package basic.operator;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();
        System.out.print("Input 2nd num : ");
        num2 = sc.nextInt();
        System.out.print("Input 3rd num : ");
        int num3 = sc.nextInt();
        String findGreatest = (num1 > num2) && (num1 > num3) ? num1 + " is Greatest" :
                (num2 > num1) && (num2 > num3) ? num2 + " is Greatest" : num3 + " is Greatest";
        System.out.println(findGreatest);
    }
}
