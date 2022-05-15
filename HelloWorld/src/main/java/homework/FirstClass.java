package homework;

public class FirstClass {
    public static void main(String[] args) {
        /* Main metodē vajag nodefinēt mainīgos (ar atbilstošo datatipu)
        Valstij (brīva izvēle) un izvadīt uz ekrāna:
         */

        // Nosaukums
        String countryName = "Latvia";

        // Iedzīvotājus skaits
        int countryPopulation = 1850000;

        // Platība
        int countryAreaKm2 = 64589;

        // Galvaspilsēta
        String countryCapital = "Riga";

        // Valoda
        String countryOfficalLanguage = "Latvian";

        // Vai ir ES dalībvalsts
        boolean isCountryEuMember = true;

        // Valūta (viens simbols)
        char countryCurrency = 'E';

       /* Jāuzraksta dažus teikumus uz brīvu tēmu
        izmantojot konkatenāciju un formātu.*/

        // 1. teikums (ar formātu)
        System.out.printf("Hello! My name is Martins and I live in %s. The capital of %s is %s and the official language is %s.\n", countryName, countryName, countryCapital, countryOfficalLanguage);
        // 1. teikums (ar konkatenāciju)
        System.out.println("Hello! My name is Martins and I live in " + countryName + ". The capital of " + countryName + " is " + countryCapital + " and the official language is " + countryOfficalLanguage + ".");

        // 2. teikums (ar formātu)
        System.out.printf("The population of %s in 2022 is %d people and the total area is %d km².\n", countryName, countryPopulation, countryAreaKm2);
        // 2. teikums (ar konkatenāciju)
        System.out.println("The population of " + countryName + " in 2022 is " + countryPopulation + " people and the total area is " + countryAreaKm2 + "km².");

        // 3. teikums (ar formātu)
        if (isCountryEuMember) {
            System.out.printf("Is Latvia a EU member state? Yes, it's %b%n", isCountryEuMember);
        } else {
            System.out.printf("Is Latvia a EU member state? No, it's %b%n", isCountryEuMember);
        }
        // 3. teikums (ar konkatenāciju)
        if (isCountryEuMember) {
            System.out.println("Is Latvia a EU member state? Yes, it's " + isCountryEuMember);
        } else {
            System.out.println("Is Latvia a EU member state? No, it's " + isCountryEuMember);
        }

        /* Jāuzraksta pa trīs piemēriem
        uz katru aritmētisko operatoru.
        */

        //1.1. piemērs (division)
        float populationDensity = countryPopulation / countryAreaKm2;
        System.out.printf("The population density of Latvia is %.2f persons per km² \n", populationDensity);
        //1.2. piemērs (division)
        System.out.println("Number '5' divided by '2' is " + 5 / 2f);
        //1.3. piemērs (division)
        for (int i = 0; i < 3; i++) {
            System.out.println("Hey! My number is " + i);
        }

        //2.1. piemērs (multiplication)
        System.out.printf("Number '4' multiplied by '5' is %d%n", 4 * 5);
        //2.2. piemērs (multiplication)
        System.out.println("Number '102' multiplied by '1' is " + 102 * 1);
        //2.3. piemērs (multiplication)
        for (int a = 0; a < 10; a++) {
            System.out.println("Number '343' multiplied by " + a + " is " + 343 * a);
        }

        //3.1. piemērs (division)
        System.out.printf("Number '4.5424215' summed with '5.928743876' with two decimal point precision is %.2f%n", 4.5424215 + 5.928743876);
        //3.2. piemērs (division)
        System.out.println("I have 10 EUR and I bought 4 beers and I have no money left. So each beer costs " + 10 / 4f);
        //3.3. piemērs (division)
        int a = 5;
        while (a >= 1) {
            System.out.println("30 divided by " + a + " is " + 30f / a);
            a--;
        }

        //4.1. piemērs (minus)
        System.out.println("Piecpadsmit mīnus desmit ir " + (15 - 10));
        //4.2. piemērs (minus)
        switch (4 - 2) {
            case 1:
                System.out.printf("Four minus two is %d%n", 1);
                break;
            case 2:
                System.out.printf("Four minus two is %d%n", 2);
                break;
            default:
                System.out.println("error");
                break;
        }
        //4.3. piemērs (minus)
        System.out.printf("1 minus 2 is %s", 1 - 2);
    }
}
