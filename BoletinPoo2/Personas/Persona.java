package BoletinPoo2.Personas;

public class Persona {

    private String nombre, DNI;
    private int edad;
    private char sexo;
    private double peso, altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, String DNI, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = generaDNI(DNI);

        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }



    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public double calcularIMC(double peso, double altura) {
        double imc = 0;
        imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            imc = -1;
            System.out.println("Está por debajo de su peso ideal");
        } else if (imc >= 20 && imc <= 25) {
            imc = 0;
            System.out.println("Está en su peso ideal");
        } else {
            imc = 1;
            System.out.println("Tiene sobrepeso");
        }
        return imc;
    }

    public boolean esMayordeEdad(int edad) {
        boolean mayoria;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    public char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') this.sexo = 'H';
        return sexo;
    }

    public String generaDNI(String dni) {
        int numDNI = 0;
        numDNI = (int) Math.random() * 100000000;

        int resultado = numDNI / 13;
        char letra = generaLetraDNI(resultado);

        return dni + Integer.toString(numDNI) + letra;
    }

    private char generaLetraDNI(int resultado) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[resultado];
    }
}
