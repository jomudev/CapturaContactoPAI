/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hectormurillo
 */
public class Contacto {
    private String nombre;
    private String telefono;
          
    public Contacto (String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }
    
}
