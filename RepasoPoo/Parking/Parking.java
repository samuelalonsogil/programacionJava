package RepasoPoo.Parking;

public class Parking {
    private short capacidad;
    private short ocupadas = 0;

    Parking(short capacidad) {
        this.capacidad = capacidad;
        this.ocupadas=0;
    }

    public short getocupadas() {
        return (ocupadas);
    }

    public short getcapacidad() {
        return (capacidad);
    }

    public boolean Hayocupadas() {
        return (ocupadas != 0);
    }

    public boolean HayHueco() {
        return (ocupadas != capacidad);
    }

    public void MeteElemento() {
        ocupadas++;
    }

    public void SacaElemento() {
        ocupadas--;
    }

    public void RellenaParking() {
        ocupadas = capacidad;
    }

    public void VaciaParking() {
        ocupadas = 0;
    }
}
