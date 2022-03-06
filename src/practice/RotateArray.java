package practice;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int rotationCnt = 4;
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		ArrayList<Integer> result = rotateArray(list, rotationCnt);
		String a = "[";
		int temp = result.size();
		for (int i = 0; i < temp - 1; i++) {
			a += result.get(i) + ",";
		}
		a += result.get(temp-1) + "]";
		System.out.println(a);
	}

	private static ArrayList<Integer> rotateArray(ArrayList<Integer> list, int rotationCnt) {
		int temp = 0;
		for (int i = 0; i < rotationCnt; i++) {
			temp = list.get(list.size()-1);
			list.remove(list.size()-1);
			list.add(0, temp);
		}
		return list;
		
		
	}
}
