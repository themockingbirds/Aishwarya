package basic.inputoutput;

//scanf()

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1: First receive string from keyboard as you want to read then
 * 	2. Create StringTokenizer object and  pass the string to StringTokenizer, it will be broken
 * 	into piece wherever comma will be found, these pieces will be stored in the StringTokenizer object.
 * 	    StringTokenizer obj_token = new StringTokenizer(strvar, ",");
 * 	3. Collect the individual token from StringTokenizer obj using nextToken() method and convert it into required format.
 */

public class _3_Input_p4 {
    public static void main(String[] args) {
    //step 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name, Age, Salary : ");
        String basic_info=sc.nextLine();

    //step 2
        StringTokenizer st = new StringTokenizer(basic_info,",");
        String name=st.nextToken();
        String age=st.nextToken();
        String salary=st.nextToken();

        name=name.trim(); //combine -- String name=st.nextToken().trim();
        age=age.trim();
        salary=salary.trim();

    //step  3
        String fullName=name;
        int real_age=Integer.parseInt(age);
        float real_salary=Float.parseFloat(salary);

        System.out.println("Name : "+fullName+"\nAge : "+real_age+"\nSalary : "+real_salary);


    }
}
