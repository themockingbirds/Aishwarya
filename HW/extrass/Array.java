class Array
{
	public static void main(String arg[]){
		int arr[]= new int[3];
		int[] arr1= new int[3];
		float []arr2= new float[3];
		int[] arr3= new int[]{5,9,7};
		int arr5[]={12,34,56};
		arr[0]=4;
		arr[1]=5;
		arr[2]=10;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("----");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println("----");
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		
		int size=6;
		int[] arr10= new int[size];
		for(int i=0;i<size;i++){
			arr10[i]=i+5;
			
		}
		for(int i=0;i<6;i++){
			System.out.println(arr10[i]);
			
		}
		System.out.println("----");
		
		
		//for Each Loop -only to display array elements :advanced for loop
		
		for(int i:arr10){
			System.out.println(i);
		}
		
		
	}
	
}