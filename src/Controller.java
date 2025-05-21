/**
 * Clase controlador que conecta la vista con el modelo.
 */
public class Controlador {
    private Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    public void crearCoche(String marca, String modelo) {
        Coche coche = new Coche(marca, modelo);
        this.modelo.añadirCoche(coche);
    }

    public void aumentarVelocidad(int index) {
        Coche coche = modelo.obtenerCoche(index);
        if (coche != null) {
            coche.aumentarVelocidad();
        }
    }

    public void disminuirVelocidad(int index) {
        Coche coche = modelo.obtenerCoche(index);
        if (coche != null) {
            coche.disminuirVelocidad();
        }
    }

    public void mostrarCoches() {
        int i = 0;
        for (Coche coche : modelo.obtenerCoches()) {
            System.out.println("[" + i++ + "] " + coche);
        }
    }
}
