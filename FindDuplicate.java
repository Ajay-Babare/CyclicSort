// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	public static int findDuplicate(int[] nums) {
		int i = 0;
		while(i<nums.length) {
			int correct = nums[i]-1;
			if(nums[i] != i+1) {
				if(nums[i] != nums[correct]) {
					swap(nums, i, correct);
				}
				else {
					return nums[i];
				}
			}
			else {
				i++;
			}
		}
		return -1;
	}
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;		
	}
}
