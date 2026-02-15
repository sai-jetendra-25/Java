import java.util.Stack;
public  class StackBeggin{
    public static void main(String[]args){
        Stack<String> s=new Stack<String>();
        s.push("sai");
        s.push("Jetendra");
        s.push("Gubbala");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.empty());

    }

}