package practice;

import java.util.Arrays;
import java.util.OptionalInt;

import sort.Quick;

public class Subtract {

	// 가장 큰 두 수의 차
	//0보다 큰 정수들의 배열이 주어졌다고 합시다. 여기서 가능한 모든 서로 다른 두 숫자의 차이를 고려 해 보고, 이중 가장 큰 차이를 반환하는 함수를 적어봅시다. 
	//예를 들어서, [2, 8, 19, 37, 4, 5, 12, 50, 1, 34, 23] 가 입력으로 주어졌을 경우 가장 큰 차이를 내는 숫자쌍은 50-1 = 49 입니다.
	
	//두 수의 차에 해당하는 값을 반환하면 됩니다. 위 예시의 경우, 49를 반환합니다.
	//양의 값을 반환해야 합니다. 위 예시의 경우 -49가 아니라 49를 반환해야 합니다.
	//배열의 길이는 2보다 크거나 같다고 가정합니다.
	
	
	public static void main(String[] args) {
		int[] data = {2, 8, 19, 37, 4, 5, 12, 50, 1, 34, 23};
		
		//퀵정렬 이용
//		Quick.quickSort(data, 0 , data.length - 1);
//		int result = data[data.length-1] - data[0];
//		System.out.println(result);
		
		//Arrays.sort 사용
		Arrays.sort(data);
		int result2 = data[data.length-1] - data[0];
		System.out.println(result2);
		
		//Arrays.stream 사용
		int max = Arrays.stream(data).max().getAsInt();
		int min = Arrays.stream(data).min().getAsInt();
		
		System.out.println(max-min);
		
		
		
	}

}
