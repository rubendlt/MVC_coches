/**
 * Clase que representa un coche con marca, modelo y velocidad.
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    /**
     * Constructor que inicializa un coche con marca y modelo.
     * La velocidad inicial es 0.
     */
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    /**
     * Aumenta la velocidad del coche en 10 km/h.
     */
    public void aumentarVelocidad() {
        velocidad += 10;
    }

    /**
     * Disminuye la velocidad del coche en 10 km/h.
     * No baja de 0.
     */
    public void disminuirVelocidad() {
        if (velocidad >= 10) {
            velocidad -= 10;
        }
    }

    public String getMarca() { return marca; }

    public String getModelo() { return modelo; }

    public int getVelocidad() { return velocidad; }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Velocidad: " + velocidad + " km/h";
    }
}
