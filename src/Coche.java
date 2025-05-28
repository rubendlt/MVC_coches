/**
 * Representa un coche con modelo, matrícula, velocidad y gasolina.
 */
public class Coche {
    String modelo;
    String matricula;
    int velocidad;     // km/h
    double gasolina;   // litros

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 0; // valor inicial
    }

    /**
     * Hace avanzar al coche una distancia y reduce gasolina según velocidad.
     * @param metros a avanzar
     */
    public void avanzar(String matricula, int metros, double velocidad, double gasolina) {

        gasolina = gasolina - ((metros/1000) * velocidad); // proporcional a velocidad y distancia
        System.out.println("El coche tiene " + gasolina + "L de gasolina");
    }

    /**
     * Añade gasolina al coche.

     */
    public void ponerGasolina(int matricula, double gasolina, double gasolinaInicial) {

        gasolina += gasolinaInicial;
        System.out.println("El coche tiene ahora" + gasolina + "L de gasolina");
    }

    public double getGasolina() {
        return gasolina;
    }
}
