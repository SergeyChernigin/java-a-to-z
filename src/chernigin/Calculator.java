package chernigin;

public class Calculator {
	private double result;

	public void add(double first, double second) {
		this.result = first + second;
		System.out.println("Result = " + result);
	} 
	public void substruct (double first, double second) {
		this.result = first - second;
		System.out.println("Result = " + result);
	} 
	public void div(double first, double second) {
		this.result = first * second;
		System.out.println("Result = " + result);
	}
	public void multiple(double first, double second) {
		this.result = first / second;
		System.out.println("Result = " + result);
	}
}