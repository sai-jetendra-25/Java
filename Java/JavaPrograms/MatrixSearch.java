import java.util.*;

public class MatrixSearch {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of coloums");
        int coloums=sc.nextInt();
        System.out.println("Enter the elements in Matrix:");
        int[][] Matrix=new int[rows][coloums];
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                Matrix[i][j]=sc.nextInt();
                
                
               
            }
            
        }
              for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                
                System.out.print(Matrix[i][j]+" ");
            }
            
            System.out.println( );
        }

        System.out.println("Enter the target to search:");
       int target=sc.nextInt();
       
       System.out.println(Arrays.toString(MatrixSearch(Matrix,target)));
     }
          public static int[] MatrixSearch(int[][] Matrix,int target){

          for(int rows=0;rows<Matrix.length;rows++){

            for(int colo=0;colo<Matrix[rows].length;colo++){
                if(Matrix[rows][colo]==target){

                   return new int[]{rows,colo};

                }
            }

        }
           return new int[]{-1,-1};
    }
}
