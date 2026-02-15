
import java.util.Scanner;

public class SearchMatrixMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int coloums=sc.nextInt();
        int[][] Matrix= new int [rows][coloums];
         System.out.println("Enter the elements in Matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
               System.out.print(Matrix[i][j]+" ");

    }
    System.out.println();

}
   
  int Max=0;
  int Min=0;
            System.out.println(SearchMax(Matrix, Max));
            System.out.println(SearchMin( Matrix,Min));
}

    public static int SearchMax(int[][] Matrix,int Max){
      Max=Matrix[0][0];
      System.out.println("The maximum number in the Matrix:");
      for(int row=0;row<Matrix.length;row++){
        for(int coloum=0;coloum<Matrix[row].length;coloum++){
            if(Matrix[row][coloum]>Max){
                 Max=Matrix[row][coloum];
            }
        }
      }
return Max;
    }
    public static int SearchMin(int[][] Matrix,int Min){
        Min=Matrix[0][0];
        System.out.println("The minimum number in the matrix:");
        for(int row=0;row<Matrix.length;row++){
          for(int coloum=0;coloum<Matrix[row].length;coloum++){
              if(Matrix[row][coloum]<Min){
                   Min=Matrix[row][coloum];
              }
          }
        }
  return Min;
      }
}

