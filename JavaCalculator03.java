// Runs with java --enable-preview JavaCalculator03.java
// using Java 23

import static java.io.IO.*;

public class JavaCalculator03 {
    
    void main() {
        var loan = inputData();
        var result = processData(loan);
        outputResult(result);
    }

    private LoanRecord inputData() {
        var loan = Double.parseDouble(readln("Loan >> "));
        var interest = Double.parseDouble(readln("Interest >> "));
        var term = Double.parseDouble(readln("Term >> "));
        return new LoanRecord(loan, interest, term);
    }

    private double processData(LoanRecord loan) {
        double tempInterest = loan.interest() / 12.0;
        double result = loan.loan() * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -loan.term())));
        return result;
    }

    private void outputResult(double result) {
        println("Monthly Payment >> " + String.format("%.2f", result));
    }
}

record LoanRecord(double loan, double interest, double term) {}
