//revision set Q4
/*
	4. WAP to input a age of people and check the voting eligibility, 
	if he is greater than or equal to 18 then say Excellent You are eligible for
	vote, otherwise say Good Luck Next Time. Also if he is eligible for
	vote check he has voter ID card or not if not then say him to go and
	apply for voter ID Card, otherwise Say you can go and vote.


*/
import java.util.Scanner;
class Q4{
	public static void main(String arg[]){
		int age,ch;
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter your age: ");
		age=s.nextInt();
		if(age>=18){
			System.out.println("Excellent You are eligible for vote");
			System.out.print("Do you have a voter id: (1:yes  2:no) : ");
			ch=s.nextInt();
			switch(ch){
				case 1:
				System.out.println("Go and vote");
				break;
				case 2:
				System.out.println("Apply for voter id");
				break;
			}
		}
		else{
			System.out.println("Good Luck,Next Time");
		}
	}
}