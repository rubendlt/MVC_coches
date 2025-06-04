package observer;

/**
 * Observador que muestra un mensaje de alerta si la gasolina
 * del coche desciende por debajo de 10 litros.
 */
public class AlarmaGasolina implements Observer {
    @Override
    public void update(float litros) {
        if (litros < 10) {
            System.out.println("Alerta: Repostar");
        }
    }
}