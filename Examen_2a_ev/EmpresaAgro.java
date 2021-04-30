package Examen_2a_ev;


/*Ejercicio 5B

Se plantea desarrollar un programa Java que permita la gestión
de una empresa agroalimentaria que trabaja con tres tipos de
productos: productos frescos, productos refrigerados y productos
congelados.
Todos los productos llevan esta información común: fecha de
caducidad y número de lote. A su vez, cada tipo de producto
lleva alguna información específica.

Los productos frescos deben llevar la fecha de envasado y el
país de origen. Los productos refrigerados deben llevar el
código del organismo de supervisión alimentaria. Los productos
congelados deben llevar la temperatura de congelación
recomendada.

Crear el código de las clases Java implementando una relación de
herencia desde la superclase Producto hasta las subclases
ProductoFresco, ProductoRefrigerado y ProductoCongelado.

Cada clase debe disponer de constructor y permitir establecer
(set) y recuperar (get) el valor de sus atributos y tener un
método que permita mostrar la información del objeto.
Crear una clase testProducto con el método main donde se cree un
objeto de cada tipo y se muestren los datos de cada uno de los
objetos creados.*/

public  class  EmpresaAgro {

    String fechaCad;
    int numeroLote;
    String info;
    
    //constructor
    public EmpresaAgro(String fechaCad, int numeroLote, String info) {
        this.fechaCad = fechaCad;
        this.numeroLote = numeroLote;
        this.info = info;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    
    
}
