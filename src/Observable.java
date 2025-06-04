package observer;

/**
 * Interfaz que representa un objeto observable
 * al que se pueden registrar observadores.
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}