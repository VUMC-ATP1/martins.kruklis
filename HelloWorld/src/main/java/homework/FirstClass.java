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
        System.out.printf("Hello! My name is Martins and I live in %s. The capital of %s is %s and the offical language is %s.\n",countryName, countryName, countryCapital, countryOfficalLanguage);
        System.out.printf("The population of %s in 2022 was %d people and the total area is %d km².\n",countryName, countryPopulation, countryAreaKm2);
        if (isCountryEuMember) {
            System.out.println("Latvia is a EU member state!");
        } else {
            System.out.println("Latvia is not a EU member state!");
        }
        System.out.printf("The population density of Latvia is %f", countryPopulation/countryAreaKm2);
    }
}
