package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Star_2523 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. 
		//첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
//		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
//		String s = bf.readLine(); //String
//		int i = Integer.parseInt(bf.readLine()); //Int
		int temp = Integer.parseInt(bf.readLine());
		int leng = (temp*2)-1;
		int cnt = 0;
		String star = "*";
		
		for(int i = 1; i <= leng; i++) {
			if(i <= temp) {
				cnt++;
			}else {
				cnt--;
			}
			for(int j = 0; j < cnt; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
