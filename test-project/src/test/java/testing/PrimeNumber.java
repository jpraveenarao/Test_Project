package testing;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n = input.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("not  prime number");
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					System.out.print("not prime");
					break;
				}else {
					
		System.out.print("Prime");}}
			
	}
}
}