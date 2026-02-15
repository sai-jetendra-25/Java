import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        
        int ans=0;
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter +,-,*,/,%");
        char op=input.next().trim().charAt(0);

        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
          System.out.println("Enter the first number");
            int num1=input.nextInt();
            System.out.println("Enter the secound number");
            int num2=input.nextInt();

         
               if(op=='+'){
                ans=num1+num2;
            }
            if(op=='-'){
                ans=num1-num2;
            }
            if(op=='*'){
                ans=num1*num2;
            }
            if(op=='/'){
                if(num2!=0){
                    ans=num1+num2;
                }
                
            }
            if(op=='%'){
                ans=num1%num2;
            }
        }
        System.out.println(ans);
        }
        
    }

}