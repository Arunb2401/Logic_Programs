package logicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	private static int FibLength = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter length: ");
		FibLength = scan.nextInt();
		scan.close();		//Method calling.
		series();
	}

	public static void series() {				//Method creating.

		int[] num = new int[FibLength];
		num[0] = 0;
		num[1] = 1;

		for (int i = 2; i < FibLength; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		System.out.println("Fibonacci Series: ");
		for (int i = 0; i < FibLength; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
