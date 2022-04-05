package basic.inputoutput;
//Console Input output  -- not work in IDE

import java.io.Console;
public class _3_Input_p3 {
    public static void main(String[] args) {

    //with Console object--
        Console con = System.console();

        String name1 = con.readLine("Input your Name1: ");

        System.out.print("Input your Name2");
        String name2=con.readLine();

        System.out.println("Name1:  "+name1);
        System.out.println("Name2: "+name2);

    //Without console Object
        System.out.println("Input Full Name");
        name1=System.console().readLine();
        System.out.println("Name : "+name1+name2);

    }
}
