package Strings.TeoriaStrings;



public class TeoriaArrays {
    
    public static void main(String[] args) {

        String prueba="Esto es una string de prueba para el repaso";

        /*Acceder a carácteres individuales de un String: .charAt(x)*/
        System.out.println(prueba.charAt(1)); //se muestra la "s" que es el char en la posición "1"

        /*También se puede asignar directamente el valor de una posición a un carácter*/
        char s = prueba.charAt(5);
        System.out.println("En la posición 5 está el caracter " + "'"+s+"'");  //se asigna al char "s" el caracter número 5 que es la letra "e"

        /*Conocer la longitudo de un string: .lenght()*/
        System.out.println(prueba.length()); //es un método y lleva paréntesis al final, no como en los arrays

        /*Mostrar los carácteres individuales de una cadena en bucle .charAt(x) + .lenght()*/
        for (int i=0; i<prueba.length();i++) {
            System.out.println(prueba.charAt(i));
        }

        /*Se pueden concatenar operaciones en strings de la forma: */
        int num1=4, num2=2;
        int suma=num1+num2;
        String mensaje = "El resultado de la suma es " + suma;
        System.out.println(mensaje);

        /*Se pueden hacer arrays de Strings: */
        String[] arrayStrings = {"Valor 1", "Valor 2", "Valor 3"}; //inicializado con valor concreto
        String[] arrayStrings2 = new String[3]; //inicializado con valor por defecto, cada valor vacío está ocupado por un "null"

        /*Se pueden aplicar métodos directamente a los arrays de strings: */
        System.out.println("--------------------");
        System.out.println("El texto del array es: ");
        for (int i=0; i<arrayStrings2.length; i++) {
            System.out.println("Posición "+ i + ": " + arrayStrings2[i]);
        }

        System.out.println("Y mide: ");
        for (int i=0; i<arrayStrings.length; i++) {
            System.out.println("Posicion "+ i + ": " + arrayStrings[i].length());
        }
        System.out.println("--------------------");

        /*Se pueden añadir por teclado directamente con el Scanner .next, se puede comprobar el tipo de dato con .hasNext*/
        /*-Con .next() el Scanner lee hasta que se encuentra un espacio en blanco
        -Con .nextLine() el Scanner lee la línea completa 
        -Con .nextLine().charAt(0) se puede leer un char por Scanner*/
        

        //LecturaPalabras.java
        //RevisinDatos.java
        //LecturaCaracter.java
        //LecturaFrase.java

        /*-------------------------------------*/

        /*Los métodos invocados sobre Strings, no modifican el valor, crean nuevas cadenas modificadas*/
        //-Con .replace('a', 'x') se cambia el caracter 'a' por 'x'
        System.out.println("-----------------------");
        String texto="hola me llamo samuel";
        String texto2=texto.replace('o', 'e');
        System.out.println(texto2);
        System.out.println("-----------------------");

        /*Se puede buscar posiciones de subStrings o chars dentro de un String*/
        //-Con .indexOf() se muestra la primera posición donde aparece el texto buscado
        //-Con .lastIndexOf() se muestra la última posición donde aparece el texto buscado
        
        System.out.println("-----------------------");
        
        int posicion1=texto2.indexOf('e');
        int posicion2=texto2.lastIndexOf('m');

        System.out.println(posicion1);
        System.out.println(posicion2);

        System.out.println(texto.indexOf('s'));
        System.out.println(texto.lastIndexOf('u'));

        System.out.println(texto.indexOf("samuel"));

        //BuscraCaracter.java

        System.out.println("-----------------------");

        /*Se pueden comparar Strings con métodos especiales para ello*/
        //texto.equals(textoAcomparar) valor booleano, si el texto es igual o no
        //texto.equalsIgnoreCase(textoAcomparar) ignora mayus y minus
        
        if(texto.equals(texto)) System.out.println("EL texto es igual");

        /*Se puede comparar con los operadores de comparación con orden alfabético*/
        
        //.compareTo(textoAcomparar)
        //.compareToIgnoreCase(textoAcomparar)
        /*
        -Devuelve un valor negativo si el texto va antes que el texto a comparar
        -Devuelve 0 si el texto es equivalente al texto a comparar
        .Devuelve un valor positivo si el texto va despues al texto a comparar
        */

        String s1="Samuel1";
        String s2="Samuel2";
        int p=0;
        p=s1.compareToIgnoreCase(s2);
        if(p<0){System.out.println("s1 va antes que s2");}
        else if(p==0){System.out.println("s1 y s2 son iguales");}
        else if(p>0){System.out.println("s1 va después que s2");}

        //AdivinaPalabras.java
        //Reto4.java

        System.out.println("-----------------------");

        /*Se pueden seleccionar subcadenas de palabras de un String con el método .subString(posiconinicio,posiconfin)*/
        
        //ExtraerPalabras.java
        //Reto5.java

        /*Para dividir Strings se usa el método .split, que da como resultado un array de Strings en el que cada posición es una división*/
        
        //InvertirOrdenPalabras.java
        //Reto6.java

        /*Para pasar valores primitivos a Strings se usa String.valueof(valor)*/
        //InvertirOrdenNumeros.java

        /*Para pasar de String a valor primitivo se usan los parse*/
        //Byte.parseByte(texto) byte
        //Integer.parseInt(texto) int
        //Double.parseDouble(texto) double
        //Float.parseFloat(texto) float
        //Long.parseLong(texto) long
        //Short.parseShort(texto) short

        

    }   

}
