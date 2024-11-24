package conconcurrecnia;

import java.util.List;

/**
 * Representa a un cliente que realiza compras.
 */
class Cliente {
    private final String nombre;
    private final List<Producto> productos;

    /**
     * Constructor de Cliente.
     *
     * @param nombre    Nombre del cliente.
     * @param productos Lista de productos comprados por el cliente.
     */
    public Cliente(String nombre, List<Producto> productos) {
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
    public List<Producto> getProductos() {
        return productos;
    }
}


