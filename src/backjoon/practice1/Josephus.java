package backjoon.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Josephus {

	public static void main(String[] args) throws IOException {
		//첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000) ex)7 3
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
//		String s = bf.readLine(); //String
//		int i = Integer.parseInt(bf.readLine()); //Int
		
		String inputVal = bf.readLine();
		
		int cnt = Integer.parseInt(inputVal.split(" ")[0]);
		int target = Integer.parseInt(inputVal.split(" ")[1]);
		
		ArrayDeque<Integer> arr = new ArrayDeque<Integer>();
		for (int i = 1; i <= cnt; i++) {
			arr.addLast(i);
		}

		String output = "<";
		while(!arr.isEmpty()) {
			for (int i = 0; i < target-1; i++) {
				int temp = arr.pop();
				arr.addLast(temp);
			}
			output += arr.pop() + ", ";
		}
		int len = output.length();
		output = output.substring(0, len-2); //마지막 ", " 삭제
		output += ">";
		System.out.print(output);
	}
}
