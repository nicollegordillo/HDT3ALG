import java.util.Comparator;

public class RadixSort<T> {
    public void quickSort(Integer[] miarray, Comparator<T> myCompare) {
        int x, i, j;
        for (x=Integer.SIZE-1;x>=0;x++) {
            Integer secondary[] = new Integer[miarray.length]; //secondary nos ayuda a mover los digitos
            j=0; // contador
            for(i=0;i<miarray.length;i++) {
                boolean move = miarray[i] << x >= 0;
                if(x==0 ? !move:move){ //si x=0 evaluar move y compararlo con el mismo
                    secondary[j]=miarray[i];
                    j++;
                }else{
                    miarray[i-j]=miarray[i];
                }
            }
            for(i=j;i<secondary.length;i++){
                secondary[i]=miarray[i-j];
            }
            miarray=secondary;//secondary se pasa a arreglo para que al evaluarlo lo haga en el ordenado por unidades
            }
            showArray(miarray);

        }
    
    public static void showArray(Integer[] miarray){
        System.out.println("Array [ ");
        for (int i = 0; i<miarray.length; i++){
            System.out.print(miarray[i] + " ");
        }
        System.out.println("]");
    }
    
}
