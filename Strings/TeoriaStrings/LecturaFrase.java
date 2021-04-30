package Strings.TeoriaStrings;

import java.util.Scanner;

public class LecturaFrase {
    public static final int LECTURA_FRASES=4;
    static Scanner sc = new Scanner(System.in);
    
    public static void EscribeFrases(String frase){
        System.out.println("Escribe " + LECTURA_FRASES + " frases: ");
        for (int i=0;i<LECTURA_FRASES;i++) {
            frase=sc.nextLine();
            System.out.println("Has escrito: " + frase);
        }
    }
    public static void main(String[] args) {
        String frase="";
        EscribeFrases(frase);
    }
}
