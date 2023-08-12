package code.low;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r;
		System.out.println("Enter radius of Circle,r = ");
		r = sc.nextFloat();
		double a = 3.1416 * r * r;
		System.out.printf("Area of Circle = "+ "%.3f",  a);
	}
} 
