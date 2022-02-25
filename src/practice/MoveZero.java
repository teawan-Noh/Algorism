package practice;

import java.util.ArrayList;

public class MoveZero {

	public static void main(String[] args) {
		int[] arr = {0, 8, 0, 37, 4, 5, 0, 50, 0 ,34, 0 ,0};
		
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i) == 0) {
				arrList.remove(i);
				arrList.add(0);
			}
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i));
		}
		
	}
}
