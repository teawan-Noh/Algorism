package programmers.lv1;

import java.util.Arrays;

public class RentClothes {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		Arrays.sort(lost);
	    Arrays.sort(reserve);
		
		int llength = lost.length;
		int rlength = reserve.length;
		
		int answer = n - lost.length;
		
		for(int i=0; i<llength; i++) {
			for(int j=0; j<rlength; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		
		for(int i=0; i<llength; i++) {
			for(int j=0; j<rlength; j++) {
				if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
	}
}
