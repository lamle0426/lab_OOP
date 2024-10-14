// Lab 01: Environment Setup and Java Basics
// Ex5:	Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String size = JOptionPane.showInputDialog(null, "Enter the size of the array:");
        int n = Integer.parseInt(size);

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            String x = JOptionPane.showInputDialog(null, "Enter the " + (i + 1) + " element of the array:");
            A[i] = Integer.parseInt(x);
        }

        Arrays.sort(A);

        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        double average = (double) sum / n;

        String result = "Sorted Array: " + Arrays.toString(A) +
                "\nSum: " + sum +
                "\nAverage: " + average;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
