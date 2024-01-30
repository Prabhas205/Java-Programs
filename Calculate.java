package arithmetic;
import arithmetic.ArithmeticOperations;
public class Calculate {

	public static void main(String[] args) {
		ArithmeticOperations ao = new ArithmeticOperations();
		int x = 90,y = 100;
		System.out.println("Addition is:"+ao.addition(x, y));
		System.out.println("Subtraction is :"+ao.subtraction(x, y));
		System.out.println("Multiplication is :"+ao.multiplication(x, y));
		System.out.println("Division is :"+ao.division(x, y));

	}

}
