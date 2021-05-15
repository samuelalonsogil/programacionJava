package BoletinArrayList2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Diccionario {
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, String> diccionario = new HashMap<String, String>();

    public static String generarPregunta(){
        int j=(int)(Math.random()*10);
        //obtenemos las lcaves como un conjunto de cadenas
        Set<String>s=diccionario.keySet();
        //creamos un array con ellas
        Object[] claves = s.toArray();
        //ir al array  y obtener la clave
        String pregunta =(String) claves[j];

        return pregunta;
    }

    public static void pueblaMapa(){
        diccionario.put("botella", "bottle"); /*key valor*/
        diccionario.put("mochila", "bag");
        diccionario.put("ordenador", "computer");
        diccionario.put("reloj", "clock");
        diccionario.put("pantalla", "screen");
        diccionario.put("portatil", "laptop");
        diccionario.put("pantalones", "trousers");
        diccionario.put("mano", "hand");
        diccionario.put("brazo", "arm");
        diccionario.put("cabeza", "head");
    }

    public static String dimeRespuesta(String pregunta){
        String respuesta="";
        return respuesta;
    }

    public static void main(String[] args) {
        pueblaMapa();
        String entrada, valor;
        int aciertos=0;

        for (int i=0;i<5;i++){
            valor = generarPregunta();
            System.out.println("traduce la palabra número " + (i+1) + " " + valor + ":");
            entrada = sc.nextLine();
            //get valor da el valor para la clavr en inglés
            if (entrada.equals(diccionario.get(valor))) aciertos++;
        }
        System.out.println("Has acertado: " + aciertos);


    }

}
