package com.companies.interview.blkhwk;

/*
Asked by BlackHawk B'lore
 */
public class FindNumberInRotatedArray {

	public static void main(String[] args) {
		int[] ar = {2, 3, 4, 5, 7, 9 };
		int target = 3;

		int pivotIndex = ar.length-1;
		for (int i=0;i < ar.length-1; i++ ) {
			if(ar[i] > ar[i+1]) {
				pivotIndex = i;
				break;
			}
		}

		System.out.println(pivotIndex);

		int result = -1;
		if (ar[pivotIndex] >= target && ar[0] <= target) {
			// target belongs in 0 to pivot
			result = searchElementInBinary(ar, target, 0, pivotIndex);
		}
		else if (ar[pivotIndex] <= target && ar[ar.length-1] >= target) {
			// target belongs in pivot to end of array
			result = searchElementInBinary(ar, target, pivotIndex, ar.length-1);
		}

		System.out.println(result);
	}

	private static int searchElementInBinary(int[] a, int target,  int min, int max) {
		int mid = min + max / 2;

		//if (mid >= max || mid <= min) return -1;

		if (target == a[mid]) return 1;

		int result = -1;
		if (target > a[mid]) {
			result = searchElementInBinary(a, target, mid + 1, max);
		}
		else if (target < a[mid]) {
			result = searchElementInBinary(a, target, min, mid);
		}

		return result;
	}
}
