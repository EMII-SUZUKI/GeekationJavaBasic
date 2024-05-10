package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		int sum = add(a, b);
		calculationResult(sum);

		int difference = subtract(a, b);
		calculationResult(difference);

		int product = multiply(a, b);
		calculationResult(product);

		int quotient = divide(a, b);
		calculationResult(quotient);
	}

	public static void calculationResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtract(int a, int b) {
		int difference = a - b;
		return difference;
	}

	public static int multiply(int a, int b) {
		int product = a * b;
		return product;
	}

	public static int divide(int a, int b) {
		int quotient = a / b;
		return quotient;
	}	
}