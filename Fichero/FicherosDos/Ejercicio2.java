package Fichero.FicherosDos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static String leerCadena(){
        String cadena="";
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        try{
            cadena=br.readLine();
        }catch (IOException ioe){
            ioe.printStackTrace();;
        }
        return cadena;
    }

    public static void main(String[] args) {
        String cadena;
        do {
            cadena=leerCadena();
            System.out.println(cadena);
        }while (!cadena.equals("para"));
    }

}
