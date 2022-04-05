import java.util.Scanner; 
class Array2D{ 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    int arr[][]=new int[2][3]; 
    System.out.println("Input array elements: "); 
    for(int row=0;row<2;row++){ 
      for(int cols=0;cols<3;cols++){ 
        System.out.print(row+","+cols+": "); 
        arr[row][cols]=sc.nextInt(); 
      } 
      System.out.println(); 
    } 
    for(int row=0;row<2;row++){ 
      for(int cols=0;cols<3;cols++){ 
        System.out.print(arr[row][cols]+" "); 
      }  
      System.out.println(); 
    } 
  } 
} 