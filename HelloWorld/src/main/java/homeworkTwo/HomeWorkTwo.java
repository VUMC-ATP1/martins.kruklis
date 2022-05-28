package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

//1. uzdevums
        int x;

        //a.
        x = 10;
        System.out.printf("Is 10 bigger than 0? Answer: %B%n", x > 0);

        //b.
        System.out.printf("Is 10 smaller than 0? Answer: %B%n", x < 0);

        //c.
        System.out.printf("Is 10 bigger than 5 and smaller or equal to 10? Answer: %B%n", x > 5 && x <= 10);

        //d.
        System.out.printf("Is 10 NOT smaller or equal to 5 and NOT smaller to 10? Answer: %B%n", !(x >= 5 && x < 10));

        //e.
        x = 9;
        System.out.printf("Is either 10 equal to 0 or 10 is equal to 10 ? Answer: %B%n", x == 0 || x == 10);

        //f.
        System.out.printf("Is 9 multiplied by 9 bigger than 10? Answer: %B%n", x * x > 10);

//2. uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12!");
        int num = scanner.nextInt();
        String monthString;
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

//3.uzdevums
        System.out.println("Ievadi 1. skaitli");
        int number1 = scanner.nextInt();
        System.out.println("Ievadi 2. skaitli");
        int number2 = scanner.nextInt();
        System.out.println("Ievadi 3. skaitli");
        int number3 = scanner.nextInt();
        while (number1 == number2 && number1 == number3) {
            System.out.printf("Tu ievadīji %d, %d un %d. Visi skaitļi ir vienādi! Mēģini vēlreiz%n", number1, number2, number3);
            System.out.println("Ievadi 1. skaitli");
            number1 = scanner.nextInt();
            System.out.println("Ievadi 2. skaitli");
            number2 = scanner.nextInt();
            System.out.println("Ievadi 3. skaitli");
            number3 = scanner.nextInt();
        }
        System.out.printf("Tu ievadīji %d, %d un %d. Mazākais no tiem ir %d%n", number1, number2, number3, (Math.min(Math.min(number1, number2), number3)));

//4. uzdevums
        System.out.println("Kāda krāsa deg luksoforā?");
        String krasa = scanner.next();
        if (krasa.equalsIgnoreCase("zala")) {
            System.out.println("Var iet pāri ielai!");
        } else if (krasa.equalsIgnoreCase("dzeltena")) {
            System.out.println("Paskaties uz abām pusēm un skrien pāri ielai!");
        } else if (krasa.equalsIgnoreCase("sarkana")) {
            System.out.println("Iet pāri nedrīkst, lūdzu, uzgaidi!");
        } else {
            System.out.println("Luksofors nestrādā. Paskaties uz abām pusēm un uzmanīgi ej pāri ielai!");
        }
        System.out.println("Spied Enter!");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        ;


//5. uzdevums (metodes izsauksana)
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

//6. uzdevums (metodes izsauksana)
        printBusinessCardTwo("Mārtinš", "Krūklis", "+371 220 28106", 1991);
        printBusinessCardTwo("Linda", "Ozola", "+371 132 23243", 1970);

// 7. uzdevums (metodes izsauksana)
        int skaitlis1 = 10;
        int skaitlis2 = 33;
        System.out.printf("Skaitlu %d un %d summa ir %d%n", skaitlis1, skaitlis2, sum(skaitlis1, skaitlis2));

//8. uzdevums (metodes izsauksana)
        System.out.printf("Skaitlu %d, %d un %d vidējais aritmētiskais ir %f",3,30,15,average(3, 30, 15));
    }

    //5. uzdevums (metodes deklaracija)
    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +220 28 106");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("############");
    }

    //6. uzdevums (metodes deklaracija)
    public static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("############");
        System.out.printf("Vārds: %s%n", name);
        System.out.printf("Uzvārds: %s%n", surname);
        System.out.printf("Telefona numurs: %s%n", telephone);
        System.out.printf("Dzimšanas gads: %d%n", dateOfBirth);
        System.out.println("############");
    }

    //7. uzdevums (metodes deklaracija)
    public static int sum(int a, int b) {
        return a + b;
    }

    //8. uzdevums (metodes deklaracija)
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
