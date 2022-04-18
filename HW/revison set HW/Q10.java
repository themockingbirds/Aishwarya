//revision set Q10
/*

	10. WAP to create an array of size N where you input some element but if you 
	try to input such data that in already  in the array it should give you
	message "Duplicate data found, please input again".

*/
import java.util.Scanner; 
class Q10{ 
    public static void main(String args[]){ 
    	Scanner s=new Scanner(System.in);
    	int size;
    	System.out.print("Input size of the array: ");
    	size=s.nextInt();
    	System.out.print("Input "+size+" elements: ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    		for(int j=i+1;j<size;j++){
				arr[i]=s.nextInt();
					if(arr[i]==arr[j]){
						System.out.println("Duplicate data found,please input again");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			
			
			/*
			for(int i=0;i<size;i++){
				arr[i]=s.nextInt();
    		for(int j=0;j<size;j++){
					if(arr[i]==arr[j+1]){
						System.out.println("Duplicate data found,please input again");
					}
					else{
						System.out.print(" ");
					}
				}
			}*/
   }
}
    	
    	
    	