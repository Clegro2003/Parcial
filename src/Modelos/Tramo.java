/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author carlo
 */
public class Tramo {
    private String nombre;
    private String tiemporecorrido;
    private Tramo Recorrido;

    public Tramo() {
        this("Valledupar-Cesar","5 horas",new Tramo());
    }

    public Tramo(String nombre, String tiemporecorrido, Tramo Recorrido) {
        this.nombre = nombre;
        this.tiemporecorrido = tiemporecorrido;
        this.Recorrido = Recorrido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiemporecorrido() {
        return tiemporecorrido;
    }

    public void setTiemporecorrido(String tiemporecorrido) {
        this.tiemporecorrido = tiemporecorrido;
    }

    public Tramo getRecorrido() {
        return Recorrido;
    }

    public void setRecorrido(Tramo Recorrido) {
        this.Recorrido = Recorrido;
    }

    @Override
    public String toString() {
        return "Tramo{" + "nombre=" + nombre + ", tiemporecorrido=" + tiemporecorrido + ", Recorrido=" + Recorrido + '}';
    }

    
    
}

