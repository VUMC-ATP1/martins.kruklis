package homework;

public class FirstClass {
    public static void main(String[] args) {
        //Main metodē vajag nodefinēt mainīgos (ar atbilstošo datatipu) Valstij (brīva izvēle)
        String countryName = "Latvia";
        int countryPopulation = 1850000;
        int countryAreaKm2 = 64589;
        String countryCapital = "Riga";
        String countryOfficalLanguage = "Latvian";
        Boolean isCountryEuMember = true;
        char countryCurrency = 'E';
        System.out.printf("Hello! My name is Martins and I live in %s. The capital of %s is %s and the official language is %s.\n",countryName, countryName, countryCapital, countryOfficalLanguage);
        System.out.printf("The population of %s in 2022 was %d people and the total area is %d km².\n",countryName, countryPopulation, countryAreaKm2);
        if (isCountryEuMember) {
            System.out.println("Latvia is a EU member state!");
        } else {
            System.out.println("Latvia is not a EU member state!");
        }
        float populationDensity = countryPopulation/countryAreaKm2;
        System.out.printf("The population density of Latvia is %.2f persons per km² \n", populationDensity);

        System.out.printf("Number \"4\" multiplied by \"5\" is %d", 4*5);
        System.out.printf("Number \"4\" divided by \"5\" with two decimal point precision is %.2f", 4/5);

    }
}
