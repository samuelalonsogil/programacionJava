package Examen_2a_ev;

import java.util.Scanner;

/*Ejercicio 3B

Un grupo de inteligencia militar desea codificar los mensajes
secretos de tal forma que no puedan ser interpretados con una
lectura directa, para lo cual han establecido las siguientes
reglas: a) Todo mensaje debe estar sus letras en mayúsculas. b)
Reemplazar cada letra por la que sigue según abecedario, excepto
Z que se deberá reemplazar con la letra A. c) reemplazar cada
dígito encontrado por el siguiente número excepto el 9 que
deberá ser reemplazado por el 0.*/

public class Ejercicio3B {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto){
        System.out.println("Escribe un texto:");
        return texto = sc.nextLine();}

    public static String Mayusuculas(String texto){
        return texto.toUpperCase();
    }

    public static String Reemplazar(String texto){
        for (int i = 0; i < texto.length()-1; i++) {
            char letra=texto.charAt(i);
            if (letra!='z') {
                texto.replace(letra, letra++);
            }else{
                texto.replace('z', 'a');
            }
        }
        return texto;
    }

    public static String ReemplazarNums(String texto){
        int [] numeros={'0','1','2','3','4','5','6','7','8','9'};
        
        for (int i = 0; i < texto.length()-1; i++) {
            char letra=texto.charAt(i);
            
            if (letra==numeros[0]||letra==numeros[1]||letra==numeros[2]||letra==numeros[3]||letra==numeros[4]
            ||letra==numeros[5]||letra==numeros[6]||letra==numeros[7]||letra==numeros[8]||letra==numeros[9]
            ||letra==numeros[10]) {
                texto.replace(letra, letra++);
            }else{
                texto.replace('9', '0');
            }
        }
        return texto;
    }

    public static void main(String[] args) {
        String texto="";
        texto=IntroducirTexto(texto);
        texto=Mayusuculas(texto);
        texto=Reemplazar(texto);
        texto=ReemplazarNums(texto);


    }
}
