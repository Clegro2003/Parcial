/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;

/**
 *
 * @author carlo
 */
public class MotordeBusqueda {
    private String nombre;
    private LocalDate fecharecorrido;
    private Ruta rutas;
    private Tramo tramos;

    public MotordeBusqueda() {
        this("Ruta1",LocalDate.now(),new Ruta(),new Tramo());
    }

    public MotordeBusqueda(String nombre, LocalDate fecharecorrido, Ruta rutas, Tramo tramos) {
        this.nombre = nombre;
        this.fecharecorrido = fecharecorrido;
        this.rutas = rutas;
        this.tramos = tramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecharecorrido() {
        return fecharecorrido;
    }

    public void setFecharecorrido(LocalDate fecharecorrido) {
        this.fecharecorrido = fecharecorrido;
    }

    public Ruta getRutas() {
        return rutas;
    }

    public void setRutas(Ruta rutas) {
        this.rutas = rutas;
    }

    public Tramo getTramos() {
        return tramos;
    }

    public void setTramos(Tramo tramos) {
        this.tramos = tramos;
    }

    @Override
    public String toString() {
        return "MotordeBusqueda{" + "nombre=" + nombre + ", fecharecorrido=" + fecharecorrido + ", rutas=" + rutas + ", tramos=" + tramos + '}';
    }

    
}
