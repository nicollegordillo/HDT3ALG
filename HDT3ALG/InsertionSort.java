/**
 * @author Ana Paula
 *
 */

/**
 * It takes an array of integers and sorts them in ascending order
 */
public class InsertionSort{
    
	public void quicksort(Integer[] numeros){
        int n = numeros.length;
        for (int i = 1; i < n; ++i) {
            int key = numeros[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = key;
        }
        for(int i = 0; i < numeros.length;i++) {
        	System.out.println(numeros[i]);
        }
    }
}
