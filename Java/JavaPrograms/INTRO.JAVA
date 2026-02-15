
public class INTRO {
    
 
public static void main(String[] arg) {
    
    
    
    int[] marks=new int[5];
    marks[0]=98;
    marks[1]=97;
    marks[2]=98;

    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println("enter the size of array");
    int size=sc.nextInt(); 
    int number[]=new int [size];

    System.out.println("enter the elements in array");
    for( int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }
    System.out.println("the elements in the array are:");
    for( int i=0;i<size;i++){
    

    System.out.println(number[i]);
    }
}
}