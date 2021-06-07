package Fichero.FicherosDos;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo6 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = null;
        String s="";
        char c;

        try{
            fis = new FileInputStream("datos.txt");

            /*obtenemos el tamaño del fichero de texto*/
            int size = fis.available();
            for(int i=0;i<size;i++){
                c=(char) fis.read();
                /*añade cada caracter a la cadena*/
                s = s + c;
            }

        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally {
            System.out.println(s);
            fis.close();
        }
    }
}
