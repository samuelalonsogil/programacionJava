package Fichero.FicherosDos;

import java.io.FileOutputStream;
import java.io.IOException;

/*acceso secuencial a fichero de caracteres (texto) */
public class AccesoSecuencial {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = null;
        String s = "En un lugar de la manchacuyo nombre no quiero acordarme";
        char c =0;

        try{
            f = new FileOutputStream("datos.txt");
                for (int i=0;i<=s.length();i++){
                    c=s.charAt(i);
                    f.write((byte) c);
                }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally{
            f.close();
        }
    }



}
