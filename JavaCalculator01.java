import java.util.Scanner;

/**
 * Stream of Consciousness Version
 */
public class JavaCalculator01 {

    public static void main(String[] args) {
       
        var sc = new Scanner(System.in);
        System.out.printf("           Loan: ");
        var loan = sc.nextDouble();
        System.out.printf("       Interest: ");
        var interest = sc.nextDouble();
        System.out.printf("           Term: ");
        var term = sc.nextDouble();

        var tempInterest = interest / 12.0;
        var result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));

        System.out.printf("Monthly Payment: %.2f%n", result);
    }
}

// Single Source File Code example
// runs with java JavaCalculator01.java
