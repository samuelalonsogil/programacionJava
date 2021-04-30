package Examen_2a_ev;

/*Ejercicio 2B

Genera un array de 50 posiciones enteras que tomaran valores
entre -100 y 100. Separe en dos matrices los valores positivos y
negativos. Ordene ambos arrays*/

public class Ejercicio2B {

    public static int[] RellenarAleatorios(int[] tabla){
        for (int i=0;i<tabla.length;i++) {
            tabla[i]=(int)(Math.random()*100)+1;
            
        }
        return tabla;
    }
    
    public static int ContadorPos(int[] tabla, int contadorpos) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                contadorpos++;
            }

        }
        return contadorpos;
    }

    public static int ContadorNeg(int[] tabla, int contadorneg) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                contadorneg++;
            }

        }
        return contadorneg;
    }

    public static int[] RellenarPos(int[] tabla, int[] positivo, int[] negativo) {
        
        int k = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] % 2 == 0) {
                positivo[k] = tabla[i];
                k++;
            }
        }
        return positivo;
    }

    public static int[] RellenarNeg(int[] tabla, int[] negativo) {
        
        int k = 0;
        for (int i = 0; i < tabla.length; i++){
            if (tabla[i] % 2 != 0) {
                negativo[k] = tabla[i];
                k++;
            }
        }
        return negativo;
           
    }

    public static void Mostrar(int[] positivo, int[] negativo){
        System.out.println("Array positivo");
        for (int i = 0; i < positivo.length; i++) {
            System.out.println(positivo[i]);
        }
        System.out.println("Array negativo");
        for (int i = 0; i < positivo.length; i++) {
            System.out.println(negativo[i]);
        }
    }


    
    

    public static void main(String[] args) {
		int tabla[]=new int[50];
		tabla= RellenarAleatorios(tabla);

        int contadorneg=0;
        contadorneg=ContadorNeg(tabla, contadorneg);
        int contadorpos=0;
        contadorpos=ContadorPos(tabla, contadorpos);
        
        int[] positivo = new int[contadorpos];
		int[] negativo = new int[contadorneg];

        Mostrar(positivo, negativo);

        

		

		
	}
}

