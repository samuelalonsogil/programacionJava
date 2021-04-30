package BoletinPoo2.RaicesCuadradas;

public class Raices {
    int a, b, c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void obtenerRaices(int a ,int b, int c ){
        double resPos = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

        double resNeg = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
    }

    public static void obtenerRaiz(int a ,int b, int c ){
        double resPos = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double resNeg = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        if (resPos==0 && resNeg ==0 ) System.out.println("El resultado de la ecuación es 0");
    }

    public static int getDiscriminante(int a ,int b, int c ){
        System.out.println("Discriminante: ");
        return (b^2)-4*a*c;
    }

    public static boolean tieneRaices(int a ,int b, int c ){
        boolean tieneSoluciones;
        if ((b^2)-4*a*c >= 0) return  tieneSoluciones=true;
        else return tieneSoluciones=false;
    }

    public static boolean tieneRaiz(int a ,int b, int c ){
        boolean tieneSolucion;
        if ((b^2)-4*a*c <= 0) return  tieneSolucion=true;
        else return tieneSolucion=false;
    }

    public static void calcular(int a ,int b, int c ){
        double resPos = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

        double resNeg = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        if (resPos == Double.parseDouble(null) && resNeg == Double.parseDouble(null))  System.out.println("No hay resultado");
    }

}
