package RepasoPoo.Parking;

import RepasoPoo.Parking.Parking;

public class Puerta {
    Parking aparcadoiro = null;

    Puerta(Parking aparcadoiro) {
        this.aparcadoiro = aparcadoiro;
    }

    public void EntraVehiculo() {
        if (aparcadoiro.HayHueco()) {
            System.out.println("Puede entrar");
            // Abrir la barrera
            aparcadoiro.MeteElemento();
        }else
        System.out.println("Aparcamiento completo");
    }

    public void SaleVehiculo() {
        // Comprobar el pago
        System.out.println("Puede salir");
        // Abrir la barrera
        aparcadoiro.SacaElemento();
    }
}
