package sk.itsovy.dolinsky.unittests;

/**
 * @author Martin Dolinsky
 */
public class MyMath {

	boolean isPrimeNumber(int number) {

		boolean isPrime = true;
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	boolean existTriangle(int aSide, int bSide, int cSide) {
		return aSide + bSide > cSide && aSide + cSide > bSide && cSide + bSide > aSide;
	}



}
