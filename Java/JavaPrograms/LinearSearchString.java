import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        
      System.out.println("Enter your name:");
      Scanner in=new Scanner(System.in);
      String name=in.nextLine();
      System.out.println("Enter a char to  Search");
      char target=in.next().charAt(0);
     
       int ans=search(name,target);
   System.out.println(ans);
   in.close();
    }
    public static int search(String name,char target){
        if(name.length()==0){
            return -1;
        }
        for(int i=0;i<name.length();i++){
            int letter=name.charAt(i);
            if(letter==target)
            return i;
           
        }
        return -1;
    } 
}
