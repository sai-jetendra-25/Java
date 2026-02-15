import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
        int[] array = new int[size];
         System.out.println("Enter the elements  in array");

        for( int i=0;i<size;i++) {
             array[i]=sc.nextInt();
        }
System.out.println("The array elemsnts are:");
System.out.println(Arrays.toString(array));
        SwapInt(array,1,2);
        System.out.println("The elements after swap:"+Arrays.toString(array));
    }

    public static void SwapInt(int[] array,int index1,int index2){
         int temp=array[index1];
         array[index1]= array[index2];
         array[index2]=temp;


    }
}
