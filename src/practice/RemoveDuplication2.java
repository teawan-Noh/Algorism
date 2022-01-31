package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplication2 {
	//배열을 사용하면 선언시에 배열의 크기를 지정해서 배열의 크기가 고정되는데 몇개가 중복되는지 모르는 상황에서는 어떻게 쓰지?
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 2, 5, 7, 7, 8};
		System.out.println(arr.length+" ");
		Set<Integer> map = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
			map.add(arr[i]);
		}
		
		System.out.println(map.toString()); 
		
	}
}
