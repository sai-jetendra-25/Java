import java.util.*;
public class TWO_PRODUCT {
    public static int twoProd(int a,int b) {
        int prod=a*b;
        System.out.println("The product of two numbers is"+prod);
       return prod;

     
        

    }
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
            
          twoProd(a,b);

        



    }
}
