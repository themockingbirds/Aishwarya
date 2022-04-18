//revision set Q11
/*

		name of patient
		sex
		age
		ward number
		bed number
		nature of illness
date of admission
*/

import java.util.Scanner; 
class Q11{
	String  sex, name, ill;
	int age, wardNo,bedNo;
	
  public static void main(String args[]){
    int max =100,i=0;
    Scanner sc = new Scanner(System.in);
    Q11 obj[] = new Q11[max];
    	
    System.out.print("Entered No of Record You Want to Input: ");
    int size=sc.nextInt();
    sc.nextLine();
    for(i=0;i<size;i++){
    	obj[i]=new Q11();
    
    	System.out.print("Name Of Patient : ");
    	obj[i].name=sc.nextLine();
    	
    	System.out.print("Age :");
    	obj[i].age=sc.nextInt();
    	sc.nextLine();
    	
    	System.out.print("Sex : ");
    	obj[i].sex=sc.nextLine();
    	
    	System.out.print("Nature Of Illness : ");
    	obj[i].ill=sc.nextLine();
    	
    	System.out.print("Ward No :");
    	obj[i].wardNo=sc.nextInt();
    	
    	System.out.print("Bed No :");
    	obj[i].bedNo=sc.nextInt();
    	sc.nextLine();
    }
    
    for(i=0;i<size;i++){
    	
    	System.out.println("Name Of Patient : "+obj[i].name);
    	System.out.println("Age :"+obj[i].age);
    	System.out.print("Sex : "+obj[i].sex);
    	System.out.println("Nature Of Illness : "+obj[i].ill);
    	System.out.println("Ward No :"+obj[i].wardNo);
    	System.out.println("Bed No :"+obj[i].bedNo);
    }
    
    
    //insert new record
    char ch;
    
    i=size;
    do{  
    	obj[i]=new Q11();
    	System.out.print("Name Of Patient : ");
    	obj[i].name=sc.nextLine();
    	
    	System.out.print("Age :");
    	obj[i].age=sc.nextInt();
    	sc.nextLine();
    	
    	System.out.print("Sex : ");
    	obj[i].sex=sc.nextLine();
    	
    	System.out.print("Nature Of Illness : ");
    	obj[i].ill=sc.nextLine();
    	
    	System.out.print("Ward No :");
    	obj[i].wardNo=sc.nextInt();
    	
    	System.out.print("Bed No :");
    	obj[i].bedNo=sc.nextInt();
    	
    	sc.nextLine();
    	
    	System.out.print("Do you want to input another record: ");
    	ch=sc.next().charAt(0);
    	i++;
    	size=i;
    	if(ch=='n'||ch=='N'){
    		break;
    	}
    	
     }while(ch=='y'||ch=='Y');

     //display
     for(i=0;i<size;i++){
    	
    	System.out.println("Name Of Patient : "+obj[i].name);
    	System.out.println("Age :"+obj[i].age);
    	System.out.print("Sex : "+obj[i].sex);
    	System.out.println("Nature Of Illness : "+obj[i].ill);
    	System.out.println("Ward No :"+obj[i].wardNo);
    	System.out.println("Bed No :"+obj[i].bedNo);
    }
    
    //edit...
    System.out.println("Input Ward No: ");
    int num = sc.nextInt();
    
    
    
	}
}
    	