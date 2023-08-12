package code.low;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("Min = " + b);
			System.out.println("Max = " + a);
		}
		else {
			System.out.println("Min = " + a);
			System.out.println("Max = " + b);
		}
	}
}
