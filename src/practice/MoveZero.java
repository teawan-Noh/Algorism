package practice;

import java.util.ArrayList;

public class MoveZero {

	public static void main(String[] args) {
		int[] arr = {0, 8, 0, 37, 4, 5, 0, 50, 0, 34, 0, 0, 72};
//		int[] arr = {0, 5, 0, 3, 0, 0, 7};
		
		int idx = 0;
		int arrLen = arr.length;
		int cnt = 0;
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arrLen; i++) {
			arrList.add(arr[i]);
		}
		
		while(cnt<arrLen) {
			if(arrList.get(idx)==0) {
				arrList.remove(idx);
				arrList.add(0);
			}else {
				idx++;
			}
			cnt++;
		}
		for(int i=0;i<arrLen;i++) {
			System.out.println(arrList.get(i));
		}
//		String a ="[";
//		while(temp<arrLen) {
//			if(arr[temp]==0) {
//				cnt+=1;
//			}else {
//				a+=arr[temp]+", ";
//			}
//			temp++;
//		}
//		for(int i=0; i<cnt-1;i++){
//			a+="0, ";
//		}
//		a+="0]";
//		System.out.println(a);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i));
		}
		
	}
}
