package Activity_InputVariablesCalc;

import java.util.Scanner;

public class question_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter another integer: ");
		int num2 = input.nextInt();
		
		System.out.println("Sum: " + (num1 + num2));
		System.out.println("Product: " + (num1 * num2));

	}

}
