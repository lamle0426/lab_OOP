// Lab 01: Environment Setup and Java Basics
// Ex 2.5: Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String quotientMessage;
        if (num2 != 0) {
            double quotient = num1 / num2;
            quotientMessage = "Quotient: " + quotient;
        } else quotientMessage = "Quotient: Cannot divide by zero";

        String message = "Sum: " + sum + "\n" +
                         "Difference: " + difference + "\n" +
                         "Product: " + product + "\n" +
                         quotientMessage;
        
        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
