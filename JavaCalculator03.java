import java.util.Scanner;
/**
 * OOP Version
 * 
 * Use Java 17 or greater
 */
public class JavaCalculator03 {

    private LoanRecord inputData() {
        var sc = new Scanner(System.in);
        System.out.printf("           Loan: ");
        var loan = sc.nextDouble();
        System.out.printf("       Interest: ");
        var interest = sc.nextDouble();
        System.out.printf("           Term: ");
        var term = sc.nextDouble();
        return new LoanRecord(loan, interest, term);
    }

    private double processData(LoanRecord loan) {
        var tempInterest = loan.interest() / 12.0;
        var result = loan.loan() * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -loan.term())));
        return result;
    }

    private void outputResult(double result) {
        System.out.printf("Monthly Payment: %.2f%n", result);
    }

    public void perform() {
        var loan = inputData();
        var result = processData(loan);
        outputResult(result);
    }

    public static void main(String[] args) {
        new JavaCalculator03().perform();
    }
}

record LoanRecord(double loan, double interest, double term) {}

// Single Source File Code example
// runs with java JavaCalculator03.java