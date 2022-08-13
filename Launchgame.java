import java.util.Scanner;

class Guesser
{
    int guessNum;

    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Gusser Kindly Guess The Number between 1 to 1000:");
        guessNum=sc.nextInt();
        if(guessNum<1 && guessNum>1000)
            System.out.println("Invalid Number, Try Again!");
        else
            return guessNum;
    }
}

class Player
{
    int pguessNum;

    public int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player kindly guess the number:");
        pguessNum=sc.nextInt();
        if(pguessNum<1 && pguessNum>1000)
            System.out.println("Invalid Number, Try Again!");
        else
            return pguessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int NumFromPlayer3;

    public void collectNumFromGuesser()
    {
        Gusser g=new Guesser();
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



public class Launchgame {
    public static void main(String[] args) {

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
