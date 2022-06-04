package backjoon.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
//		String s = br.readLine(); //String
//		int i = Integer.parseInt(br.readLine()); //Int
		
		int input = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		
		int temp = 0;
		int newNum = 0;
		a = input / 10;
		b = input % 10;
		int count = 0;

		while(newNum != input) {
			
//			System.out.println(a + ", " + b);
			temp = a + b;
			newNum = (b * 10) + (temp % 10); 
//			System.out.println(newNum);
			
			a = newNum / 10;
			b = newNum % 10;
			count++;
		}
		if(count == 0) count = 1; 
		System.out.println(count);
	}
}
