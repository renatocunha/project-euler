/*
	projecteuler.net
	Problem 3

	Largest prime factor

	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
*/
import java.lang.Math; 
public class LargestPrime {
	public void print(){
		long n = 600851475143l;
		int i;
		
		while (n%2 == 0){
			System.out.print(2 + " ");
			n /=2;
		}
		
		for (i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) { 
                n /= i; 
            } 
        } 

		System.out.println("Largest prime factor of 600851475143 is:");
		System.out.println(n);
	}
}