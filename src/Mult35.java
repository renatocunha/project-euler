/*
	projecteuler.net
	Problem 1
	Multiples of 3 and 5

	If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Mult35 {
	static int calc(int n){
		int mult3 = 0;
		int mult5 = 0;

		if (n > 0) {
			for (int i = 1; i < n; i++){
				if (i % 3 == 0){
					mult3 += i;
				}
			}
			
			for (int i = 1; i < n; i++){
				if (i % 5 == 0){
					mult5 += i;
				}
			}
		}
		return mult3+mult5;
	}
	
	
	public void print(int n) {
		int val = calc(n);
		System.out.println("Calculating the sum of multiples of 3 or 5 below");
		System.out.println(val);
	}
}