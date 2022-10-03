package com.coderscampus.myapp.main;

public class App {

	/** NO CODE GOES IN THIS MAIN METHOD */
	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {
		// Your code goes here, not in the main() method
		System.out.println("My code goes here, not in the main() method\n\n");
		System.out.println(more("But wait! There's more!"));
	}

	private String more(String text) {
		String intro = "Hey look, I called another method in the same class!\n";
		return intro + text;
	}

}
