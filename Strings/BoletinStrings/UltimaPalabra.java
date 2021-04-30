package Strings.BoletinStrings;

import java.util.Scanner;

/*Haga un programa en Java llamado UltimaPalabra que vaya leyendo 
palabras desde el teclado hasta encontrar la palabra "fin". Cuando 
esto sucede, debe mostrar por pantalla la palabra que estaría en la 
última posición alfabetica (iría más hacia el final en un diccionario) 
de entre todas las escritas. La palabra "fin" queda excluida. */

public class UltimaPalabra {
    static Scanner sc = new Scanner(System.in);

    public static String IntroducirTexto(String texto) {
        System.out.println("Introduce el texto: ");
        return texto = sc.nextLine();
    }
    
    public static String Ultima(String texto,String ultima){
        if(texto.compareTo(ultima)>0){
            ultima=texto;
        }
        return ultima;
    }
    
    public static void Mostrar(String ultima){
        System.out.println("La última línea es:" + ultima);
    }

    public static void main(String[] args) {
        String texto = "";
        
        String ultima="";

        while (!texto.equals("fin")) {
            texto=IntroducirTexto(texto);
            ultima=Ultima(texto, ultima);
        }
        Mostrar(ultima);
        
        

        

        

    }
}
