package basic.conditional_statement;

import java.util.Scanner;

public class _1_SwitchOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number(1 to 3): ");
        int weekDays = sc.nextInt();
        switch (weekDays) {
            case 1:
                System.out.println("I am");
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("I am");
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("I am");
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
