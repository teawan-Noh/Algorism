package practice;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int[] nums = {2, 8, 19, 37, 4, 5};
		int target = 13;
		
		int[] result = twoSum(nums, target);
		System.out.println(result[0] +", " + result[1]);
		

	}
	static int[] twoSum(int[] nums, int target) {
		
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		int[] result = new int[2];
		
		while(i < j) {
			int sum = nums[i] + nums[j];
			if(sum == target) {
				result[0] = nums[i];
				result[1] = nums[j];
				return result;
			}else if(sum > target) {
				j--;
			}else {
				i++;
			}
		}
		
		return null;
		
	}

}
