package Sangkyu;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input the first-number : ");
		num1 = kb.nextInt();

		System.out.println("Input the second-number : ");
		num2 = kb.nextInt();

		sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + sum);
		kb.close();
	}

}
