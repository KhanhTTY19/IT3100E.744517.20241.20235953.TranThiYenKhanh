/* Write a program to display the number of days of a month, which is 
entered by users (both month and year). If it is an invalid month/year, 
ask the user to enter again. */ 
import java.util.*;
public class Assignment_6_4 {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		String month[] = {"january", "february", "march", "april", "may", "june", 
						"july", "august", "september", "october", "november", "december"};
		
		int mon = 13;
		String ninp_month = new String();
		System.out.println("Please enter the month: ");
		while (mon == 13) {
			ninp_month = inp.nextLine();
			String inp_month = ninp_month.toLowerCase();
			for (int i = 0; i < 12; i++) {
				if (inp_month.equals(month[i]) || inp_month.equals(month[i].substring(0, 3))
					|| inp_month.equals(month[i].substring(0, 3).concat(".")) 
					|| inp_month.equals(String.valueOf(i + 1))) {
					mon = i + 1;
					break;
				}
			}
			
			if (mon == 13) {
				System.out.println("Please enter a valid month: ");
			}
		}
			
		int inp_year = 0;
		boolean valid = false;
		System.out.println("Please enter the year: ");
		while(!valid) {
			try {
				inp_year = inp.nextInt();
				if (inp_year >=0) {
					valid = true;
				} else {
					System.out.println("Invalid input. Please enter a valid integer: ");
				}
			} catch (InputMismatchException e){
				System.out.println("Invalid input. Please enter a valid integer: ");
				inp.next();
			}
		}
		inp.close();
		Map <Integer, Integer> day_of_month = new HashMap<>();
		day_of_month.put(1, 31);
		day_of_month.put(3, 31);
		day_of_month.put(5, 31);
		day_of_month.put(7, 31);
		day_of_month.put(8, 31);
		day_of_month.put(10, 31);
		day_of_month.put(12, 31);
		day_of_month.put(4, 31);
		day_of_month.put(6, 31);
		day_of_month.put(9, 31);
		day_of_month.put(11, 31);
	
		if (mon == 2) {
			if (inp_year % 4 != 0) {
				System.out.println("Number of days of " + ninp_month + " in " 
									+ String.valueOf(inp_year) + " is: 28");
			} else {
				if (inp_year % 100 != 0) {
					System.out.println("Number of days of " + ninp_month + " in " 
							+ String.valueOf(inp_year) + " is: 29");
				} else {
					System.out.println("Number of days of " + ninp_month + " in " 
							+ String.valueOf(inp_year) + " is: 28");
				}
			}
		} else {
			System.out.println("Number of days of " + ninp_month + " in " 
					+ String.valueOf(inp_year) + " is " + String.valueOf(day_of_month.get(mon)));
		}
	}
}
