package Strings.Retos;

/*Mostrar por pantalla un cadena de texto pero escrita al revés*/

public class Reto1 {
    
    public static String AlReves(String reto){
        String reto2="";
        int longitud=reto.length();
        for (int i=longitud-1; i>=0 ; i--) {
            reto2+= reto.charAt(i);;
        }
        return reto2;
    }

    public static void Mostrar(String reto){
        System.out.println(reto);
    }
    
    public static void main(String[] args) {
        String reto="Hola, me llamo samuel que tal";
        
        reto=AlReves(reto);
        Mostrar(reto);
    }
}
