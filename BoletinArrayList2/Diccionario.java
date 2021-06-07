package BoletinArrayList2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Diccionario {
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, String> diccionario = new HashMap<String, String>();

    public static String generarPregunta(){
        /*obtenemos el num aleatorio para seleccionar en el array siguiente*/
        int j=(int)(Math.random()*10);

        /*obtenemos las claves como un conjunto de cadenas*/
        Set<String> s =diccionario.keySet();

        /*creamos un array con ellas*/
        Object[] claves = s.toArray();

        /*ir al array, pasarle la posición calculada y obtener la el String (clave guardado en la posición)*/
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

    public static int quiz(String pregunta){
        int aciertos=0;

        for (int i=0;i<5;i++){
            pregunta = generarPregunta();
            System.out.println("traduce la palabra número " + (i+1) + " " + pregunta + ":");

            String respuesta = sc.nextLine();

            //get valor da el valor para la clave en inglés
            if (respuesta.equals(diccionario.get(pregunta))) aciertos++;
        }
        System.out.println("Has acertado: " + aciertos);

        return aciertos;
    }

    public static void main(String[] args) {
        pueblaMapa();
        String pregunta = generarPregunta();
        quiz(pregunta);





    }

}
