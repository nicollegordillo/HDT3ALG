/**
 * It's a generic class that implements the QuickSort algorithm
 */
import java.util.Comparator;

public class QuickSort<T> {
    
    public void quickSort(T[] miarray, int l, int r, Comparator<T> myCompare) {
        
        int i = l - 1;
        int j = r;
        T aux;
        
        
        if (l >= r) {
            return;
        }
        
        T pivote = miarray[r];
        
        
        while (i<j) {
            while(myCompare.compare(miarray[++i], pivote) < 0);
            while((myCompare.compare(miarray[--j], pivote) > 0)  && (j > l)); 
            if (i < j) {
                aux = miarray[i];
                miarray[i] = miarray[j];
                miarray[j] = aux;
            } 
        }
        
        aux = miarray[i];
        miarray[i] = miarray[r];
        miarray[r] = aux;
        quickSort(miarray, l, i - 1, myCompare);
        quickSort(miarray, i + 1, r, myCompare);
    }
    
}
