/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_stephaniemartinez_y_brauliocalix;

/**
 *
 * @author User
 */
public class Armas {
    private String nombre;
    private int alcance;
    private double precio;

    public Armas() {
    }

    public Armas(String nombre, int alcance, double precio) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "    Armas{" + "nombre = " + nombre + ", alcance = " + alcance + ", precio = " + precio + '}';
    }
    
}
