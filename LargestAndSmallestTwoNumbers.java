package week4;
import java.util.Arrays;
import java.util.Scanner;
public class LargestAndSmallestTwoNumbers {

	public static void main(String[] args) {
		int[] nums = {23,78,34,2,4,8};
		Arrays.sort(nums);
		int smallest1 = nums[0];
		int smallest2 = nums[1];
		int largest1 = nums[nums.length-1];
		int largest2 = nums[nums.length-2];
		System.out.println("Smallet two numbers :"+smallest1+","+smallest2);
		System.out.println("Largest two numbers :"+largest1+","+largest2);

	}

}
