package com.chandra.primenumbers;

/**  
Pseudocode :

Input: an integer n > 1.

Let A be an array of Boolean values, indexed by integers 2 to n,
initially all set to true.

for i = 2, 3, 4, ..., not exceeding squar root of n:
  if A[i] is true:
    for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n:
      A[j] := false.

Output: all i such that A[i] is true.
*/
public class PrimeSieveOfEratosthenes {

	public static void sieveOfEratosthenes(int n) {
		String primeNumbers = "";
		/** initially assume all integers are prime */
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		/**  mark non-primes <= n using Sieve of Eratosthenes */
		for (int factor = 2; factor * factor <= n; factor++) {
			/** if factor is prime, then mark multiples of factor as nonprime
			 suffices to consider mutiples factor, factor+1, ..., n/factor */
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= n; j++) {
					isPrime[factor * j] = false;
				}
			}
		}
		// Print primes
		int primes = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes++;
				primeNumbers += i + ",";
			}
		}
		System.out.println("The number of primes <= " + n + " is " + primes
				+ " Numbers are :" + primeNumbers);
	}
	
	public static void main(String[] args) {
		long startTs = System.currentTimeMillis();
		sieveOfEratosthenes(100000);
		System.out.println(System.currentTimeMillis()-startTs);
	}
}