// Write a program to solve:
// For simplicity, we only consider the real roots of the equations in this task.

// 	The first-degree equation (linear equation) with one variable
// Note: A first-degree equation with one variable can have a form such as ax+b=0 (a≠0).
// You should handle the case where the user input value 0 for a.
// 	The system of first-degree equations (linear system) with two variables
// Note: A system of first-degree equations with two variables x_1 and x_2 can be written as follows.
// {a_11 x_1+a_12 x_2=b_1  a_21 x_1+a_22 x_2=b_2  
// You should handle the case where the values of the coefficients produce infinitely many solutions and the case where they produce no solution.
// Hint:
// Use the following determinants:
// D=|a_11  a_12  a_21  a_22  |=a_11 a_22-a_21 a_12 D_1=|b_1  a_12  b_2  a_22  |=b_1 a_22-b_2 a_12 D_2=|a_11  b_1  a_21  b_2  |=a_11 b_2-a_21 b_1

// 	The second-degree equation with one variable
// Note: A second-degree equation with one variable (i.e., quadratic equation) can have a form such as ax^2+bx+c=0, where x is the variable, and a, b, and c are coefficients (a≠0). 
// You should handle the case where the values of the coefficients produce a double root & the case where they produce no root. You should also handle the case where the user input value 0 for a.
// Hint:	
// Use the discriminant Δ=b^2-4ac

import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Choose the type of equation to solve:\n"
                + "1 - First-degree equation (ax + b = 0)\n"
                + "2 - System of first-degree equations with two variables\n"
                + "3 - Second-degree equation (ax^2 + bx + c = 0)");

        int option = Integer.parseInt(choice);

        switch (option) {
            case 1:
                First_Degree_Equation();
                break;
            case 2:
                System_First_Degree_Equations();
                break;
            case 3:
                Second_Degree_Equation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option selected.");
        }
    }

    public static void First_Degree_Equation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter constant b:"));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }

    public static void System_First_Degree_Equations() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter constant b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter constant b2:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solution is:\n x1 = " + x1 + "\n x2 = " + x2);
        }
    }

    public static void Second_Degree_Equation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter constant c:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "The coefficient 'a' must not be zero for a quadratic equation.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two real roots:\n root1 = " + x1 + "\n root2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has a double root: " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real roots.");
            }
        }
    }
}

