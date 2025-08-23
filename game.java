/*
 * This is a game created by Uddish Agarwal!!!!!
 */
import java.util.*;
class game
{
    static int z=1;
    void r3()
    {
        Scanner sc=new Scanner(System.in);
        game o=new game();
        /*
         * Still thinking of round-3
         */
        System.out.println("\n\n\nhi");
        o.conask();
        sc.close();
    }
    void r2()
    {
        Scanner sc=new Scanner(System.in);
        game o=new game();
        
        System.out.println("\n\n\nThe remaining survivors let's give you all some brain scratching riddles in this round.");
        System.out.println("Let's begin Round 2.");
        System.out.println(" ");
        
        System.out.println("Riddle 1:-");
        System.out.println("\tYou measure my life in  hours\n\tAnd I serve you by expiring.\n\tI'm quick when I am thin and slow when I'm fat.\n\tThe wind is my enemy.");
        String s=sc.nextLine();//answer=candle
        if(s.equalsIgnoreCase("candle"))
        {
            System.out.println("GREAT ANSWER LET'S MOVE TO Q2.");
            System.out.println(" ");
            System.out.println("Riddle 2:-");
            System.out.println("\tI speak without a mouth \n\tAnd I hear without ears.\n\tI have no body,\n\tBut I come alive with wind.\n\tWho am I?");
            String s1=sc.nextLine();//answer=echo
            if(s1.equalsIgnoreCase("echo"))
            {
                System.out.println("Tricky answer.");
                System.out.println("Well done players!!");
                
                o.conask();
            }
            else
            {
                System.out.println(" ");
                System.out.println("WRONG ANSWER!!!!");
                System.out.println("correct answer was 'ECHO'");
            }
        }
        else
        {
            System.out.println(" ");
            System.out.println("WRONG ANSWER!!!!");
            System.out.println("correct answer was 'CANDLE'");
        }
        sc.close();
    }
    void r1()
    {
            Scanner sc=new Scanner(System.in);
            game o=new game();
            
            System.out.println("\n\n\nLet's Start Round 1.");
            System.out.println(" ");

            System.out.println("Please select and type 5 numbers of marbles between----> 1 and 12.");
            int nom[]=new int[5];
            
            for(int i=0;i<5;i++)
            {
                nom[i]=sc.nextInt();
            }
            
            int s=0;
            for(int i=0;i<5;i++)
            {
                s=s+nom[i];
            }

            System.out.println(" ");
            System.out.println("Enter which one you prefer ODD or EVEN");
            String ode=sc.next().toUpperCase();

            int com[]={1,4,2,6,5};
            int m=0;
            for(int i=0;i<5;i++)
            {
                m=m+com[i];
            }
            System.out.println(" ");
            System.out.println("Values kept=");
            System.out.println("Player value: "+s);
            System.out.println("Computer value: "+m);
                
            switch(ode)
            {
                    case "ODD":
                        {
                            int fa=s+m;
                            
                            System.out.println("ADDITION = "+fa);
                            
                            if(fa%2==0)
                            {
                                System.out.println(" ");
                                System.out.println("YOU ARE BEEN ELIMINATED!!!!!!!!!");
                            }
                            else
                            {
                                System.out.println(" ");
                                System.out.println("OOH!!! THAT WAS A LUCKY WIN.");
                                
                                o.conask();
                            }
                            
                            break;
                        }
                        
                    case "EVEN":
                        {
                            int fi=s+m;
                            
                            System.out.println("ADDITION = "+fi);
                            
                            if(fi%2==0)
                            {
                                System.out.println(" ");
                                System.out.println("OOH!!! THAT WAS A LUCKY WIN.");
                                
                                o.conask();
                            }
                            else
                            {
                                System.out.println(" ");
                                System.out.println("YOU ARE ELIMINATED!!!!!!!!!!!");
                            }
                            
                            break;
                        }
                        
                    default:
                        {
                            System.out.println("##ERROR FOUND##");
                        }
            }
            sc.close();
    }
    /*
    * Asking the user for continuing or not.!!
    */
    void conask()
    {
        Scanner sc=new Scanner(System.in);
        game o=new game(); 
        System.out.println("\n\n\nDo you want to continue?");
        System.out.println("Enter 'y' or 'n'");
        char yn=sc.next().charAt(0);
        if(yn=='y')
        {
            z++;
            switch(z)
            {
                case 2:
                {
                    o.r2();
                    break;
                }
                case 3:
                {
                    o.r3();
                    break;
                }
                default:
                {
                    System.out.println("");
                }
            }
        }
        else
        {
            System.exit(0);
        }
        sc.close();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        game o=new game();

        System.out.println("Dear Players, welcome to game.");
        System.out.println("Please Enter the required details to continue.");

        System.out.println(" ");

        System.out.println("Enter your name:");
        String nstr=sc.nextLine();

        System.out.println("Enter your age:");
        int aint=sc.nextInt();

        if(aint<12)
        {
            System.out.println("You are NOT ELIGIBLE to play this game.");
            System.out.println("Hope to see you NEXT YEAR.");
        }
        else
        {
            System.out.println("PLAYER INFORMATION--->");
            System.out.println("Name: "+nstr);
            System.out.println("Age: "+aint);

            System.out.println(" ");
            o.r1();
        }
        sc.close();
    }
}