package basic.inputoutput;
public class _2_Output_p1 {
    public static void main(String[] args) {
        System.out.println("Hi, Welcome TO Java World");
        System.out.print("Hi, There");
        System.out.println();
        System.out.printf("Help %d times\nWorlds", 5);
        String firstName = "Hello", lastName = "World";
        System.out.println(firstName + lastName);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("First Name : " + firstName + " Last Name : " + lastName);
        System.out.println("Full Name : " + firstName + " " + lastName);
        System.out.printf("First Name : %s  Last Name : %s", firstName, lastName);
    }
}