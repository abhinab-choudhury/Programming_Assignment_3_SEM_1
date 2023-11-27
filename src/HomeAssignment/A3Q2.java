package HomeAssignment;

import java.util.Scanner;

public class A3Q2 {
	public static void main(String[] args) {
		int day_n, day_f;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		day_n = obj.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		day_f = obj.nextInt();
		
		
		int cnt = 0;
		String begin = "Today is";
		while(cnt <= 1) {
			
			if(day_n == 7) {
				day_n = 0;
			}
			
			switch(day_n) {
				case 1:
					System.out.print( begin + " Monday ");
					break;
				case 2:
					System.out.print( begin + " Tuesday ");
					break;
				case 3:
					System.out.print( begin + " Wednesday ");
					break;
				case 4:
					System.out.print( begin + " Thursday ");
					break;
				case 5:
					System.out.print( begin + " Friday ");
					break;
				case 6:
					System.out.print( begin + " Saturday ");
					break;
				case 0:
					System.out.print( begin + " Sunday ");
					break;
				default:
					System.out.print("Wronng Choise.");
			}
			System.out.println("Logic Incomplete.");
			
			cnt++;
		}
		
		obj.close();
	}
}
