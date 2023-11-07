import java.util.Scanner;

/**
 * Structured Version
 */
public class JavaCalculator02 {

    static double loan;
    static double interest;
    static double term;
    static double result;

    private static void inputData() {
        var sc = new Scanner(System.in);
        System.out.printf("           Loan: ");
        loan = sc.nextDouble();
        System.out.printf("       Interest: ");
        interest = sc.nextDouble();
        System.out.printf("           Term: ");
        term = sc.nextDouble();
    }

    private static void processData() {
        var tempInterest = interest / 12.0;
        result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    }

    private static void outputResult() {
        System.out.printf("Monthly Payment: %.2f%n", result);
    }

    public static void main(String[] args) {
        inputData();
        processData();
        outputResult();
    }
}

// Single Source File Code example
// runs with java JavaCalculator02.java
