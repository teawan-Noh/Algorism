package sort;

public class Bubble {

	public static void main(String[] args) {
		int temp;
		int[] arr = {50, 40, 90, 10, 60};
		
		for (int j = 0; j < arr.length - 1; j++) {
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();	
		}
		

	}

}
