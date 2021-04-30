package BoletinPoo2.Personas;

import java.util.Scanner;

public class PersonaTest {

    static Scanner sc = new Scanner(System.in);

    public static String introduceNombre(String nombre) {
        System.out.println("Introduce el nombre: ");
        return nombre = sc.nextLine();
    }

    public static int introduceEdad(int edad) {
        System.out.println("Introduce la edad: ");
        return edad = sc.nextInt();
    }

    public static char introduceSexo(char sexo) {
        System.out.println("Introduce el sexo: ");

        return sexo = sc.next().charAt(0);
    }

    public static double introducePeso(double peso) {
        System.out.println("Introduce el peso: ");
        return peso = sc.nextDouble();
    }

    public static double introduceAltura(double altura) {
        System.out.println("Introduce la altura: ");
        return altura = sc.nextDouble();
    }

    public static void main(String[] args) {

        String nombre = "";
        nombre = introduceNombre(nombre);

        int edad = 0;
        edad = introduceEdad(edad);

        char sexo = ' ';
        sexo = introduceSexo(sexo);

        double peso = 0;
        peso = introducePeso(peso);

        double altura = 0;
        altura = introduceAltura(altura);

        Persona Samuel = new Persona(nombre, edad, sexo, peso, altura);


        Persona Nicolas = new Persona(nombre, edad, sexo);

        Persona Carlos = new Persona();
        Carlos.setSexo(sexo);
        Carlos.setPeso(peso);
        Carlos.setAltura(altura);
        Carlos.setNombre(nombre);
        Carlos.setEdad(edad);

        Samuel.calcularIMC(peso, altura);
        Samuel.esMayordeEdad(edad);
        Samuel.comprobarSexo(sexo);
        System.out.println(Samuel.toString());

        System.out.println("---------------------------------------------------");

        Nicolas.calcularIMC(80, 1.75);
        Nicolas.esMayordeEdad(edad);
        Nicolas.comprobarSexo(sexo);
        System.out.println(Nicolas.toString());

        System.out.println("---------------------------------------------------");

        Carlos.calcularIMC(peso, altura);
        Carlos.esMayordeEdad(edad);
        Carlos.comprobarSexo(sexo);
        System.out.println(Carlos.toString());

    }
}
