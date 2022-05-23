package backjoon.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack1_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
//		String s = bf.readLine(); //String
//		int i = Integer.parseInt(bf.readLine()); //Int
		
		int cnt = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < cnt; i++) {
			String input = bf.readLine();
			if(input.equals("top")) {
				if(stack.empty() == false) {
					System.out.println(stack.peek());
				}else {
					System.out.println(-1);
				}
			}else if(input.equals("size")) {
				System.out.println(stack.size());
			}else if(input.equals("empty")) {
				int temp;
				boolean bool = stack.empty();
				if(bool == false) {
					temp = 0;
				}else{
					temp = 1;
				};
				System.out.println(temp);
			}else if(input.equals("pop")) {
				if(stack.empty() == false) {
					System.out.println(stack.pop());
				}else {
					System.out.println(-1);
				}
			}else {
//				String val = input.split("h")[1].strip();
				String val = input.split(" ")[1];
				int intVal = Integer.parseInt(val);
				stack.push(intVal);	
			}
		}
	}

}
