package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("Can't divide by 0");
		}
		return a/b;
	}
}
