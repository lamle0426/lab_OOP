// Lab 01: Environment Setup and Java Basics
// Ex 6.6:  Write a Java program to add two matrices of the same size.

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row for two matrices: m = ");
        int m = sc.nextInt();
        System.out.print("Enter the number of column for two matrices: n = ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] res = new int[m][n];

        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B["+i+"]["+j+"] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
