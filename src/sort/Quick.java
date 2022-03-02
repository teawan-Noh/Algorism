package sort;

public class Quick {

	public static void main(String[] args) {

		
		int number = 10;
		int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		quickSort(data, 0, number - 1);
		for(int i = 0; i < number; i++) {
			System.out.printf("%d", data[i]);
		}
	}
	
	static void quickSort(int[] data, int start, int end) {
		if(start >= end) {  // 원소가 1개인 경우
			return;
		}
		
		int key = start; // 키는 첫번째 원소
		int i = start + 1;
		int j = end;
		int temp;
		
		while(i <= j) { // 엇갈릴 때까지 반복
			while(i <= end && data[i] <= data[key]) { // 키 값보다 큰 값을 만날때까지 오른쪽으로 이동
				i++;
			}
			while(data[j] >= data[key] && j > start) { // 키 값보다 작은 값을 만날때 까지
				j--;
			}
			if(i > j) { // 현재 엇갈린 상태면 키 값과 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else { //엇갈리지 않았다면 큰값과 작은값의 위치를 교체
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}

	
}
