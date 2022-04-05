import java.io.*; 
/*
17. Given below is the list of marks of 50 students in an annual examination.
43 65 51 27 79 11 56 61 82 09 25 36 07 49 55 63 74 81 49 37
40 49 16 75 87 91 33 24 58 78 65 56 76 67 45 54 36 63 12 21
73 49 51 19 39 49 68 93 85 59
WAP to count the number of students belonging to each of the following groups of marks: 0-9, 10-19, 20-29,………,100
Output Format:
	List is as follows:
	Group	Range	  Total
	1		0-9: 		2
	2		10-19:		4
	3		20-29:		4
	4		30-39:		5
	5		40-49:		8
	6		50-59:		8
	7		60-69:		7
	8		70-79:		6
	9		80-89:		4
	10		100-100:	2

 */
class P79{ 
    public static void main(String [] args) throws IOException{ 
    	InputStreamReader obj1 = new InputStreamReader(System.in); 
    	BufferedReader obj = new BufferedReader(obj1); 
    	int total1=0;
    	int arr[]={43,65,51,27,79,11,56,61,82,09,25,36,07,49,55,63,74,81,49,37,40,49,16,75,87,91,33,24,58,78,65,56,76,67,45,54,36,63,12,21,73,49,51,19,39,49,68,93,85,59};
    	for(int i=0;i<50;i++){
    		if(arr[i]>0&&arr[i]<9){
    			total1++;
    		}
    		System.out.println("total: "+total1);
    	}
    }
}