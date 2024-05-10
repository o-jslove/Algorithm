package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = 0;
		
		while (true) {
			year = Integer.parseInt(br.readLine());
			
			if(year >= 1 && year <= 4000) {
				break;
			}
		}		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		br.close();
	}
	
}
