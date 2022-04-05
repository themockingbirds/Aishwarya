import java.io.*; 
/*
	24. WAP to input the marks of 5 subject(Science, SST, Math, ENG, Hindi) and find the % and grades
		a. below 25% - Grade F
		b. 25 to 45 - E
		c. 46 to 50 -D
		d. 51 to 60 - C
		e. 61 to 80 - B
		f. above 80 - A

 */
class P56{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	float sc,h,m,sst,e,percentage;
		System.out.print("English: "); 
		e=Float.parseFloat(obj.readLine());
		System.out.print("Maths: "); 
		m=Float.parseFloat(obj.readLine());
		System.out.print("Hindi: "); 
		h=Float.parseFloat(obj.readLine());
		System.out.print("SST: "); 
		sst=Float.parseFloat(obj.readLine());
		System.out.print("science: "); 
		sc=Float.parseFloat(obj.readLine());
		percentage=((sc+h+m+sst+e)/500)*100;
		if(percentage>80){
			System.out.println("Grade A");
		}
		else if(percentage>=61&&percentage<=80){
			System.out.println("Grade B");
		}
		else if(percentage>=51&&percentage<=60){
			System.out.println("Grade C");
		}
		else if(percentage>=46&&percentage<=50){
			System.out.println("Grade D");
		}
		else if(percentage>=25&&percentage<=45){
			System.out.println("Grade E");
		}
		else{
			System.out.println("Grade F");
		}
	}
}
			
			
			
			
			
			
			
			
			
			
		