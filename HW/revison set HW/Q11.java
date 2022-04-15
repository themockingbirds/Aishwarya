//revision set Q11

import java.util.Scanner; 
class Q11{ 
    public static void main(String args[]){ 
    	Scanner s=new Scanner(System.in);
    	String name,illness,doa;
    	char gender,ward;
    	int size,age,bed;
    	System.out.print("Size of array: ");
    	size=s.nextInt();
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
			System.out.print("Name: ");
			name[i]=s.nextLine();
			s.nextLine();
			System.out.print("Age: ");
			age[i]=s.nextInt();
			s.nextLine();
			System.out.print("Gender: ");
			gender[i]=s.next().charAt(0);
			System.out.print("Ward: ");
			ward[i]=s.next().charAt(0);
			System.out.print("Bed: ");
			bed[i]=s.nextInt();
			s.nextLine();
			System.out.print("Illness: ");
			illness[i]=s.nextLine();
			System.out.print("Admission date: ");
			doa[i]=s.nextLine();
		}
		System.out.println("---------------------------------------------------");
		for(int i=0;i<size;i++){
			System.out.println("Name of the patient : "+name);
			System.out.println("Age f the patient : "+age);
			System.out.print("Gender : "+gender);
			System.out.print("Ward number : "+ward);
			System.out.print("Bed number : "+bed);
			System.out.print("Nature of Illness : "+illness);
			System.out.print("Date of admission : "+doa);
		}
			
			
		
	}
}
    	