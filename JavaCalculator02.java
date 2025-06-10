// Runs with java JavaCalculator02.java 
// using Java 25

void main() {
    var loan = Double.parseDouble(IO.readln("Loan: "));
    var interest = Double.parseDouble(IO.readln("Interest: "));
    var term = Double.parseDouble(IO.readln("Term: "));
    var tempInterest = interest / 12.0;
    var result = loan * 
		(tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    IO.println("Monthly Payment: " + String.format("%.2f", result));
}
    
