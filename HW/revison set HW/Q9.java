//revision set Q9
/*

	9. WAP to find the common elements between two arrays of integers.
	Suppose we have 2 array A and B and they have some data, 
	so we have to display only those data that are common in both.
	Input Format:
		Array 1 Input Size: 10
		Input array Elements:
			5 10 15 10 25 30 36 40 10 50
		Array 2 Input Size: 5
		Input array Elements:
			6 10 12 5 25  
	Output Format:
		Common Elements in an Array are: 10 5 25

		*/
import java.util.Scanner; 
class PQ9{ 
    public static void main(String args[]){ 
    	Scanner s=new Scanner(System.in);
    	int size1,size2;
    	System.out.print("Input size of the array(A): ");
    	size1=s.nextInt();
    	System.out.print("Input "+size1+" elements: ");
    	int arr[]=new int[size1];
    	for(int i=0;i<size1;i++){
    		arr[i]=s.nextInt();
    		System.out.print(" "); //?
    	}
    	System.out.print("Input size of the array(B): ");
    	size2=s.nextInt();
    	System.out.print("Input "+size2+" elements: ");
    	int arr2[]=new int[size2];
    	for(int j=0;j<size2;j++){
    		arr2[j]=s.nextInt();
    		System.out.print(" "); //?
    	}
    	
    	
    
    	for(int i=0;i<size1;i++){
    		for(int j=0;j<size2;j++){
    			if(arr[i]==arr2[j]){
    				System.out.println("Common Elements in an Array are: "+arr[i]+" ");
    			}
				if(i>=size2)
					break;
    		}
    	}
    			
    			
    }
}
