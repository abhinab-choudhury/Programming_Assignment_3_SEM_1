package LabAssignment;

import java.util.Scanner;

public class A3Q4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int random_num = (int)(1 + (9 * Math.random()));
		System.out.print("Enter user number: ");
		int user_guess = obj.nextInt();
	
		if(user_guess == random_num) {
			System.out.println("You got it right");
		} else if(Math.abs(random_num - user_guess) == 1) {
			System.out.println("Almost got it");
		} else {
			System.out.println("You got it wrong");
		}
		obj.close();
	}
}
