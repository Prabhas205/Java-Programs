package week4;
public class AverageOfArrays {

	public static void main(String[] args) {
		int[] nums = {8,9,10,11};
		int sum = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		   double average=(double)sum/nums.length;
		System.out.println("sum is:" +sum);
		System.out.print("Average is :"+average);
	}
	

}
