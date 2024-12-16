import java.util.Scanner;
public class Assignment_6_3 {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) 
				System.out.print(" ");
			
			for (int j = 1; j < (i+1) * 2; j++)
				System.out.print("*");
			
			System.out.print("\n");
		}
		
	}
}
