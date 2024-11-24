package conconcurrecnia;

/**
 * Representa un producto en el supermercado.
 */
class Producto {
    private final String nombre;
    private final double precio;
    private final int tiempoProcesamiento; // En segundos

    /**
     * Constructor del Producto.
     *
     * @param nombre              Nombre del producto.
     * @param precio              Precio del producto.
     * @param tiempoProcesamiento Tiempo que tarda en ser escaneado (en segundos).
     */
    public Producto(String nombre, double precio, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }
}

