/*Write a Java program to sort a numeric array, 
and calculate the sum and average value of array elements.*/

import java.util.Scanner;
public class Assignment_6_5 {
	private static int a[];
	private static int n;
	
	public static void main(String args[]) {
		input();
		int s = getSum();
		partition(0, n - 1);
		printArr();
	}
	
	public static void input() {
		System.out.println("Enter the number of element: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		a  = new int[n];
		System.out.println("Enter n element of the array a: ");
		for (int i = 0; i < n; i++) {
			a[i] = inp.nextInt();
		}
	}
	
	public static int getSum() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			s += a[i];
		}
		return s;
	}
	
	public static void partition(int l, int r) {
		
		if (l >= r) return;
		
		int pivot = a[r],i = l, j = 0;
		while(i < r - j) {
			if (a[i] <= pivot) {
				i++;
				continue;
			}
			swap(i, r - j);
			j++;
		}
		partition(l, i - 1);
		partition(i, r);
	}
	
	public static void swap(int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void printArr() {
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}
