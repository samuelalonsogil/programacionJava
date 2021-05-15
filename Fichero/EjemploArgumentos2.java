package Fichero;

import java.io.*;
/*indicar siempre los argumentos para ejecutor para ejecutar el código
*
* -arg 1 = 1
* -arg 2 = 100
* */
public class EjemploArgumentos2 {

    public static void main(String[] args) {
        int inferior=Integer.parseInt(args[0]);
        int superior=Integer.parseInt(args[1]);

        System.out.println("Argumento pasado 0:" + inferior);
        System.out.println("Argumento pasado 1:" + superior);

        int suma = 0;

        for (int i=inferior; i<superior ; i++) {
            suma+=i;
        }

        System.out.println("La suma entre " + inferior + " y " + superior + " es " + suma);
        String linea = Integer.toString(suma);

        try {
            BufferedWriter bfw = new BufferedWriter(new FileWriter("resultado.txt"));
            bfw.write(linea);
            System.out.println("guardado");
            bfw.close();
        }catch(IOException e){
            System.out.println("No va");
            e.printStackTrace();
        }

        File resultado = new File(Integer.toString(suma));
    }
}
