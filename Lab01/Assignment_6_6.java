//Write a Java program to add two matrices of the same size. 

import java.util.*;
public class Assignment_6_6 {
	public static void main(String args[]) {
		int row = 0, col = 0;
		Scanner inp = new Scanner(System.in);
		
		boolean valid = false;
		
		while(!valid) {
			try {
				System.out.println("Enter number of rows: ");
				row = inp.nextInt();
				valid = true;
			} catch(InputMismatchException e) {
				System.out.print("Please enter the valid value. ");
			}
		}
		
		while(valid) {
			try {
				System.out.println("Enter the number of column: ");
				col = inp.nextInt();
				valid = false;
			} catch(InputMismatchException e) {
				System.out.print("Please enter the valid value. ");
			}
		}
		
		System.out.println("Enter the first matrix: ");
		int mat_a[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat_a[i][j] = inp.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix: ");
		int mat_b[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat_b[i][j] = inp.nextInt();
				mat_a[i][j] += mat_b[i][j];
			}
		}
		inp.close();
		System.out.println("The sum of upper two matrices is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%3d ", mat_a[i][j]);
			}
			System.out.print("\n");
		}
	}
}
