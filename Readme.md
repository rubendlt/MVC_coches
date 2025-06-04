# Examen observer

## Cambios Introducidos en el Código

Para implementar las funcionalidades "Avanzar (metros)" y "Poner gasolina (litros)", se realizaron los siguientes cambios en las clases del proyecto:

### `Coche.java`
- Se añadió el atributo:
    - `double gasolina`: representa los litros de gasolina disponibles (inicializado a 10.0 litros).

- Se implementó el método:
    - `void avanzar(int metros)`  
      Calcula el consumo de gasolina en función de la velocidad actual y la distancia recorrida.
     
      Imprime el nivel de gasolina tras avanzar.

- Se implementó el método:
    - `void ponerGasolina(double litros)`  
      Suma los litros indicados al atributo `gasolina` e imprime el nuevo nivel.

---

### 📄 `Model.java`
- Se añadieron los métodos:
    - `void avanzarCoche(String matricula, int metros)`  
      Llama al método `avanzar()` del coche correspondiente.
    - `void repostarCoche(String matricula, double litros)`  
      Llama al método `ponerGasolina()` del coche correspondiente.

---

### 📄`Controller.java`
- Se añadieron llamadas a las nuevas funcionalidades:
    - `model.avanzarCoche(matricula, metros);`
    - `model.repostarCoche(matricula, litros);`

---

###  `View.java`
- Se pueden añadir métodos para mostrar el nivel de gasolina u opciones al usuario, aunque no es imprescindible para el funcionamiento.

---

Estos cambios permiten simular con mayor realismo el comportamiento de los coches al moverse y consumir gasolina, así como permitir al usuario recargar el depósito.


# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

---
## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class View {+muestraVelocidad(String, Integer)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```

---

## Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
```