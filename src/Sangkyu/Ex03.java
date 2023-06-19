package Sangkyu;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend, divisor, quotient;
		System.out.println("Input the dividend-number : ");
		Scanner kb = new Scanner(System.in);

		dividend = kb.nextInt();

		System.out.println("Input the divisor-number : ");
		divisor = kb.nextInt();

		quotient = dividend / divisor;

		System.out.println(dividend + "/" + divisor + " = " + quotient);
		kb.close();

	}

}
