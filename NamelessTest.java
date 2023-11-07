//java --enable-preview --source 21 Name.java    

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("           Loan: ");
    double loan = sc.nextDouble();
    System.out.print("       Interest: ");
    double interest = sc.nextDouble();
    System.out.print("           Term: ");
    double term = sc.nextDouble();
    double tempInterest = interest / 12.0;
    double result = loan * (tempInterest / (1.0 - Math.pow((1.0 + tempInterest), -term)));
    System.out.println("Monthly Payment: " + String.format("%.2f", result));
}

