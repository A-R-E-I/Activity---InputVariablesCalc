package Activity_InputVariablesCalc;

import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade 1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter grade 2: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter grade 3: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter grade 4: ");
		int num4 = input.nextInt();
		
		System.out.print("Enter grade 5: ");
		int num5 = input.nextInt();
		
		int total = num1 + num2 + num3 + num4 + num5;
		
		System.out.println("Average: " + (total/5));

	}

}
