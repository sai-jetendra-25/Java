import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {

        System.out.println("Enter the size of array:");
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] num=new int[size];
        System.out.println("Enter the numbers in array");
        for( int i=0;i<size;i++){
            num[i]=in.nextInt();
    }
        System.out.println("Enter the number to search(target):");
        int target=in.nextInt();
        
        int ans=searching(num,target);
        System.out.println(ans);

    }

     public static int searching(int[] num,int target){
        if(num.length==0){
            return -1;
        }
    for(int i=0;i<num.length;i++){
        int ele=num[i];
        if(ele==target){
            return num[i];
        }

    }
    return -1;
     }
 
       
    
}
