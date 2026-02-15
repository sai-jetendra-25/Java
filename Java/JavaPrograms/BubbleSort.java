import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
            
        }
        BubbleProgram(arr);
            System.out.println(Arrays.toString(arr));
 
    }
     public static void BubbleProgram(int[]arr){
        int n=arr.length;
        
        for (int i = 0; i<n-1; i++) {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            
        }
    }

}
