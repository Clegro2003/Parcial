/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;


/**
 *
 * @author carlo
 */
public class Ruta {
    private String id;
    private String nombre;
    private String ciudadOrigen;
    private String CiudadDestino;
    private String estado;
    private ArrayList<Tramo> tramos;

    public Ruta() {
        this("123456","Ruta1","Valledupar","Santa Marta","Habilitada");
    }

    public Ruta(String id, String nombre, String ciudadOrigen, String CiudadDestino, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.estado = estado;
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Tramo> getTramos() {
        return tramos;
    }

    public void setTramos(ArrayList<Tramo> tramos) {
        this.tramos = tramos;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", nombre=" + nombre + ", ciudadOrigen=" + ciudadOrigen + ", CiudadDestino=" + CiudadDestino + ", estado=" + estado + ", tramos=" + tramos + '}';
    }

    
    
}
