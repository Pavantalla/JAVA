package code.low;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter two numbers: ");
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		int add = n1+n2;
		int sub = n1-n2;
		int mul = n1*n2;
		int div = n1/n2;
		int mod = n1%n2;
		System.out.println("Add = "+ add);
		System.out.println("Sub = "+ sub);
		System.out.println("Mul = "+ mul);
		System.out.println("Div = "+ div);
		System.out.println("Mod = "+ mod);
	}
}