import java.util.*;
public class CIRCUMFRENCE_CIRCLE {
    public static double circumferencecircle(double r){

        System.out.println("The circumference of a circle is:");
         return 2*3.14*r;


    }
    public static void main(String[] args){
        System.out.println("Enter the value of r(radius):");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();

        System.out.println(circumferencecircle(r));

       sc.close();
        
        
            }
        }
        



    