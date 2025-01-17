import java.util.Random;
import java.util.Scanner;

public class Stonepaperscissor {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String[] choices = {"stone" , "paper" , "scissor"};

        System.out.println("Welcome to the stone-paper-scissor game :");

        while (true)
        {
            System.out.print("Enter yor choice: ");
            String userchoice = sc.nextLine().trim();

            if (userchoice.equalsIgnoreCase("exit"))
            {
                System.out.println("Thankyou for playing");
                break;
            }
            // to terminate the game .

            int computerindex = rn.nextInt(3);  // here we get the index form the user and check with our choice list
            String computerchoice = choices[computerindex];

            if (
                    !userchoice.equalsIgnoreCase("stone") &&
                            !userchoice.equalsIgnoreCase("paper") &&
                                    !userchoice.equalsIgnoreCase("scissor")
            )
            {
                System.out.println("invaild input !! please try again");
                continue;
            }
            // here we only get 4 things noting else stone paper scissor or exit

            System.out.println("Computer choice " + computerchoice);

            if (userchoice.equalsIgnoreCase(computerchoice))
            {
                System.out.println("it's a tie");
            }
            // here we get the 3 conditions of tie

            else if (userchoice.equalsIgnoreCase("stone") && userchoice.equalsIgnoreCase("scissor") ||
            userchoice.equalsIgnoreCase("paper") && userchoice.equalsIgnoreCase("stone") ||
                    userchoice.equalsIgnoreCase("scissor") && userchoice.equalsIgnoreCase("paper")
            )
            {
                System.out.println("you won !");

            }
            // here we get the 3 wining condition
            else
            {
                System.out.println("Computer wins !");
            }
            // here we get the 3 conditions were computer wins

            System.out.println(" ");
            // for moving to next line
        }
    }
}
