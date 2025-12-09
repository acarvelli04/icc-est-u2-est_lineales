# Implementación de Estructura de Datos Lineal: Pila (Stack) en Java

## 👤 Información del Autor
**Autor:** Antonio Carvelli

**Materia:** Estructura de Datos  

---

## 📄 Descripción del Proyecto
Este proyecto es una implementación práctica de una estructura de datos tipo **Pila (Stack)** construida desde cero en Java.

El programa demuestra el principio **LIFO** (Last In, First Out - El último en entrar es el primero en salir). En lugar de usar números simples, la pila almacena objetos de la clase `Person` (que contienen nombre y edad), demostrando el uso de **Genéricos (`<T>`)** para hacer el código reutilizable.

## 🚀 ¿Cómo funciona? (Explicación Simple)
Imagina una pila de platos sucios:
1.  **Push (Insertar):** Pones un plato nuevo encima de los demás. En este código, agregamos personas (`Juan`, `Maria`, `Pepito`, `Diego`) una tras otra.
2.  **Top (Cima):** El último que agregaste (`Diego`) queda en la parte superior.
3.  **Pop (Sacar):** Cuando quitas un plato, debes quitar el de arriba primero.
4.  **Peek (Mirar):** Observas quién está arriba sin sacarlo.

### Estructura del Código:

* **`models/Node.java`**: Es el contenedor genérico `<T>`. Cada nodo guarda un dato (ej. una Persona) y una referencia (`next`) al siguiente nodo en la lista.
* **`controllers/Stack.java`**: Es el "cerebro" de la pila. Contiene los métodos lógicos:
    * `push()`: Agrega a la cima.
    * `pop()`: Saca de la cima.
    * `peek()`: Muestra la cima.
    * `printAllNodes()`: Imprime la lista completa desde la cima hasta el final.
* **`App.java`**: Es la clase principal (`main`). Aquí se crean las personas, se agregan a la pila y se muestra el resultado en la consola.



## 📊 Ejemplo de Salida
Al ejecutar el programa, verás cómo se agregan las personas y luego cómo la estructura "Cima" cambia al usar `pop()`:

![alt text](<assects/Captura de pantalla 2025-12-09 083956.png>)
