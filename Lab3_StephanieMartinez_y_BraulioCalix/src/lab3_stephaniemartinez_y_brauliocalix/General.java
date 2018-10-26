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
public class General extends Soldado {

    private int aniosMando;

    public General() {
    }

    public General(int aniosMando, String nombre, String lugar, String edad, int salud, Armas arma) {
        super(nombre, lugar, edad, salud, arma);
        this.aniosMando = aniosMando;
    }

    public int getAniosMando() {
        return aniosMando;
    }

    public void setAniosMando(int aniosMando) {
        this.aniosMando = aniosMando;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArma(Armas arma) {
        super.setArma(arma); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Armas getArma() {
        return super.getArma(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(salud); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSalud() {
        return super.getSalud(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(String edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLugar(String lugar) {
        super.setLugar(lugar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLugar() {
        return super.getLugar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
