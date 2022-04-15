//revision set Q8
/*
	8. WAP to create an integer array of size N and then input element through 
	user.After that ask user to input any element of array, if that element exit 
	in the created array, display the index number of that element otherwise 
	display a message "Sorry, Element don't exit."
	
	Input Format:
		Input the size of the array: 10
		Input data: 2 4 6 8 12 43 16 18 20 34
	
	Output format: 
		Input the element you want to search: 20
		Number found at index: 8

*/
import java.util.Scanner; 
class Q8{ 
    public static void main(String args[]){ 
    	Scanner s=new Scanner(System.in);
    	int size,num,flag=1;
    	System.out.print("Input size of the array: ");
    	size=s.nextInt();
    	System.out.print("Input "+size+" elements: ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    		arr[i]=s.nextInt();
    		System.out.print(" "); //what is the use of this line?
    	}
    	
    	System.out.print("Input the data that you want to search: ");
    	num=s.nextInt();
    	for(int i=0;i<size;i++){
    		if(num==arr[i]){
    			System.out.println("number found at index: "+i);
    			flag=0;
    			break;
    		}
    		else{
    			flag=1;
    		}
    	}
    	if(flag==1){
    		System.out.println("Sorry,element does not exist");
    	}
    }
}
