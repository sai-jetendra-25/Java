
import java.util.Scanner;

public class FindMiniMax {
    public static void main(String[] args) {
     
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements in array:");
        for( int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
         int Min=Minimum(array);
         System.out.println("The Minimum value in the array is:"+Min);
         int Max= Maximum(array);
         System.out.println("The Maximun value in the array is:"+Max);
    }
 public static int Minimum(int[] arr){

    int ans=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<ans){
        ans=arr[i];
    }
    
}
return ans;
}
public static int Maximum(int[] arr){
    
    int ans=arr[0];
    for(int i=1;i<arr.length;i++){
        if(ans<arr[i]){
            ans=arr[i];
        }

    }
    return ans;
 }
    
}
