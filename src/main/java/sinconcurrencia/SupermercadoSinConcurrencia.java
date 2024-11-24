package sinconcurrencia;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que coordina la simulación del sistema sin concurrencia.
 */
public class SupermercadoSinConcurrencia {

    public static void main(String[] args) {
        
        ProductoSinConcurrencia p1 = new ProductoSinConcurrencia("Manzana", 2200, 2);
        ProductoSinConcurrencia p2 = new ProductoSinConcurrencia("Pan", 7000, 3);
        ProductoSinConcurrencia p3 = new ProductoSinConcurrencia("Leche", 4200, 4);
        ProductoSinConcurrencia p4 = new ProductoSinConcurrencia("Huevos", 18000, 5);

        
        Cliente cliente1 = new Cliente("Carlos", List.of(p1, p2, p3));
        Cliente cliente2 = new Cliente("Ana", List.of(p3, p4));
        Cliente cliente3 = new Cliente("Luis", List.of(p1, p1, p2));
        Cliente cliente4 = new Cliente("María", List.of(p4, p2));


        CajeraSinConcurrencia cajera1 = new CajeraSinConcurrencia("Laura");
        CajeraSinConcurrencia cajera2 = new CajeraSinConcurrencia("Sofía");
        CajeraSinConcurrencia cajera3 = new CajeraSinConcurrencia("Julia");
        CajeraSinConcurrencia cajera4 = new CajeraSinConcurrencia("Andrea");


        cajera1.procesarCompra(cliente1);
        cajera2.procesarCompra(cliente2);
        cajera3.procesarCompra(cliente3);
        cajera4.procesarCompra(cliente4);

        System.out.println("Todas las compras han sido procesadas.");
    }
}
