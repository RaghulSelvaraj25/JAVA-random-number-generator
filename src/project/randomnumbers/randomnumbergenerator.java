package project.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class randomnumbergenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Random Number Generator");
        System.out.println("-----------------------------");
		while(true) {
			int randomNumber = random.nextInt(100)+1;
			System.out.println("Generated Number: " + randomNumber);
			System.out.print("Do you want to generate another number? (yes/no): ");
			String input = scanner.nextLine().trim().toLowerCase();
			if(input.equalsIgnoreCase("no")) {
			System.out.println("Exiting the program. Goodbye!");
			break;
		} else if (input.equalsIgnoreCase("yes")) {
			System.out.print("Another random number : ");
		} else {
			System.out.print("Invalid input. Please type 'yes' or 'no'.");
		}
			
		}
	
        
		scanner.close();
		
	}

}
