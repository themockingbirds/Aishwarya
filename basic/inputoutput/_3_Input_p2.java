//Buffer Read Input..

package basic.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_Input_p2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr_obj = new InputStreamReader(System.in);
        BufferedReader br_obj=new BufferedReader(isr_obj);
        String name;

        //String Input--
        System.out.print("Input your full name: ");
         name = br_obj.readLine();

        //Char Input--
        System.out.print("Input your First Char of your Name: ");
        char ch = (char)br_obj.read();

        System.out.println("Name: "+name);
        System.out.println("1st char of your name: "+ch);

        br_obj.readLine();

    //Integer Input
            //String str_age = br.readLine();
            //int age = Integer.parseInt(str);

    // Combined Form
        System.out.print("INPUT AGE : ");
        int age = Integer.parseInt(br_obj.readLine());
        System.out.println("Age : "+age);
    //Float Input--
        System.out.println("INPUT SALARY : ");
        float salary =Float.parseFloat(br_obj.readLine());
        System.out.println("Salary :  "+salary);

    //Double Input--
        System.out.println("INPUT TOTAL POPULATION : ");
        double  population = Double.parseDouble(br_obj.readLine());
        System.out.println("Total Population : "+population);

    //Boolean
        System.out.println("INPUT YOUR MARTIAL STATUS : ");
        boolean isMarried = Boolean.parseBoolean(br_obj.readLine());
        System.out.println("Are you Married : "+isMarried);

    }
}
