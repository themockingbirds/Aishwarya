import java.io.*; 
/*
20. WAP to find the common elements between two arrays of integers. Suppose we have 2 array A and B and they have some data, so we have to display only those data that are common in both.
Input Format:
	Input Array1 Size: 10
	Input array Elements:
	5 10 15 10 25 30 36 40 10 50

	Input Array2 Size: 5
	Input array Elements:
	6 10 12 5 25
Output Format:
	Common Elements in an Array are: 10 5 25

 */
class P81{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int size,n;
    	
    	System.out.print("Input array1 size: ");
    	size=Integer.parseInt(obj.readLine());
    	
    	System.out.print("Input array elements: ");
    	int arr[]=new int[size];
    	
    	for(int i=0;i<size;i++){
    		arr[i]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	
    	System.out.print("Input array2 size: ");
    	n=Integer.parseInt(obj.readLine());
    	
    	System.out.print("Input array elements: ");
    	int arr1[]=new int[n];
    	
    	for(int j=0;j<n;j++){
    		arr1[j]=Integer.parseInt(obj.readLine());
    		System.out.print(" ");
    	}
    	/*for(int i=0;i<size;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr1[j]){
					System.out.print(arr[i]);
					System.out.print("");
				}
			}
		}*/
		//no repeatation--
		System.out.println("no repeatation--");
    	for(int i=0;i<size;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr1[j]){
					System.out.print(arr[i]);
					System.out.print("");
				}
				if(i>=n)
					break;
			}
		}
    }
}
    	