import java.io.*; 
/*
14. WAP to create an integer array of size N and input element through user. Print the element in the revers order.
Input Format:
	Input Array Size: 10
	Input array Elements:
	20 12 18 13 1 6 19 12 35 16
Output Format:
	Element in the revers order:
	16 35 12 19 6 1 13 18 12 20

 */
class P78{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int size;
    	System.out.print("Input size of the array: ");
    	size=Integer.parseInt(obj.readLine());
    	System.out.print("Input "+size+" elements: ");
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++){
    		arr[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	System.out.println("\nElements in the reverse order: ");
    	for(int i=size-1;i>=0;i--){
    		System.out.print(arr[i]);
    		if(i==0){
    			System.out.println("\n");
    		}
    		else{
    			System.out.print(" ");
    		}
    	}
    }
}