package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplication2 {
	//set을 사용하면 중복된 값을 저장하지 않는다
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 2, 5, 7, 7, 8};
		
		Set<Integer> map = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
			map.add(arr[i]);
		}
		
		System.out.println(map.toString()); 
		
	}
}
