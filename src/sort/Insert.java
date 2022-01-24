package sort;

public class Insert {

	public static void main(String[] args) {
		int[] arr = {60, 40, 70, 50, 10, 20, 30}; 
		
		for (int i = 1; i < arr.length; i++) {
			int index = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > index) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = index;
			for (int i2 = 0; i2 < arr.length; i2++) {
				System.out.print(arr[i2] + " ");
				
			}
			System.out.println();
		}
	}

}
