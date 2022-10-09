import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
        int NewWinValue = 1;
        boolean playing = true;
        boolean PlayAgainTest = true;
        boolean secondRoll = false;
        String play = "Y";
        String trash = "";

        do
        {
            if (crapsRoll == 2)
            {
                System.out.println(crapsRoll + " craps! you loose");
                playing = false;
            }
            else if (crapsRoll == 3)
            {
                System.out.println(crapsRoll + " craps! you loose");
                playing = false;
            }
            else if (crapsRoll == 7)
            {
                System.out.println(crapsRoll + " your a natural! you win!");
                playing = false;
            }
            else if (crapsRoll == 11)
            {
                System.out.println(crapsRoll + " your a natural! you win!");
                playing = false;
            }
            else
            {
                NewWinValue = crapsRoll;
                secondRoll = true;
                System.out.println(NewWinValue + " is your new target roll");
                do
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    if (crapsRoll == NewWinValue)
                    {
                        System.out.println(crapsRoll + " You win!");
                        secondRoll = false;
                        playing = false;
                    }
                    else if (crapsRoll == 7)
                    {
                        System.out.println(crapsRoll + " You loose");
                        secondRoll = false;
                        playing = false;
                    }
                    else
                    {
                        System.out.println(crapsRoll + " You can roll again");
                        secondRoll = true;
                    }

                } while (secondRoll == true);
            }

            do //do you want to play a game
            {
                System.out.print("Would you like to play again? [Y/N] ");
                play = in.nextLine();
                if (play.equalsIgnoreCase("Y"))
                {
                    //System.out.println("play again");
                    playing = true;
                    PlayAgainTest = false;

                }
                else if (play.equalsIgnoreCase("N"))
                {
                    System.out.println("Thanks for playing");
                    playing = false;
                    PlayAgainTest = false;
                    System.exit(0);
                }
                else
                {
                    System.out.println(play + " is not a valid answer");
                }
            } while (PlayAgainTest == true);

        } while (playing == true);

    }
}