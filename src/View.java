/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param velocidad velocidad
     * @return true si se ha mostrado correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer velocidad){
        System.out.println(matricula + ": " + velocidad + "km/hr");
        return true;
    }
    public boolean muestraGasolina(String matricula, double litros) {
        System.out.println(matricula + ": " + litros + " litros de gasolina");
        return true;
    }

}

