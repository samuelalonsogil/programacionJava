package Examen_2a_ev;

public class TestProducto {
    

    public static void main(String[] args) {
        ProductoCongelado helado = new ProductoCongelado("31-12-2021", 23, "chocolate", -12);
        ProductoRefrigerado pizza = new ProductoRefrigerado("mañana", 2, "jamon y queso",20);
        ProductoFresco tomate = new ProductoFresco("el lunes", 8, "rojos y ricos", "1-2-2001","España");

        System.out.println(helado);
        System.out.println(pizza);
        System.out.println(tomate);
    }
}
