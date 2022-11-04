package programmers.lv1;

public class HateSameNumber {

	public static void main(String[] args) {
		public int[] solution(int []arr) {
	        int[] answer = {};
	        
	        ArrayList<Integer> array = new ArrayList<>();
	        array.add(arr[0]);
	        for(int i=0; i<arr.length-1; i++){
	            if(arr[i] == arr[i+1]){
	                continue;
	            }else{
	                array.add(arr[i+1]);
	            }
	        }
	        // System.out.println(array);
	        answer = new int[array.size()];
	        for(int i=0; i<array.size(); i++){
	            answer[i] = array.get(i);
	        }
	        return answer;
	    }

	}

}
