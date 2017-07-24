package binarySearch;

/** 
 * BinarySearch 
 * 
 * Version 1.1
 *  
 * 2016/04/26
 * 
 * @author Renato Souto Maior 
 * 
 * Implementation of Binary Search Method.
 * 
 */ 

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 0, 3, 9, 12, 15, 22, 36, 47, 53, 61 };

		BinarySearch bs = new BinarySearch();
		bs.binarySearchMethod(array, 15);
	}

	public int binarySearchMethod(int[] array, int value) {
		int begin = 0;
		int end = array.length - 1;

		while (begin <= end) {
			int middle = (begin + end) / 2;

			if (array[middle] == value) {
				System.out.println(middle);
				return middle;
			}

			if (value > array[middle]) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;
	}

}
