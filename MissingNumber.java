// https://leetcode.com/problems/missing-number/

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {0,2,4,1};
		int num = missingNumber(nums);
		System.out.println(num);
	}
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length) {
        	int correct = nums[i];
        	if(nums[i]<nums.length && nums[i] != nums[correct]) {
        		swap(nums,i,correct);
        	}
        	else {
        		i++;
        	}
        }
       for(int index=0; index<nums.length; index++) {
    	   if(nums[index]!= index) {
    		   return index;
    	   }
       }
       return nums.length;
    }
   static void swap(int nums[], int first, int second) {
	   int temp = nums[first];
	   nums[first]=nums[second];
	   nums[second]=temp;
   }
}
