/**
 * 
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author wolfu
 *
 */
class InsertionTest {

	InsertionSort g= new InsertionSort();
	@Test
	void InT() {
		Integer[] numeros = new Integer[] {10,20,5,6,24,13};
		String[] Resultado= new String[6];
		g.quickSort(numeros, new ComparadorEnteros<Integer>());
		for (int i = 0; i < numeros.length; i++) {
            Resultado[i]=numeros[i].toString();
        }
		assertEquals("5",Resultado[0]);
		
	}

}
