import java.util.*;
public class SUM_ODD {
    
    
    public static void SumOdd(int n) {
        int sum=0;

        for( int i=0;i<=n;i++){
             
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of the odd numbbers is:"+sum);

        
    }
    public static  void  main(String[]  args){
System.out.println("Enter the value of n:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

SumOdd(n);
        

    }
    
}
