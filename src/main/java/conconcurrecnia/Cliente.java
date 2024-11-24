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

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}


