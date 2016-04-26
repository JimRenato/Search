package LinearSearch;

/** 
 * LinearSearch 
 * 
 * Version 1.0
 *  
 * 2016/04/26
 * 
 * @author Renato Souto Maior 
 * 
 * Implementation of Linear Search Method.
 * 
 */ 

public class LinearSearch {

	public static void main(String[] args) {

		Object[] array = { 0, 3, 9, 12, 15, 22, 36, 47, 53, 61 };

		LinearSearch ls = new LinearSearch();
		ls.linearSearch(array, 15);

	}

	public int linearSearch(Object[] array, Object soughtElement) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(soughtElement)) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
}
