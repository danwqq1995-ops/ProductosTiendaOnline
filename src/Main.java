import java.awt.event.MouseAdapter;

void main() {

    Productos p1 = new Productos();
    Productos p2 = new Productos();
    Productos p3 = new Productos();


    p1.nombre = "Mouse";
    p1.precio = 12.50;
    p1.categoria = "Electronica";
    p1.disponible = true;

    p2.nombre = "Libro";
    p2.precio = 18.50;
    p2.categoria = "Libreria";
    p2.disponible = true;

    p3.nombre = "Pastilla";
    p3.precio = 4.40;
    p3.categoria = "Farmacia";
    p3.disponible = false;

    System.out.println("---Producto 1---");
    p1.mostrarInformacion();

    System.out.println("---Producto 2---");
    p2.mostrarInformacion();

    System.out.println("---Producto 3---");
    p3.mostrarInformacion();


    System.out.println("--CAMBIAR DISPONIBILIDAD--");
    p1.cambiarDisponibilidad(false);
    p1.mostrarDisponibilidad();


    p2.mostrarPrecio();
    p3.mostrarDisponibilidad();


}