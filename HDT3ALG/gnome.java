package HDT3ALG; 
/*
 * Se utilizo código de referencia de https://www.youtube.com/watch?v=tsmIz3_XPYE
 */
public class gnome {

    public static void Gnome(NumerosAl[] array ){
        for (int i = 1; i< array.length;) {
        if (array[i-1]<=array[1]) {
            i++;
        } else {
            int temp;
            temp = array[i-1];
            array [i-1]=array [i]; 
            array[i]= temp;
            i--;
        }
        if (i==0){
            i=1;
        }
    }}}



        
                    
        