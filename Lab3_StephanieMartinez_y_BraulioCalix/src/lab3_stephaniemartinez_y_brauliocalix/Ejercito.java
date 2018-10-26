/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_stephaniemartinez_y_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Ejercito {

    private String nombre;
    private String region;
    private int victorias;
    private double dinero;
    private ArrayList soldados;

    public Ejercito() {
    }

    public Ejercito(String nombre, String region, int victorias, double dinero, ArrayList soldados) {
        this.nombre = nombre;
        this.region = region;
        this.victorias = victorias;
        this.dinero = dinero;
        this.soldados = soldados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList soldados) {
        this.soldados = soldados;
    }

    @Override
    public String toString() {
        return "Ejercito{" + "nombre = " + nombre + ", region = " + region + ", victorias = " + victorias + ", dinero = " + dinero + '}';
    }

}
