import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch_Ex {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        try {
            arr[0] = 8;
            for (int i = 1; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e + "\n");
        } finally {
            for (int i = 0; i < 5; i++) {
                System.out.printf("arr[%d]: %d\n", i, arr[i]);
            }
        }
    }
}