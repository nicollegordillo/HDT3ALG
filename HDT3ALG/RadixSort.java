import java.io.*;
import java.util.*;

/**
 * @author Ana Paula
 *
 */

public class RadixSort {
	// Radix sort Java implementation
	// A utility function to get maximum value in arr[]
	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public int getMax(Integer arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	/**
	 * 
	 * @param arr
	 * @param n
	 * @param exp
	 */
	public void countSort(Integer arr[], int n, int exp)
	{
		int output[] = new int[n]; // output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current
		// digit
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	// The main function to that sorts arr[] of
	// size n using Radix Sort
	/**
	 * 
	 * @param arr
	 * @param n
	 */
	public void radixsort(Integer arr[], int n)
	{
		// Find the maximum number to know number of digits
		int m = getMax(arr, n);

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
		
		print(arr);
	}

	// A utility function to print an array
	/**
	 * 
	 * @param arr
	 * @param n
	 */
	private void print(Integer arr[])
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
 }
