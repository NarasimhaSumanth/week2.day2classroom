package week3.day1;

public class Calculator {

	public void add(int a, int b) {

		int ab = a + b;

		System.out.println("a + b " + "= " + ab);

	}

	public void add(int c, int d, int e) {
		int cde = c + d + e;

		System.out.println("c + d + e " + "= " + cde);

	}

	public void multiply(int a, int b) {

		int ab = a * b;

		System.out.println("a * b " + "= " + ab);

	}

	public void multiply(int c, double d) {
		double cd = c * d;

		System.out.println("c * d " + "= " + cd);

	}

	public void divide(int a, int b) {

		int ab = a / b;

		System.out.println("a / b " + "= " + ab);

	}

	public void divide(double c, int d) {
		double cd = c / d;

		System.out.println("c / d " + "= " + cd);

	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		calc.add(2, 3);
		calc.add(4, 5, 6);
		calc.multiply(2, 3);
		calc.multiply(4, 1.22);
		calc.divide(2, 1);
		calc.divide(2.22, 2);

	}

}
