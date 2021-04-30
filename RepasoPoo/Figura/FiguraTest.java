package RepasoPoo.Figura;

import java.awt.Color;

public class FiguraTest {
    public static void main(String[] args) {
        int[] Posicion = new int[3];
       
        Figura Bionicle = new Figura(Color.RED);
        Figura Ben10 = new Figura(Color.GREEN, Posicion);

        System.out.println(Bionicle.getColor());
        System.out.println(Ben10.getColor());
        

        System.out.println(Ben10.toString());
    }
}
