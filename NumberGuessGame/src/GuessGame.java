import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private Random random = new Random();
    private int score = 0;
    private int randomNo;
    private  int i;

    public GuessGame() {
        randomNo = random.nextInt(100);
    }

    public int guessNumber() {
        System.out.println(randomNo);
        for (i = 0; i < 5; i++) {
            System.out.println("\nGuess The Number");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (randomNo == number) {
                System.out.println("\nCongratulations!!! You guess correct number.");
                score = (5 - i) * 2;
                break;
            } else if (randomNo > number && i < 4) {
                System.out.println("\nOops!!! guess higher number");
            } else if (randomNo < number && i < 4){
                    System.out.println("\nOops!!! guess lower number");
            }else {
                System.out.println("\nSorry!!! Better luck next time.");
            }
        }
        return score;
    }
}
