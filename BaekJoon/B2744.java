package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb);
		br.close();

	}

}
