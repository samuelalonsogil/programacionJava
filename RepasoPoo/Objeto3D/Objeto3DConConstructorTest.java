package RepasoPoo.Objeto3D;

import RepasoPoo.Objeto3D.Objeto3DConConstructor;

public class Objeto3DConConstructorTest {
    public static void main(String[] args) {

        Objeto3DConConstructor Caja = new Objeto3DConConstructor(20.0, 12.5, 30.2, "centimetros");

        Objeto3DConConstructor Esfera = new Objeto3DConConstructor(10.0, "pulgadas", 10.0, 10.0);

        Objeto3DConConstructor Bicicleta = new Objeto3DConConstructor(90.0, 30.0, 20.0);

        System.out.println(Bicicleta.GetMedida());
        System.out.println(Bicicleta.GetAlto());

        Bicicleta.TipoMedida("pulgadas");

        System.out.println(Bicicleta.GetMedida());
        System.out.println(Bicicleta.GetAlto());

        System.out.println(Caja.toString());
        System.out.println(Esfera.toString());
        System.out.println(Bicicleta.toString());

    }

}
