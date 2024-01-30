package week1;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principle,time,rate;
		float sI;
		System.out.println("Enter principle,time,rate : ");
		principle = sc.nextInt();
		time=sc.nextInt();
		rate=sc.nextInt();
		sI = (principle*time*rate/100);
		System.out.println("Simple Interest is :" +sI);

	}

}