
import java.util.*;
 public class BUBBLE_SORT{
    public static void bubbleSort( int arr[]){
        System.out.println("elements after bubble sort");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of array");
         
           int size=sc.nextInt();
           int [] arr=new int[size];

           System.out.println("Enter the elements in array:"+size);
           for( int i=0;i<size;i++){
             arr[i]=sc.nextInt();

  
           }
           for( int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            
              }
            }
           }



           bubbleSort(arr);
    }
 }