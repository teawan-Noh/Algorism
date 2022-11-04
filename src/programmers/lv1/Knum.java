package programmers.lv1;

import java.util.*;

public class Knum {
	public static void main(String[] args) {
	    public int[] solution(int[] array, int[][] commands) {
	    	
	        int[] answer = new int[commands.length];
	        ArrayList<Integer> result = new ArrayList<>();
	        for(int i=0; i<commands.length; i++){
	            int start = commands[i][0];
	            int end = commands[i][1];
	            int target = commands[i][2];
	            ArrayList<Integer> arr = new ArrayList<>();
	            
	            for(int j=start; j<end+1; j++){
	                arr.add(array[j-1]);
	                Collections.sort(arr);
	            }
	            // System.out.println(arr);
	            answer[i] = arr.get(target-1);
	            // System.out.println(result);
	        }
	        
	        // System.out.println(result);
	        return answer;
	    }
	}
}
