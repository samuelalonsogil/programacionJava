package Fichero.FicherosDos;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeeMonitor {

    public static void main(String[] args) throws IOException {

        InputStreamReader lector = null;

        try{
            lector= new InputStreamReader(System.in); /*entrada standart de java*/
            System.out.println("Ingresa caracteres, 'q' para salir");
            char c;
            do{
                c=(char)lector.read();
                System.out.print(c); /*cada vez que leo saco a pantalla*/
            }while (c!='q');
        }finally {
            if (lector != null) lector.close();

        }
    }
}
