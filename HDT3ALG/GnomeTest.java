/**
 * 
 */


import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;



/**
 * @author wolfu
 *
 */
class GnomeTest {
	
	
	gnome g= new gnome();
	@Test
	void GnomeT() {
		Integer[] numeros = new Integer[] {10,20,5,6,24,13};
		String[] Resultado= new String[6];
		g.Gnome(numeros, new ComparadorEnteros<Integer>());
		for (int i = 0; i < numeros.length; i++) {
            Resultado[i]=numeros[i].toString();
        }
		assertEquals("5",Resultado[0]);
		
	}

}
