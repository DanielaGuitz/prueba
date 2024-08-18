package umg.ejercicio;

public class Conductores {
    //Atributos de la clase Conductores
    String nombre;
    String licencia;
    int placa;

    //Constructor
    public Conductores(String nombre, String licencia,int placa){
        this.nombre= nombre;
        this.licencia= licencia;
        this.placa= placa;

    }
    //Acción para mostrar la funcion
    public void mostrarInforacion (){
        System.out.println("Nombre:"+ this.nombre);
        System.out.println("Licencia" + this.licencia);
        System.out.println("Placa:" + this.placa);
    }

}
