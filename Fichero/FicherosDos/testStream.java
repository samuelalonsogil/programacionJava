package Fichero.FicherosDos;

import java.io.*;

public class testStream {

    public static void main(String[] args) {
        System.out.println("Escritura ");

        try{
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("testStream.txt");

            for (int i=0; i< bWrite.length;i++){
                System.out.println(bWrite[i]);
                os.write(bWrite[i]);
            }
            os.close();
            System.out.println("lectura");

            InputStream is = new FileInputStream("testStream.txt");
            /*comprueba el numero de bytes del flujo de entrada*/
            int tamano=is.available();

            for (int i=0; i<tamano;i++){
                System.out.println((byte)is.read() + " "); //lee el flujo de entrada
                System.out.println("\n");
                is.close();
            }

        }catch(IOException ioe){

        }
    }
}
