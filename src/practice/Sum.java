package practice;

import java.util.Arrays;
//두 수의 합
//숫자들의 배열이 주어지고 표적 숫자가 주어졌다고 합시다. 배열에 주어진 숫자들 중 두 개의 숫자를 더하면 표적 숫자가 되는데요, 이때 어떤 두 수를 더하면 표적숫자가 되는지 찾는 문제를 풀어 봅시다.
//예를 들어서, [2, 8, 19, 37, 4, 5] 가 배열로 주어지고 12 가 표적으로 주어지면 8,4 를 찾아내시면 됩니다.

//입력 배열에는 중복되는 수가 없습니다.
//입력 배열에는 합해서 표적이 되는 어떤 두 수가 반드시 있습니다.
//출력의 순서는 상관 없습니다. 위 예시의 경우, 8,4 와 4,8은 둘 다 정답으로 인정합니다.
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
