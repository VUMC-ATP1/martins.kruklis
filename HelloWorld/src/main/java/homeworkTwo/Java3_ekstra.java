package homeworkTwo;

import java.util.Random;
import java.util.Scanner;

public class Java3_ekstra {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(50);
//        Skaitlis ir:
//        System.out.println("Skaitlis ir " + x);
        int guessesLeft = 10;
        int guessesMade = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isGuessed = false;
        while (!isGuessed) {
            if (guessesLeft == 10) {
                System.out.println("Lūdzu, uzmini skaitli!");
            } else {
                System.out.println("Mini vēlreiz!");
            }
            int guess = scanner.nextInt();
            if (guess == x) {
                guessesMade++;
                guessesLeft--;
                System.out.printf("Apsveicu, tu atminēji skaitli \"%d\"! Tev bija dotas 10 iespējas un tu atminēji ar %d. reizi%n",x,guessesMade);
                isGuessed = true;
            } else if (guess > x) {
                guessesMade++;
                guessesLeft--;
                System.out.printf("Tavs minētais skaitlis ir lielāks par īsto skaitli! Tu vēl vari minēt %d reizes%n",guessesLeft);
            } else if (guess < x){
                guessesMade++;
                guessesLeft--;
                System.out.printf("Tavs minētais skaitlis ir mazāks par īsto skaitli! Tu vēl vari minēt %d reizes%n",guessesLeft);
            }
        }
    }
}
