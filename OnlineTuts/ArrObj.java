import java.util.*;
class ArrObj{
	int age, weight;
	String name;
	public static void main(String arg[]){
		
		int size=100;
		ArrObj obj[]=new ArrObj[size];
		
		/*
		for(int i=0;i<3;i++){
			obj[i]=new ArrObj();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++){
			obj[i]=new ArrObj();
			System.out.print("Name: ");   
			obj[i].name=sc.nextLine();
			System.out.print("Weight: ");   
			obj[i].weight=sc.nextInt();
			System.out.print("Age: ");   
			obj[i].age=sc.nextInt();
			sc.nextLine();
		}
			
		
		//display
		for(int i=0;i<3;i++){
			System.out.println("Name: "+obj[i].name);
			System.out.println("Age: "+obj[i].age);
			System.out.println("Weight: "+obj[i].weight);   
			System.out.println("========================================= ");   
		}
	}
}
	