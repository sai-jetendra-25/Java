import java.util.*;
public class MaxValue {
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in array:");
         for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are"+Arrays.toString(array));
        int max=MaxValue(array);
        System.out.println("The Maximun value of the array: "+max);
    }
    public static int MaxValue( int array[]) {
         int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }

         return max;
    }
}
