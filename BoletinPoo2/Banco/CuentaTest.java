package BoletinPoo2.Banco;

public class CuentaTest {

    public static void main(String[] args) {

        Cuenta Santander = new Cuenta("Samuel", 1000);
        Santander.Ingresar(200);
        Santander.Retirar(100);
        System.out.println(Santander.toString());

    }

}
