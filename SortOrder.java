package week4;
import java.util.Scanner;
public class SortOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int t = 0;
		int arr[] = {48,99,100,111,1,2};
		while (i<5)
		{
			j = 4;
			while(j>i)
			{
				if(arr[j] < arr[j-1])
				{
					t=arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=t;
				}
				j = j-1;
			}
			i = i+1;
		}
		System.out.println("Sorted Array in ascending order:");
		i=0;
		while(i<5)
		{
			System.out.println(arr[i]+" ");
			i=i+1;
		}

	}

}
