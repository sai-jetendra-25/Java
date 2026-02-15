import java.util.Scanner;

public class TWO_GREATEST{
    public static void TwoGreatest(int a,int b){
        if(a==b){
            System.out.println("a and b are equal");
        }

          else if(a<b){
            System.out.println("b is greater:" +b);
          }
         else{
            System.out.println("a is greater:"+a);
         }

        }

         public static void main(String[] args){
            System.out.println("Enter the value of a,b:");
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();


         TwoGreatest(a,b);
    }

}