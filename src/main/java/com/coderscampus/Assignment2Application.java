package com.coderscampus;
import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		Assignment2Application main = new Assignment2Application();
		main.game();
	}

	void game() {
		int userInput = 0;
		int attempts = 0;
		Random random = new Random();
		int correctAnswer;
		correctAnswer = random.nextInt(101);
		System.out.println(correctAnswer);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 100");
		while (userInput < 101 || userInput > 0) {
			userInput = Integer.parseInt(scanner.nextLine());
			if (userInput < correctAnswer || userInput < 0) {
				System.out.println("Please pick a higher number");
			}
			if (userInput > correctAnswer || userInput > 101) {
				System.out.println("Please pick a lower number");
			}
			if (userInput == correctAnswer) {
				break;
			}
			attempts++;
			if (attempts >= 5) {
				break;
			}
		}
		if (userInput != correctAnswer) {
			System.out.println("You lose, the number to guess was: " + correctAnswer);
			scanner.close();
			}
		if (userInput == correctAnswer) {
			System.out.println("You win!!!");
		}
		
	}
}
