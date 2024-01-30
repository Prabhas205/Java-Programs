package week4;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		int[] nums = {45,32,56,2};
		int min = nums[0];
		int max = nums[0];
		for(int i =1;i<nums.length;i++)
		{
			if(nums[i] > max) 
			{
				max = nums[i];
		}	
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("Maximum is" +max);
			System.out.println("Minimum is" +min);

	}

}
