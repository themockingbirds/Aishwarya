package basic.operator;

import java.util.Scanner;

/*
ASCII VALUE:

 */
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Input (a to z or A to  Z \nor 0-9 or\nany special character like  @ # etc..) : ");
        ch = sc.nextLine().charAt(0);
        String isChar = (
                ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
                        ? ch + " is a character" : ch + " is not a Character"
        );
        System.out.println(isChar);
    }
}