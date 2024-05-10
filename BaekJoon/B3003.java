package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int chess[] = {1, 1, 2, 2, 2, 8};
		int input[] = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < chess.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
			if(input[i] < 0 || input[i] > 10) {
				System.out.println("10을 초과하거나 0보다 작으면 프로그램을 종료합니다.");
				System.exit(1);
			}
		}
		for (int i = 0; i < chess.length; i++) {
			System.out.print(chess[i] - input[i] + " ");
		}
		
		br.close();
	}

}
