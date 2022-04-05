import java.io.*; 
/*
	28. Ask user to enter name,  age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
		○ if employee is female, then she will work only in urban areas.

		○ if employee is a male and age is in between 20 to 40 then he may work in anywhere

		○ if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

		○ And any other input of age should print "ERROR".

 */
class P60{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	String name;
    	int age;
    	char gender,isMarried;
    	System.out.print("Enter your name:  "); 
		name = obj.readLine(); 
    	System.out.print("Enter your age:  "); 
		age=Integer.parseInt(obj.readLine());
		System.out.print("Enter your gender(M/F):  "); 
		gender = (char)obj.read(); 
		obj.readLine();
		System.out.print("Are you married?(Y/N):  "); 
		isMarried = (char)obj.read(); 
		if(gender=='F'){
			System.out.println("\nUrban areas");
		}
		else if(gender=='M'&&(age>20&&age<40)){
			System.out.println("\nAnywhere");
		}
		else if(gender=='M'&&(age>=40&&age<=60)){
			System.out.println("\nUrban areas");
		}
		else if(gender=='M'&&(age<=20&&age>=61)){
			System.out.println("\nError");
		}	
		
	}
}
			
		
		
		