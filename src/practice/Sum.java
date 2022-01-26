package practice;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		
		int[] nums = {2, 8, 19, 37, 4, 5};
		int target = 12;
		
		int[] result = twoSum(nums, target);
		System.out.println(result[0] +", " + result[1]);
	}
	
	static int[] twoSum(int[] nums, int target) {
		
		Arrays.sort(nums);
		int i = 0, j = 0;
		int num1;
		int num2;
		int temp = 0;
		int[] arr2 = new int[2];
		
		while(nums[j] < target) {
			j++;
			temp = j - 1;
		}
		while(nums[i] <= target){
			num1 = nums[i];
			int x = target - num1;
			while(nums[temp] >= x) {
				temp--;
				if(nums[temp] == x) {
					num2 = nums[temp];
					arr2[1] = num2;
				}
			}
			arr2[0] = num1;
			i++;
		}
		return arr2;
	};
}
