import java.io.*; 
/*
26. WAP to input a age of people and check the voting eligibility,
if he is greater than or equal to 18 then say Excellent You are eligible for vote,
otherwise say Good Luck Next Time. Also if he is eligible for vote check he has voter
ID card or not if not then say him to go and apply for voter ID Card, otherwise Say you can go and vote.
 */
class P58{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int age,ch;
    	System.out.print("Enter your age:  "); 
		age=Integer.parseInt(obj.readLine());
    	if(age>=18){
    		System.out.println("Excellent You are eligible to vote");
    		System.out.print("Do you have a voter id: 1-yes  2-no  :  "); 
			ch=Integer.parseInt(obj.readLine());
			switch(ch){
				case 1:
				System.out.println("Go and vote");
				break;
				case 2:
				System.out.println("Apply for voter id");
				break;
				default:
				System.out.println("Invalid choice");
				break;
			}
    	}
    	else{
    		System.out.println("Good Luck,Next time");
    	}
    }
 }
		
			
		