import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalScore = 0;
        int option;
        int round = 1;

        boolean nextRound = false;

        do {
            System.out.println("\nStart round " + round +"...\n");
            System.out.println("1.Start Game\n2.exit Game");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option){
                case 1:{
                    GuessGame game = new GuessGame();
                    int score = game.guessNumber();
                    totalScore = totalScore + score;
                    System.out.println("\nYour round "+round+" score is : " + score + "/10");

                    round++;
                    System.out.print("\nYou Want to Play "+round+ " round Y/N : ");
                    String s = sc.next().toUpperCase();
                    nextRound = s.equals("Y");
                    break;
                }
                case 2: {
                    nextRound = false;
                    break;
                }
                default:{
                    System.out.println("Enter Correct option");
                }
            }
        }while (nextRound);

        System.out.print("\n"+"*".repeat(30));
        System.out.println("\nYour total score is : " + totalScore +"/"+((round-1)*10));
    }
}