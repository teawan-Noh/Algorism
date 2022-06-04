package backjoon.practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WoodStick_2947 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
//		String s = br.readLine(); //String
//		int i = Integer.parseInt(br.readLine()); //Int
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		for (int i = 0; i < 5; i++) {
			arr.add(Integer.parseInt((st.nextToken())));
		}
		
		int temp = 0;
		for (int k = 0; k < arr.size() -1; k++) {
			for (int i = 0; i < arr.size() -1; i++) {
				int a = 0;
				if(arr.get(i) > arr.get(i+1)) {
					temp = arr.get(i);
					arr.set(i, arr.get(i+1));
					arr.set(i+1, temp);
					a = 1;
				}
				if(a == 1) {
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < arr.size(); j++) {
						sb.append(arr.get(j));
						if(j < arr.size()-1) {
							sb.append(" ");
						}
					}
					System.out.println(sb);
				}
			}
		}
	}
}
