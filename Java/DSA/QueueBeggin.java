import java.util.*;
public class QueueBeggin{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(2);
        q.offer(4);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        
    }
}