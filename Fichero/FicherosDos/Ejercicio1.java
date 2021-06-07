package Fichero.FicherosDos;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

public class Ejercicio1 {

    //FLUJOS DE CARACTERES
    public static void main(String[] args) {

        String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme,	");
        s = s + "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, ";
        s = s + "adarga antigua, rocín flaco y galgo corredor...";

        char[] arr = new char[s.length()];

        //pudo ser char o byte
        int car = 0;

        StringReader flujoInput = new StringReader( s );
        CharArrayWriter flujoOutput = new CharArrayWriter();

        try {
            while ((car = flujoInput.read()) != -1) {
                flujoOutput.write(car);
            }
            /*vuelca el flujo de salida en un array de chars*/
            arr = flujoOutput.toCharArray();

            /*imprime el array*/
            System.out.println(arr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            flujoInput.close();
            flujoOutput.close();
        }
    }

}
