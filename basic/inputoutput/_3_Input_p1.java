package basic.inputoutput;
import java.util.Scanner;
 class _3_Input_p1 {
    public static void main(String[] args){
        String name,full_name, title;
        char gender;
        int id,age;
        float monthly_income;
        double annual_income;
        boolean isMarried;
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
       int a=sc.nextInt();
        sc.nextLine();  //to fix error that generally occurs when we try to get input string just after integer input.
                        //if  we will not use this, it will skip the new line character, and we will not able to take
                        //string input.
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.println("Name : "+name);
        System.out.println("a :"+a);
        //System.out.println("\033[H\033[2"); == nor working, used to clear the console.
        //System.out.println('\u000C'); also not worked

        System.out.println("Input the following Data: ");
        System.out.print("Title (Mr./Mrs.) : ");
        title=sc.next();
        sc.nextLine();
        System.out.print("Full Name : ");
        full_name=sc.nextLine();
        System.out.print("ID No :");
        id=sc.nextInt();
        System.out.print("Age : ");
        age= sc.nextInt();
        System.out.print("Monthly Income :  ");
        monthly_income=sc.nextFloat();
        System.out.print("Annual Income :  ");
        annual_income=sc.nextDouble();
        sc.nextLine();
        System.out.print("Input Gender (M: Male\nF:Female)\n: ");
        gender=sc.nextLine().charAt(0);

        System.out.print("Are you married : ");
        isMarried=sc.nextBoolean();

        System.out.println("Name : "+title+" "+full_name+"\nId : "+id+"\nGender : "+gender+
                "\nAge : "+age+"\nMonthly Income : "+monthly_income+
                "\nAnnual Income : "+annual_income+ "\nMartial Status : "+isMarried
        );
    }
}
