import java.io.*; 
/*
7. WAP to create an integer array of size N, and take input data in the array by user, then print them on console with their index number but index should start with 1 in the console.
Input Format:
	Input Size of the Array: 5
	Input 5 Elements: 5 10 15 20 25
Output Format:
	We have following data:
	1: 5
	2: 10
	3: 15
	4: 20
	5: 25

 */
class P74{ 
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
    	System.out.println("Given data are as follows:  ");
    	for(int i=0;i<size;i++){
    		System.out.print(i+1+" : "+arr[i]);
    		System.out.println();
    		
    	}
    }
}