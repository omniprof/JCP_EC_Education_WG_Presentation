//java --enable-preview --source 21 Name.java    

import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);
    System.out.print("           Loan: ");
    var loan = sc.nextDouble();
    System.out.print("       Interest: ");
    var interest = sc.nextDouble();
    System.out.print("           Term: ");
    var term = sc.nextDouble();
    var tempInterest = interest / 12.0;
    var result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    System.out.println("Monthly Payment: " + String.format("%.2f", result));
}

