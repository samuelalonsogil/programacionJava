package Fichero.FicherosDos;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class Ejemplo4 {

    public static void main(String[] args) throws IOException {

        String sentencias = "a=a+1;c++;b+=5;c=a+b;b++";
        StringReader sr = new StringReader(sentencias);

        PushbackReader pbr = new PushbackReader(sr);
        int ultimo= pbr.read(), penultimo=0;

        while (ultimo!= -1){
            switch (ultimo){
                case '+':
                    if ((ultimo=pbr.read())=='+') System.out.println("="+(char) penultimo+"+1");
                    else {
                        pbr.unread(ultimo);
                        System.out.println('+');
                    }
                    break;
                case ';':
                    System.out.println((char) ultimo);
                    break;
                default:
                    System.out.println((char) ultimo);
            }
            penultimo=ultimo;
            ultimo=pbr.read();
        }
    }
}
