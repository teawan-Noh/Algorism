package backjoon.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int result = 1;
		for (int i = input; i > 1; i--) {
			result *= i;
		}
		System.out.println(result);
	}

}
