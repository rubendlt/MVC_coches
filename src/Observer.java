package observer;

/**
 * Interfaz para objetos que desean observar cambios
 * en un objeto observable como el coche.
 */
public interface Observer {
    /**
     * Método llamado cuando cambia el estado observado.
     * @param litros Nivel de gasolina actual
     */
    void update(float litros);
}