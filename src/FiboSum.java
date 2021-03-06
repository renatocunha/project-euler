/*
	projecteuler.net
	Problem 2
	Even Fibonacci numbers

	Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
	By starting with 1 and 2, the first 10 terms will be:
	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

	By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
	find the sum of the even-valued terms.
*/
import java.math.*;

public class FiboSum {
	public BigInteger calc(int n){
		BigInteger nSum= BigInteger.valueOf(0);
		if (n > 1 ){			
			BigInteger nX= BigInteger.valueOf(1);
			BigInteger nY= BigInteger.valueOf(0);
			BigInteger nZ= BigInteger.valueOf(0);
			for (int i = 1; i < n; i++){
				nZ = nX.add(nY); nY = nX; nX = nZ;
				if (nZ.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
					nSum = nSum.add(nZ);
				}
			}

		}
		return nSum;
	}

	public void print(int n) {
		System.out.println("Calculating the sum of the even-valued terms");
		System.out.println(calc(n));
	}

/*
		Implements the mathematical form: If n > 1 -> Fn= (Fn-1) + (Fn-2)
		But can't be used in oversized elements because the recursivity

	*/
	static BigInteger fibonacci(int n){
		if (n == 0){
			return BigInteger.ZERO;
		} else if (n == 1) {
			return BigInteger.ONE;
		}else {
			return fibonacci(n - 2).add(fibonacci(n - 1));
		}
	}

}