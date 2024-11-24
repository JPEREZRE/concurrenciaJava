package conconcurrecnia;

/**
 * Simula a una cajera que procesa las compras de un cliente.
 */
class Cajera extends Thread {
    private final String nombre;
    private final Cliente cliente;

    /**
     * Constructor de Cajera.
     *
     * @param nombre  Nombre de la cajera.
     * @param cliente Cliente a procesar.
     */
    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + nombre + " comienza a atender al cliente " + cliente.getNombre());
        long tiempoInicio = System.currentTimeMillis();
        double total = 0;

        for (Producto producto : cliente.getProductos()) {
            try {
                Thread.sleep(producto.getTiempoProcesamiento() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total += producto.getPrecio();
            System.out.println("Cajera " + nombre + " procesó producto: " +
                    producto.getNombre() + " | Precio: " + producto.getPrecio() +
                    " | Tiempo: " + producto.getTiempoProcesamiento() + " segundos.");
        }

        long tiempoFin = System.currentTimeMillis();
        System.out.println("Cajera " + nombre + " finalizó con el cliente " + cliente.getNombre() +
                ". Total: $" + total + ". Tiempo total: " +
                ((tiempoFin - tiempoInicio) / 1000) + " segundos.\n");
    }
}


