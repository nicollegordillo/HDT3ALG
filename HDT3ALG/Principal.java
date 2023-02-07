import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        Sorts miSort = new Sorts();
        QuickSort Quick = new QuickSort<>();
        MergeSort merge = new MergeSort<>();
        gnome gnome= new gnome<>();
        Boolean continuar=true;
        int op2=0;
        int op3=0;
        int op4=0;
        Boolean continuar2=true;
        while(continuar){
            System.out.println("Ingrese el numero de numeros aleatorios que desea");//Prueba
            opcion=teclado.nextInt();
            teclado.nextLine();
            miSort.generador(opcion);
            Integer[] arreglo= miSort.lector();
            System.out.println("Arreglo no arreglado");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println( + arreglo[i]);
            }
            continuar2=true;
            while(continuar2){
                System.out.println("¿Qué sort quiere usar?");
                System.out.println("1. Gnome sort \n2. Merge sort \n3. Quick sort \n4. Radix sort\n5. Insertion sort");
                op2=teclado.nextInt();
                teclado.nextLine();
                if(op2==1){
                    gnome.Gnome(arreglo,new ComparadorEnteros<Integer>());
                }
                else if(op2==2){
                    merge.mergeSort(arreglo, 0, miSort.lector().length-1,new ComparadorEnteros<Integer>());
                    
                }
                else if(op2==3){
                    Quick.quickSort(arreglo, 0, miSort.lector().length-1, new ComparadorEnteros<Integer>());
                    
                }
                else if(op2==4){
                    
                }
                else if(op2==5){
                    
                }
                System.out.println("Arreglo arreglado");
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println( + arreglo[i]);
                }
                System.out.println("¿Quiere ordenar el arreglo ordenado?");
                System.out.println("1. Sí \n2. No");
                op4=teclado.nextInt();
                teclado.nextLine();
                if(op4==2){
                    continuar2=false;
                }

            }
            System.out.println("¿Quiere volver a generar números?");
            System.out.println("1. Sí \n2. No");
            op3=teclado.nextInt();
            teclado.nextLine();
            if(op3==2){
                continuar=false;
            }

           
        }
        
        
        
        
    }
    
}
