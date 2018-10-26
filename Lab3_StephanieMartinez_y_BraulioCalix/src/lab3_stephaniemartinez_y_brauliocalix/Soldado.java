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
public class Soldado {

    private String nombre;
    private String lugar;
    private String edad;
    private int salud;
    private Armas arma;

    public Soldado() {
    }

    public Soldado(String nombre, String lugar, String edad, int salud, Armas arma) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.edad = edad;
        this.salud = salud;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", lugar=" + lugar + ", edad=" + edad + ", salud=" + salud + ", arma=" + arma + '}';
    }

}
