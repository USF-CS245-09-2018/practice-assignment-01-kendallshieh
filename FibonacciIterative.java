public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {
		
		int x, y;
		int total = 0;
		
		if(n <= 2) {
			return 1;
		}
		
		for(int i = n; i > 0; i--) {
			x = n-1;
			y = n-2;
			total = x + y;
		}
		return total;
		
	}
}
