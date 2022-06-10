package homework.classHomework;

import java.util.Scanner;

public class trīsstūris {
    int lengthA;
    int lengthB;
    int lengthC;
    int area;

    public trīsstūris(int lengthA, int lengthB, int lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        double semiPer = (this.lengthA + this.lengthB + this.lengthC) / 2.0d;
        double resArea = Math.sqrt(semiPer * (semiPer - this.lengthA) * (semiPer - this.lengthB) * (semiPer - this.lengthC));
        this.area = (int) resArea;
    }

    public trīsstūris() {
        System.out.println("Veidojam trīsstūri...");
    }

    public boolean isEquilateral() {
        return this.lengthA == this.lengthB && this.lengthB == this.lengthC;
    }

    public boolean isIsosceles() {
        return this.lengthA == this.lengthB || this.lengthB == this.lengthC || this.lengthC == this.lengthA;
    }

    public static void main(String[] args) {
//trīsstūris1
        trīsstūris triangle1 = new trīsstūris();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi 1. trīsstūra pirmās malas garumu!");
        triangle1.lengthA = scanner.nextInt();
        System.out.println("Lūdzu, ievadi 1. trīsstūra otrās malas garumu!");
        triangle1.lengthB = scanner.nextInt();
        System.out.println("Lūdzu, ievadi 1. trīsstūra trešās malas garumu!");
        triangle1.lengthC = scanner.nextInt();
        if (triangle1.isEquilateral()) {
            System.out.println("1. trīsstūris ir vienādmalu");
        } else {
            System.out.println("1. trīsstūris nav vienādmalu");
        }
        if (triangle1.isIsosceles()) {
            System.out.println("1. trīsstūris ir vienādsānu");
        } else {
            System.out.println("1. trīsstūris nav vienādsānu");
        }
//trīsstūris2
        System.out.println("Lūdzu, ievadi 2. trīsstūra pirmās malas garumu!");
        int lengthA = scanner.nextInt();
        System.out.println("Lūdzu, ievadi 2. trīsstūra otrās malas garumu!");
        int lengthB = scanner.nextInt();
        System.out.println("Lūdzu, ievadi 2. trīsstūra trešās malas garumu!");
        int lengthC = scanner.nextInt();
        trīsstūris triangle2 = new trīsstūris(lengthA, lengthB, lengthC);
        System.out.printf("%nTika izveidots trijstūris ar malu garumiem '%d','%d' un '%d' un tā laukums ir %d (noapaļots skaitlis)%n", triangle2.lengthA, triangle2.lengthB, triangle2.lengthC, triangle2.area);
        if (triangle2.isEquilateral()) {
            System.out.println("2. trīsstūris ir vienādmalu");
        } else {
            System.out.println("2. trīsstūris nav vienādmalu");
        }
        if (triangle2.isIsosceles()) {
            System.out.println("2. trīsstūris ir vienādsānu");
        } else {
            System.out.println("2. trīsstūris nav vienādsānu");
        }
    }
}
