public class Productos {

    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;


    public void mostrarInformacion(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponibilidad: " + disponible);
    }

    public void cambiarDisponibilidad(boolean nuevaDisponibilidad){
        disponible = nuevaDisponibilidad;
    }
    void mostrarPrecio(){
        System.out.println("Precio" + precio);
    }

    void mostrarDisponibilidad(){
        System.out.println("El producto esta:" + disponible);
    }


}
