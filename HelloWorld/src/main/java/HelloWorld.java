import java.util.Scanner;  // Import the Scanner class
public class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("First argument is %s\n", args[0]);
        System.out.printf("Second argument is %s\n", args[1]);
        String[] twoWords = {"hey", "man"};
        System.out.printf("My string is %s\n", twoWords[0]);
        short salariesinIt[] = {1000, 2000, 3000};
        short emptySalariesinIt[] = new short[4];
        emptySalariesinIt[0] = 1000;
        emptySalariesinIt[1] = 2000;
        emptySalariesinIt[2] = 3000;
        emptySalariesinIt[3] = 4000;
        System.out.println(emptySalariesinIt[2]);
        short juniorTestetSalary = 1000;
        System.out.printf("Minimum salary of junior QA tester is %d\n", juniorTestetSalary);
        float myWeight = 86.4f;
        System.out.printf("My weigth is %.2f\n", myWeight);
        boolean isSummer = false;
        System.out.printf("%b\n", isSummer);
        if (isSummer) {
            System.out.printf("Today is summer and boolean value is %b\n");
        } else {
            System.out.println("Today is not summer!");
        }
        String myName = "martins";
        System.out.println("7" + 7);
        String s="200";
        //Converting String into int using Integer.parseInt()
        int i=Integer.parseInt(s);
        System.out.println(i);
    }
}