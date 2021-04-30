package BoletinPoo2.Contraseñas;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Password {
    final static int VALOR_POR_DEFECTO = 8;

    int longitud;
    String contraseña;

    Random random = new Random();

    StringBuilder sb = new StringBuilder();

    //constructor por defecto
    public Password() {
    }

    //constructor con longitud pasada
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public String generarPassword() {

        String valorAlfabetico = "abcdefghijklmnopqrstuvwxyz";
        String valorAlfabeticoMayus = valorAlfabetico.toUpperCase();
        String valorNumerico = "0123456789";
        String stringAleatoro = valorAlfabetico + valorAlfabeticoMayus + valorNumerico;

        if (longitud < 1) this.longitud = 8;
        for (int i = 0; i < this.longitud; i++) {
            int posCharAleatorio = random.nextInt(stringAleatoro.length());
            char charAleatorio = stringAleatoro.charAt(posCharAleatorio);
            sb.append(charAleatorio);
        }
        return sb.toString();
    }

    public boolean esFuerte() {
        int contadorMayus = 0, contadorMinus = 0, contadorNums = 0;

        for (int i = 0; i < this.contraseña.length(); i++) {

            if (Character.isDigit(this.contraseña.charAt(i))) contadorNums++;
            else if (Character.isUpperCase(this.contraseña.charAt(i))) contadorMayus++;
            else if (Character.isLowerCase(this.contraseña.charAt(i))) contadorMinus++;
        }

        if (contadorMayus >= 2 && contadorMinus >= 1 && contadorNums >= 5) {
            System.out.println("La contraseña es fuerte");
            return true;
        } else {
            System.out.println("La contraseña es débil");
            return false;
        }
    }


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
