import java.io.*; 
/*
11. WAP to create an integer array of size N and input element through user. In the array, find the maximum and minimum value then print them in the console.
Input Format:
	Input Array Size: 10
	Input array Elements:
	20 12 18 13 1 6 19 12 35 16

Output Format:
	Max Value: 50
Mix Value: 5
 */
class P77{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int c,size;
    	System.out.print("enter size of the array: ");
    	size=Integer.parseInt(obj.readLine());
    	int arr[]=new int[size];
    	System.out.print("enter the elements: ");
    	for(int i=0;i<size;i++){
    		arr[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	for(int i=0;i<size;i++){
    		for(int j=i+1;j<size;j++){
    			if(arr[i]>arr[j]){
    				c=arr[i];
    				arr[i]=arr[j];
    				arr[j]=c;
    			}
    		}
    	}
		System.out.println("Min: "+arr[0]);
		System.out.println("Max: "+arr[size-1]);
		
    }
}