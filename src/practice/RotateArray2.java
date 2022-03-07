package practice;

import java.util.ArrayList;

public class RotateArray2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int rotationCnt = 4;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < rotationCnt; i++) {
			list.add(arr[i+5]);
		}
		for (int i = 0; i < arr.length - 4; i++) {
			list.add(arr[i]);
		}
		
		String a = "";
		a += "[";
		int temp = list.size();
		for (int i = 0; i < temp-1; i++) {
//			System.out.println(list.get(i));
			a += list.get(i) + ", ";
		}
		a += list.get(temp-1) + "]";
		System.out.println(a);

	}

}
