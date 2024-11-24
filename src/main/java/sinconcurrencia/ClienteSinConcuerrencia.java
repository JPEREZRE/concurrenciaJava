package sinconcurrencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un cliente que realiza compras.
 */
class Cliente {
    private final String nombre;
    private final List<ProductoSinConcurrencia> productos;

    /**
     * Constructor de Cliente.
     *
     * @param nombre    Nombre del cliente.
     * @param productos Lista de productos comprados por el cliente.
     */
    public Cliente(String nombre, List<ProductoSinConcurrencia> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Obtiene el nombre del producto.
     * @return el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de productos adquiridos.
     * @return una lista de objetos que representa los productos adquiridos por el cliente.
     */
    public List<ProductoSinConcurrencia> getProductos() {
        return productos;
    }

}

