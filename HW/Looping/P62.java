import java.io.*; 
/*
9. WAP to print the table of N, up to Mth term, N and M input by a user.
 */
class P62{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int m,n,table;
    	System.out.print("Enter the values of n(table=n*m):  "); 
		n=Integer.parseInt(obj.readLine());
		System.out.print("Enter the values of m(table=n*m):  "); 
		m=Integer.parseInt(obj.readLine());
		for(int i=1;i<=m;i++){
			table=n*i;
			System.out.println(n+"*"+i+"="+table);
	
		}
	}
		
}
		