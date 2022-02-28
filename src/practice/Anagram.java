package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
	
	// 1.문자열을 문자배열로 바꾼다.
	// 2.문자배열을 정렬한다.
	// 3.문자배열을 비교한다
	public static void main(String[] args) {
		String a = "cas";
		String b = "acw";
		
		char[] list1 = a.toCharArray();
		char[] list2 = b.toCharArray();
		
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		System.out.println(Arrays.equals(list1, list2));
	}
}
