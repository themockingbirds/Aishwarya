//revision set Q1
/*
	1. WAP to create calculator that job to is to convert Degree into Fahrenheit and vice versa. Ask users to input a choice 
	
	Input/Output Format(Case 1):
		1: From Degree To Fahrenheit
		2: From Fahrenheit To Degree

		Input your choice: 1
		Input Temp(in Degree): 34
		34deg. = __F
	Input/Output Format(Case 2): 
		1: From Degree To Fahrenheit
		2: From Fahrenheit To Degree
	
		Input your choice: 2
		Input Temp(in Radial): 34
		34F = __deg.

*/

import java.util.Scanner;
class Q1{
	public static void main(String arg[]){
		int ch;
		float toFahrenheit,toDegree,value,value1;
		Scanner s=new Scanner(System.in);
		System.out.printf("Input your choice- 1: From Degree To Fahrenheit 2: From Fahrenheit To Degree ");
		ch=s.nextInt();
		switch(ch){
			case 1:
			System.out.print("Input Temp(in Degree): ");
			toFahrenheit=s.nextFloat();
			//value=(toFahrenheit)*(5/9)-32;
			value=+(toFahrenheit*9/5)32;
			System.out.println(toFahrenheit+"degree= "+value+" F");
			break;
			case 2:
			System.out.print("Input Temp(in Fahrenheit): ");
			toDegree=s.nextFloat();
			//value1=(toDegree)*(9/5)+32;
			value1=(toDegree-32)*5/9;w
			System.out.println(toDegree+"fahrenheit= "+value1+" deg.");
			break;
			default:
			System.out.println("Invalid input");
			break;
		}
	}
}
			
 