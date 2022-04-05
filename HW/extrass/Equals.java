package HW;

import java.io.*;

class Equals  
{ 
    public static void main(String [] args) throws IOException  
    { 
    	//int a=90;
    	InputStreamReader isr = new InputStreamReader(System.in); 
    	BufferedReader br = new BufferedReader (isr); 
 //BufferedReader bufferName = new BufferedReader (new InputStreamReader(System.in)); 

    //System.out.print("Input your First  Name: ");
    //	String fn = br.read();
       System.out.print("Input your full name: "); 
       String name = br.readLine(); 
       System.out.print("Input your First Char of your Name: "); 
       char ch = (char)br.read(); 
       br.readLine();
       //System.out.println("First Name: "+fn); 
       System.out.println("Full Name: "+name); 
       System.out.println("1st char of your name: "+ch); 
       int roll;
       System.out.print("Input your full name: "); 
       roll = Integer.parseInt(br.readLine());
        System.out.println("roll : "+roll);
    } 
} 