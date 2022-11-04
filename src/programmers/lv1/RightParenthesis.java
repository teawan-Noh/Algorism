package programmers.lv1;

public class RightParenthesis {

	public static void main(String[] args) {

	    boolean solution(String s) {
	        boolean answer = false;
	        int count = 0;
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == '('){
	                count++;
	            }else{
	                count--;
	            }
	            if(count < 0) break;
	        }
	        if(count == 0 ){
	            answer = true;
	        }

	        return answer;
	    }

	}

}
