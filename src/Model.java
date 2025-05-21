import java.util.ArrayList;

/**
 * Clase modelo que almacena y gestiona la lista de coches.
 */
public class Modelo {
    private ArrayList<Coche> coches;

    public Modelo() {
        coches = new ArrayList<>();
    }

    /**
     * Añade un nuevo coche a la lista.
     */
    public void añadirCoche(Coche coche) {
        coches.add(coche);
    }

    /**
     * Devuelve la lista de todos los coches.
     */
    public ArrayList<Coche> obtenerCoches() {
        return coches;
    }

    /**
     * Devuelve un coche según su índice.
     */
    public Coche obtenerCoche(int index) {
        if (index >= 0 && index < coches.size()) {
            return coches.get(index);
        } else {
            return null;
        }
    }
}
