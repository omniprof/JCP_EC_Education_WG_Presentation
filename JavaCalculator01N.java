void main() {
       
    var loan = 1000.0;
	var interest = 0.05;
	var term = 5;

    var tempInterest = interest / 12.0;
    var result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));

    System.out.printf("Monthly Payment: %.2f%n", result);
}

// Single Source File Code example
// runs with java --enable-preview --source 21 JavaCalculator01.java
