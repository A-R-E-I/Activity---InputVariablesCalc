package Activity_InputVariablesCalc;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		System.out.println("Result: " + (n % 5));

	}

}
