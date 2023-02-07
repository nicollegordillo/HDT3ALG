/**
 * This class implements the Gnome sort algorithm
 */
import java.util.Comparator;

/**
 * @author Paula Rebeca
 *
 */


public class gnome<T> {
    public void Gnome(T[] miarray, Comparator<T> myCompare){
        int i=0;
        while ( i< miarray.length-1) {
            if (i==0){
                i++;
            }
            if (Integer.valueOf(miarray[i-1].toString())<=Integer.valueOf(miarray[i].toString())) {
                i++;
            } else {
                T temp;
                temp = miarray[i];
                miarray[i]=miarray[i-1]; 
                miarray[i-1]= temp;
                i--;
            }
            
        }
   }
    
}
