package models;

public class Person {
    int edad;
    String nombre;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Person(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Person [edad=" + edad + ", nombre=" + nombre + "]";
    }

    

    
}
