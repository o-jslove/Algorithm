package baekjoon;

import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] digits = input.split(" ");
		
		int sum = 0;
		
		for (String digit : digits) {
			int num = Integer.parseInt(digit);
			sum += num * num;
		}
		
		int result = sum % 10;
		
		System.out.println(result);
		
		sc.close();
	}

}
