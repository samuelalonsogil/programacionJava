package Fichero;

import java.io.*;

public class Ejemplo3 {

    public static void main(String[] args) {
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader("fichero1.txt"));
            BufferedReader bf2 = new BufferedReader(new FileReader("fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));

            String linea1="";
            String linea2="";

            while ((linea1 != null) || (linea2 != null)){
                linea1 = bf1.readLine();
                linea2 = bf2.readLine();

                if (linea1 != null) bw.write(linea1 + "\n");
                if (linea2 != null) bw.write(linea2 + "\n");
            }

            bf1.close();
            bf2.close();
            bw.close();

        }catch (IOException e){
            System.out.println("Se ha producido un error de lectura/escritura");
            System.out.println(e.getMessage());
        }
    }


}
