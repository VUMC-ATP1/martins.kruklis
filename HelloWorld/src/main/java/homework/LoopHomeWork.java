package homework;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {
// 1. uzd.
        System.out.println("\\\\1. uzdevums");
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        while (sum < 100) {
            System.out.println("Lūdzu ieraksti veselu skaitli!");
            num = scanner.nextInt();
            sum = sum + num;
        }
        System.out.println();
// 2. uzd.
        System.out.println("\\\\2. uzdevums");
        sum = 0;
        System.out.println("Lūdzu ieraksti veselu skaitli, lai uzzinātu vai tas ir pirmskaitlis!");
        num = scanner.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        if (sum == 0) {
            System.out.printf("Skaitlis \"%d\" IR pirmskaitlis!%n", num);
        } else {
            System.out.printf("Skaitlis \"%d\" NAV pirmskaitlis!%n", num);
        }
        System.out.println();
// 3. uzd.
        System.out.println("\\\\3. uzdevums");
        int[] numbers = {2, 4, 5, 10, 3, 144, -1};
        String[] cities = {"Madona", "Liepaja", "Riga", "Daugavpils", "Rezekne"};
        char[] letters = {'a', 'f', 's', 's', 'f'};
        int n = 0;
        System.out.println("Printing int[] array with while loop");
        while (n < numbers.length) {
            System.out.println(numbers[n]);
            n++;
        }
        n = 0;
        System.out.println();
        System.out.println("Printing int[] array with do while loop");
        do {
            System.out.println(numbers[n]);
            n++;
        } while (n < numbers.length);
        n = 0;
        System.out.println();
        System.out.println("Printing int[] array with for loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Printing int[] array with for each loop");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Printing String[] array with while loop");
        while (n < cities.length) {
            System.out.println(cities[n]);
            n++;
        }
        n = 0;
        System.out.println();
        System.out.println("Printing String[] array with do while loop");
        do {
            System.out.println(cities[n]);
            n++;
        } while (n < cities.length);
        n = 0;
        System.out.println();
        System.out.println("Printing String[] array with for loop");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        System.out.println();
        System.out.println("Printing String[] array with for each loop");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();
        System.out.println("Printing char[] array with while loop");
        while (n < letters.length) {
            System.out.println(letters[n]);
            n++;
        }
        n = 0;
        System.out.println();
        System.out.println("Printing char[] array with do while loop");
        do {
            System.out.println(letters[n]);
            n++;
        } while (n < letters.length);
        n = 0;
        System.out.println();
        System.out.println("Printing char[] array with for loop");
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        System.out.println();
        System.out.println("Printing char[] array with for each loop");
        for (char letter : letters) {
            System.out.println(letter);
        }
        System.out.println();
// 4. uzdevums
        System.out.println("\\\\4. uzdevums");
        int[] hundredNumbers = new int[100];
        for (int i = 0; i < hundredNumbers.length; i++) {
            hundredNumbers[i] = i * 2;
            System.out.printf("%d, ", hundredNumbers[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("\\\\5. uzdevums");
// 5. uzdevums (metodes izsauksana)
        System.out.println("Lūdzu, ieraksti kādu veselu skaitli!");
        int input = scanner.nextInt();
        System.out.printf("Skaitļa \"%d\" faktoriāls ir %d%n", input, Factorial(input));
        System.out.println();
//6. uzdevums
        System.out.println("\\\\6. uzdevums");
        int guessesLeft = 3;
        boolean isGuessed = false;
        int pinCode = (int) (Math.random() * 9000) + 1000;
//        pinCode is:
//        System.out.println("pinCode is " + pinCode);
        while (!isGuessed) {
            System.out.println("Lūdzu, ievadi savu PIN kodu! Atlikušie mēģinājumi: " + guessesLeft);
            if (scanner.nextInt() == pinCode) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                isGuessed = true;
            } else {
                guessesLeft--;
                System.out.print("Nepareizs PIN. ");
                if (guessesLeft == 0) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts");
                    break;
                }
            }
        }
    }

// 5. uzdevums (metodes deklaracija)
    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
