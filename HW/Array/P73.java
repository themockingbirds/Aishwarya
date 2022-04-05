import java.io.*; 
/*
6. WAP a to create an integer array of size N and take input in the array
through user and then print them on the console with their corresponding index number.
Input format:
	Input the size of the Array: 5
	Input the elements: 6 2 3 54 8
Output Format:
	Given Data is as follows:
	0: 6
	1: 2
	2: 3
	3: 54
	4: 8
 */
class P73{ 
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
    		System.out.print(i+" : "+arr[i]);
    		System.out.println();
    		
    	}
    }
}