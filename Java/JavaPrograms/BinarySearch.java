import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array={421,4,1,7,531,2,3,67,34,89,100};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
       int  target=3;
       int ans=Searching(array,target); 
     System.out.println(ans);

        
    }
    public static int Searching(int []array,int target){
        int start=0;
        int end=array.length-1;
         
         while( start<=end){
             int mid=start+(end-start)/2;
             if(target<array[mid]){
                end=mid-1;

             }
             else if(target>array[mid]){
                start=mid+1;
             }
             else{
                return mid;
             }
         }
 
        return -1;
    }
}
