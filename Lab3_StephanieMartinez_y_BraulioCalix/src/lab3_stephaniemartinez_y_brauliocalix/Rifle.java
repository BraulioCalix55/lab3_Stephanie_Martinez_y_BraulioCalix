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
public class Rifle extends Armas{
    private int automatico;

    public Rifle() {
    }

    public Rifle(int automatico, String nombre, int alcance, double precio) {
        super(nombre, alcance, precio);
        this.automatico = automatico;
    }

    public int getAutomatico() {
        return automatico;
    }

    public void setAutomatico(int automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlcance(int alcance) {
        super.setAlcance(alcance); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAlcance() {
        return super.getAlcance(); //To change body of generated methods, choose Tools | Templates.
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
