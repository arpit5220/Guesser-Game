import java.util.Scanner;

// GUESSER CLASS
class Guesser
{
    int guessNum;

    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Gusser Kindly Guess The Number:");
        guessNum=sc.nextInt();
            return guessNum;
    }
}


//PLAYER CLASS
class Player
{
    int pguessNum;

    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player kindly guess the number:");
        pguessNum=sc.nextInt();
            return pguessNum;
    }
}

// UMPIRE CLASS
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();

    }

    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
    }

    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("Game Tied all three players guessed correctly:");
            }

            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 won the game:");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 and Player 3 won the game:");
            }
            else {
                System.out.println("Player 1 won the geme:");
            }
        }

        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the Game:");
            }
            else
            {
                System.out.println("Player 2 won the Game:");
            }
        }

        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the Game:");
        }

        else
        {
            System.out.println("Game Lost! Try Again..");
        }
    }
}


// MAIN CLASS LAUNCHGAME
public class Launchgame {
    public static void main(String[] args) {

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
