package BoletinPoo.Ejercicios.Pizza;

public class TestPizza {
   
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");

        p2.Servir();
        p1.Servir();

        Pizza.Estado();
    }

    
}
