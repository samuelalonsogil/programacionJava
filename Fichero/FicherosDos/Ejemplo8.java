package Fichero.FicherosDos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejemplo8 {
    public static void main(String[] args) {
        ArrayList<String>amigos=new ArrayList<>();
        int cont=0;
        /*Lectura:*/

            File fe = new File("amigos.txt");
                if (fe.exists()){
                    try {
                        FileReader fr = new FileReader(fe);
                        BufferedReader br = new BufferedReader(fr);
                        String s;
                            while((s=br.readLine())!=null){

                                System.out.println(s);
                                amigos.add(s);
                            }
                        if (fr != null){
                            fr.close();
                        }
                    }catch(IOException ioe){
                        ioe.printStackTrace();
                    }

                    /*Mostrar amigos (tú no tienes)*/
                    for (String amics:amigos) {
                        System.out.println("Amigo "+ cont++ +": " + amics);
                    }



        }
    }
}
