import java.util.Scanner;

public class JavaCalculator01 {

    public static void main(String[] args) {
       
	    double loan = 1000.0;
		double interest = 0.05;
		double term = 5;

        var tempInterest = interest / 12.0;
        var result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));

        System.out.printf("Monthly Payment: %.2f%n", result);
    }
}

// Single Source File Code example
// runs with java JavaCalculator01.java
