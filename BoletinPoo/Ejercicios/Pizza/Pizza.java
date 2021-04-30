package BoletinPoo.Ejercicios.Pizza;
import java.util.ArrayList;

public class Pizza {

    static ArrayList<Pizza> pendientes=new ArrayList<>();

    int num;
    String tamaño,tipo;
    boolean estado; //false=pedida, true=servida
    
    private static int pedidas=0;
    private static int servidas=0;
    
    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = false;
        pedidas++;
        this.num=pedidas;
        pendientes.add(this);
        ListarPendientes();
    }

    public static int getPedidas() {
        return pedidas;
    }

    public static int getServidas() {
        return servidas;
    }

    @Override
    public String toString() {
        return "Pizza [estado=" + estado + ", num=" + num + ", tamaño=" + tamaño + ", tipo=" + tipo + "]";
    }

    public void Servir(){
        if(this.estado==false){
            estado=true;
            servidas++;
            pendientes.remove(this);
            ListarPendientes();
        }else{
            System.out.println("Ya está servida");
        }
    }

    public static void ListarPendientes(){
        System.out.println("Pendientes de servir: ");
        for(int i=0;i<pendientes.size();i++){
            System.out.println(pendientes.get(i).toString());
            System.out.println("---------------------------");
        }
    }

    public static void Estado(){
        System.out.println("Total pedidas: " + pedidas);
        System.out.println("Total servidas: " + servidas);
    }
}
