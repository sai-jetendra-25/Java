import java.util.*;
public class MATRIX {
    
    public static void Matrix(int Matrix[][],int row,int coloum){
        

        for( int i=0;i<row;i++){

            for(int j=0;j<coloum;j++) {
                System.out.print(Matrix[i][j] +" ");  
    }
    System.out.println( );
}
    }
    
 
public static void main(String[] arg) {
    
    
    
    
    Scanner sc= new Scanner (System.in);
    System.out.println("enter number of rows and coloums:");
    int row=sc.nextInt();
    int coloum=sc.nextInt();
    int Matrix[][]=new int[row][coloum];

    System.out.println("enter the elementes in Matrix");
    for( int i=0;i<row;i++){

        for(int j=0;j<coloum;j++) {
            Matrix[i][j]=sc.nextInt();


        }
    }
    
    Matrix(Matrix,row,coloum);
  }
 }


    
 