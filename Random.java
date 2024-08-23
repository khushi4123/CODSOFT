package CodSoft;

import java.util.Random;
import java.util.Scanner;


public class Random{

    public static void main(String[] args)
    {
           
           String str=null;
           System.out.println("--------Hey Dost--------");
           System.out.println("Welcome To Number Gamme");
            Scanner sc = new Scanner(System.in);  
            do{
                    Random random = new Random();
                    int num = random.nextInt(100);
                    System.out.println("Guess any number: ");
                    int n = sc.nextInt();  
               
            
           for(int chance=1;chance<=3;chance++)
            {
               if(n>num)
                {
                    System.out.println("To High");
                    System.out.println("Guess again");
                     n = sc.nextInt();  
                }
                else if(n<num)
                {
                    System.out.println("To Low");
                    System.out.println("Guess again");
                     n = sc.nextInt();  

                }
                else if(num==n)
                {
                    System.out.println("Congratulation You Won The game...!!!!");
                    System.out.println("********You Guessed Correctlly*********");
                    break;
                }
                
                if(chance==3  && num!=n) 
                {
                    System.out.println("Sorry...!!,You lost your 3  chnace");
                }
                
            }
                System.out.println("Want to Play again enter yes/no: ");
                str = sc.next();
            }
            while(str.equals("yes"));
sc.close();
    }
}

