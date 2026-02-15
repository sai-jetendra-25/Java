import java.util.*;
public class compareTo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name1");
        String name1=sc.nextLine();
        System.out.println("Enter your name2");
        String name2=sc.nextLine();

        if(name1.compareTo(name2)==0){
            System.out.println("The two names are equall");

          
        }
        else if(name1.compareTo(name2)<0){

        System.out.println("name1 is less than name2");
        }
        else{

            System.out.println("name1 is greater than name2");
        }

    }
    
}
