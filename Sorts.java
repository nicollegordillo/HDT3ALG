import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Sorts{
    
    
    private Integer[] NumerosAl;

    public void generador(int n){
        Random ran = new Random();
        int number = 0;
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("Numeros.txt"));
            for (int i = 1; i <= n; i++) {
                number = ran.nextInt(3000) + 1;
                writer.write(Integer.toString(number));
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public Integer[] lector(){
        BufferedReader reader;
        String line;
        int noOfLines=0;
		try {
            reader = new BufferedReader(new FileReader("Numeros.txt"));
            while (reader.readLine() != null) {
                noOfLines++;
            }
            reader = new BufferedReader(new FileReader("Numeros.txt"));
            for(int i=0; i<noOfLines;i++){
                line = reader.readLine();
                NumerosAl[i]=(Integer.valueOf(line));
    
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return NumerosAl;
       
    }
    
    
    
}
