package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
//코테에서는 ArrayList를 쓰자
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 2, 5, 7, 7, 8};
//		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> result = removeDuplicate(arr);
		String a = "[";
		int temp = result.size() - 1;
		for (int i = 0; i < temp; i++) {
			System.out.println(i);
			a += result.get(i)+", ";
		}
		a+=result.get(temp) + "]";
		System.out.println(a);
	}

	public static ArrayList<Integer> removeDuplicate(int[] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(array[0]);
		for (int i = 1; i < array.length; i++) {
			if(!result.contains(array[i])) {
				result.add(array[i]);
			}
		}
		return result;
	}
}
