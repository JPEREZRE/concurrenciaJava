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

    /**
     * Obtiene el nombre del producto.
     * @return el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     * @return el precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tiempo de procesamiento del producto.
     * Este tiempo representa cuántos segundos tarda en ser escaneado.
     *
     * @return el tiempo de procesamiento en segundos.
     */
    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }
}

