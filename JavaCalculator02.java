// Runs with java --enable-preview --source 23 JavaCalculator02.java

void main() {
    var loan = Double.parseDouble(readln("Loan: "));
    var interest = Double.parseDouble(readln("Interest: "));
    var term = Double.parseDouble(readln("Term: "));
    var tempInterest = interest / 12.0;
    var result = loan * 
		(tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    println("Monthly Payment: " + String.format("%.2f", result));
}
    
