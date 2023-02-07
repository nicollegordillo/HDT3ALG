import java.util.Comparator;

public class InsertionSort<T> {
    public void quickSort(Integer[] miarray, Comparator<T> myCompare) {
        int auxiliar;
        int counter1;
        int counter2;
        for(counter1=1; counter1<miarray.length; counter1++){
            auxiliar=miarray[counter1];
            for(counter2=counter1-1; counter2 >=0 && miarray[counter2]>auxiliar; counter2++){
                miarray[counter2+1]=miarray[counter2];
                miarray[counter2]=auxiliar;
            }
        }
}
    
}
