import java.util.Comparator;

public class MergeSort<T> {
    public void merge(T[] miarray, int l, int mid, int r, Comparator<T> myCompare) {
        int num = r - l + 1;
        Object[] valores = new Object[num];

        int valorl = l;

        int middleValue = mid + 1;

        int i = 0;

        while (valorl <= mid && middleValue <= r) {
            if (myCompare.compare(miarray[valorl], miarray[middleValue]) < 0) {
                valores[i] = miarray[valorl];
                valorl++;
            } else {
                valores[i] = miarray[middleValue];
                middleValue++;
            }
            i++;
        }

        while (valorl <= mid) {
            valores[i] = miarray[valorl];
            valorl++;
            i++;
        }
        while (middleValue <= r) {
            valores[i] = miarray[middleValue];
            middleValue++;
            i++;
        }

        for (i = 0; i < num; i++){
            miarray[l + i] = (T)valores[i];
        }
    }
      
     
    public void mergeSort(T[] miarray, int l, int r, Comparator<T> myCompare) {
        if (l < r)
        {
            int mid = (l + r) / 2;
            mergeSort(miarray, l, mid, myCompare);
            mergeSort(miarray, mid + 1, r, myCompare);
            merge(miarray, l, mid, r, myCompare);
        }
    }
    
}
