package Fichero.FicherosDos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//bytes
public class CopiaFichero {

    /*nos despreocupamos de io excepciones*/
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        /*creamos un flujo de entrada al fichero entrada y de salida al fichero salida*/
        try {
            in = new FileInputStream("entrada");
            out = new FileOutputStream("salida");

            int c; /*mientras no leamos un -1 que es una marca de eof end of file del fichero de entrada
            cogemos el entero y lo escribimos en el de salida*/

            while((c = in.read())!= -1) out.write(c);
        }finally {/*cerramos flujos*/
            if (in != null) in.close();
            if (out != null) in.close();
        }
    }
}
