package PROJECT;

import java.util.*;

public class Roll_dies {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random R=new Random();
        int total=0;
        int NumOfDies;

        System.out.println("Enter numbers of Dies to roll:");
        NumOfDies=in.nextInt();
        if(NumOfDies<=0){
            System.out.println("ROll of Dies can not be Negative:");

        }
        else {

            for(int i=0;i<NumOfDies;i++){
                int roll=R.nextInt(1,7);
                total+=roll;
                System.out.println("The Dies rolls an number:"+roll);
                DiesRolls(roll);
            }
            System.out.println("****The sum of Dies ROlls is:****"+total);

        }

        in.close();
    }
    static void DiesRolls(int roll){
        String dies1= """
                     -----
                    |     |  
                    |  ●  |
                    |     |
                     -----


                
                      """;
        String dies2= """
                     -----
                    |●    |  
                    |     | 
                    |    ●|
                     -----


                
                      """;
        String dies3= """
                     -----
                    |●    |  
                    |  ●  |
                    |    ●|
                     -----


                
                      """;
        String dies4= """
                     -----
                    |●   ●|  
                    |     |
                    |●   ●|
                     -----


                
                      """;
        String dies5= """
                     -----
                    |●   ●|  
                    |  ●  |
                    |●   ●|
                     -----


                
                      """;
        String dies6= """
                     -----
                    |●   ●|  
                    |●   ●|
                    |●   ●|
                     -----


                
                      """;
        switch(roll){
            case 1->System.out.println(dies1);
            case 2->System.out.println(dies2);
            case 3->System.out.println(dies3);
            case 4->System.out.println(dies4);
            case 5->System.out.println(dies5);
            case 6->System.out.println(dies6);

        }
    } 
    
}
