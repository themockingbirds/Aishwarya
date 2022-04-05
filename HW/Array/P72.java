import java.io.*; 
/*
5. WAP to create an integer array of size N, and take input element in the given array by user, then print them on console.
Input Format:
	Input Size of the Array: 5
	Input 5 Elements: 1 2 3 4 5
Output Format:
	5 Elements are:
	1, 2, 3, 4, 5

 */
class P72{ 
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
    	System.out.println(size+" elements are: ");
    	for(int i=0;i<size;i++){
    		System.out.print(arr[i]);
    		if(i!=(size-1)){
    		System.out.print(",");
    		}
    		else{
    			System.out.println("\n");
    		}
    	}
    }
}