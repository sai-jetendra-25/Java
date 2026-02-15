/*The charAt method in Java is used to retrieve a character at a specified index from a string. 
The index is zero-based, meaning the first character of 
the string is at index 0, the second character is at index 1, and so on*/
import java.util.*;
public class charAt{
    public static void main(String [] args){

        System.out.println("Enter your first name");
        Scanner sc=new Scanner(System.in);
        String firstname=sc.nextLine();
        System.out.println("Enter your last name");
        String lastname=sc.nextLine();
        
      String fullname=firstname+lastname;
        System.out.println("your name is "+fullname);
        System.out.println("print length of name:"+fullname.length());

        for(int i=0; i<fullname.length();i++){

            System.out.println(fullname.charAt(i));
        }
     sc.close();   
    }
}