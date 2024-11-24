package conconcurrecnia;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que coordina la operación del sistema.
 */
public class Supermercado {

    /**
     * Método principal que coordina la operación del supermercado.
     * @param args
     */
    public static void main(String[] args) {

        Producto p1 = new Producto("Manzana", 2200, 2);
        Producto p2 = new Producto("Pan", 7000, 3);
        Producto p3 = new Producto("Leche", 4200, 4);
        Producto p4 = new Producto("Huevos", 18000, 5);


        Cliente cliente1 = new Cliente("Carlos", List.of(p1, p2, p3));
        Cliente cliente2 = new Cliente("Ana", List.of(p3, p4));
        Cliente cliente3 = new Cliente("Luis", List.of(p1, p1, p2));
        Cliente cliente4 = new Cliente("María", List.of(p4, p2));


        Cajera cajera1 = new Cajera("Laura", cliente1);
        Cajera cajera2 = new Cajera("Sofía", cliente2);
        Cajera cajera3 = new Cajera("Julia", cliente3);
        Cajera cajera4 = new Cajera("Andrea", cliente4);


        cajera1.start();
        cajera2.start();
        cajera3.start();
        cajera4.start();


        try {
            cajera1.join();
            cajera2.join();
            cajera3.join();
            cajera4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las compras han sido procesadas.");
    }
}