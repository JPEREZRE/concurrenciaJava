package sinconcurrencia;

/**
 * Simula a una cajera que procesa las compras de un cliente.
 */
class CajeraSinConcurrencia {
    private final String nombre;

    /**
     * Constructor de Cajera.
     *
     * @param nombre Nombre de la cajera.
     */
    public CajeraSinConcurrencia(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Procesa las compras de un cliente.
     *
     * @param cliente Cliente que la cajera está atendiendo.
     */
    public void procesarCompra(Cliente cliente) {
        System.out.println("La cajera " + nombre + " comienza a atender al cliente " + cliente.getNombre());
        long tiempoInicio = System.currentTimeMillis();
        double total = 0;

        for (ProductoSinConcurrencia producto : cliente.getProductos()) {
            try {
                Thread.sleep(producto.getTiempoProcesamiento() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total += producto.getPrecio();
            System.out.println("La Cajera " + nombre + " procesó producto: " +
                    producto.getNombre() + " | Precio: " + producto.getPrecio() +
                    " | Tiempo: " + producto.getTiempoProcesamiento() + " segundos.");
        }

        long tiempoFin = System.currentTimeMillis();
        System.out.println("La Cajera " + nombre + " finalizó con el cliente " + cliente.getNombre() +
                ". Total: $" + total + ". Tiempo total: " +
                ((tiempoFin - tiempoInicio) / 1000) + " segundos.\n");
    }
}

