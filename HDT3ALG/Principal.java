package HDT3ALG;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        Sorts miSort = new Sorts();
        System.out.println("Ingrese el numero de numeros aleatorios que desea");//Prueba
		opcion=teclado.nextInt();
		teclado.nextLine();
        miSort.generador(opcion);
        miSort.lector();
    }
    
}

