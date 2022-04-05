import java.io.*; 
/*
19. WAP to create a copy of an exiting array. Suppose we have an arrayA with the some values that is input by a user so we have to create a copy of element of arrayA in arrayB.
And Display both element in the given format.
Input Format:
	Input the size of the array: 5
	Input the element in the Array: 1 5 8 3 10
Output Format:
	Records In A	Records In B
	1	1
	5	5
	8	8
	3	3
	10	10
 */
class P80{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int size;
    	System.out.print("Input size of the array: ");
    	size=Integer.parseInt(obj.readLine());
    	System.out.print("Input "+size+" elements: ");
    	int a[]=new int[size];
    	for(int i=0;i<size;i++){
    		a[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	int b[]=new int[size];
    	for(int i=0;i<size;i++){
    	b[i]=a[i];
    	}
    	System.out.printf("%-25s%-20s","Records in A","Records in B");
    	System.out.print("\n");
    	for(int i=0;i<size;i++){
    		System.out.printf("%26d%-20d\n",a[i],b[i]);
    	}
    }
}