package code.low;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Enter 1st number: ");
		n1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		n2 = sc.nextInt();
		
		int x = n2;
		n2 = n1;
		n1 = x;
		System.out.println("After swapping, 1st number = " + n1);
		System.out.println("After swapping, 2nd number = " + n2);
	}
}
/*We also can use add and subtracting logic for swapping*/