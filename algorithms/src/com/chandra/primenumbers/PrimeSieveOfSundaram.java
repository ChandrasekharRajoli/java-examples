package com.chandra.primenumbers;

/**
1) In general Sieve of Sundaram, produces primes smaller than 
   (2*x + 2) for a number given number x. Since we want primes 
   smaller than n, we reduce n-2 to half. We call it nNew.
       nNew = (n-2)/2;
   For example, if n = 102, then nNew = 50.

2) Create an array marked[n] that is going 
   to be used to separate numbers of the form i+j+2ij from 
   others where  1 <= i <= j

3) Initialize all entries of marked[] as false.

4) // Mark all numbers of the form i + j + 2ij as true
   // where 1 <= i <= j
   Loop for i=1 to nNew
        a) j = i; 
        b) Loop While (i + j + 2*i*j) <= nNew
             (i)  primes[i + j + 2*i*j] = true;
             (ii) j++

5) If n > 2, then print 2 as first prime.

6) Remaining primes are of the form 2i + 1 where i is
   index of NOT marked numbers. So print 2i + 1 for all i
   such that marked[i] is false. 
*/
public class PrimeSieveOfSundaram {

	public static void SieveOfSundaram(int n) {
		int noNew = (n - 2) / 2;
		boolean[] nonPrimeArray = new boolean[noNew + 1];

		for (int i = 1; i <= noNew; i++) {
			for (int j = i; j <= (noNew - i) / (1 + 2 * i); j++) {
				nonPrimeArray[i + j + (2 * i * j)] = true;
				/*
				 * i+j+2ij = no; i+j(1+2i) = no; j = (n-i)/(1+2i);
				 */
			}
		}

		if (n > 2) {
			System.out.print(2 + ",");
		}

		for (int i = 2; i <= noNew; i++) {
			if (nonPrimeArray[i] == false) {
				System.out.print((2 * i + 1) + ",");
			}
		}
	}
	
	public static void main(String[] args) {
		long startTs = System.currentTimeMillis();
		SieveOfSundaram(100000);
		System.out.println();
		System.out.println(
				"Total Time Taken :" + (System.currentTimeMillis() - startTs));
	}
}
