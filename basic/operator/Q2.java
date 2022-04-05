package basic.operator;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Input 1st num : ");
        num1 = sc.nextInt();

        System.out.println(
                "Square of " + num1 + "is" + num1 * num1 +
                        "\nCube of " + num1 + "is" + num1 * num1 * num1
        );

    }
}
