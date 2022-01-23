package sort;

public class Select {

	public static void main(String[] args) {
		
		int[] arr = {40, 70, 60, 30, 10};
		System.out.println(arr.length);
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int tmp= i;
			for (int j = i+1; j < arr.length ; j++) {
				if ( min > arr[j]) {
					min = arr[j];
					tmp = j;
				}
			}
			arr[tmp]=arr[i];
			arr[i]=min;
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}

	}
	

}
