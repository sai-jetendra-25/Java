public class CountNum {
    public static void main(String[] args) {
         int n=342398826;

        int count=0;

        while(n>0){

            int rem=n%10;

            if(rem==8){
                count++;

            }
           n/=10 ;// n=n/10

        }
        System.out.println(count);
    }
    
}
