package Arrays.BoletinArrays;

//separar array en VALORES pares e impares

public class Ejercicio13 {

    public static int[] RellenarArray(int[] lista, int[] auxiliar){
        int j=0;
        for(int i=0;i<lista.length;i++){
            
            if(lista[i]%2==0){
                auxiliar[j]=lista[i];
                j++;
            }
        }

        for(int i=0;i<lista.length;i++){
            
            if(lista[i]%2!=0){
                auxiliar[j]=lista[i];
                j++;
            }
        }
        return auxiliar;
    }

    public static void Mostrar(int[] lista, int[] auxiliar){
        System.out.println("El original es: ");
        for (int i = 0; i < 10; i++) {
			System.out.println("elemento: " + i + " es: " + lista[i]);
		}

        System.out.println("El par-impar es: ");
        for (int i = 0; i < 10; i++) {
			System.out.println("elemento: " + i + " es: " + auxiliar[i]);
		}
    }
    

    public static void main(String[] args) {
        int [] lista = { 1, 2, 5, 6, 7, 8, 4, 9, 3, 11 };
        int[] auxiliar = new int[10];

        auxiliar=RellenarArray(lista, auxiliar);

        Mostrar(lista, auxiliar);


    }

    
}
