package code.low;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.println("Enter a number: ");
		n1 = sc.nextInt();
		int r = n1%2;
		if (r == 0) { 
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}
