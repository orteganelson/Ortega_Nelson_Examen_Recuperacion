/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Usuario
 */
public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int codigo) {
        super(codigo);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal(){
        double precioF=super.obtenerPrecioFinal();
        
        if(this.resolucion>40){
            precioF=(precioF*0.3)+precioF;
        }
        if(this.puertoHDMI==true){
            precioF=precioF+50;
        }
        return precioF;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nTelevision:\n" + "resolucion: "
                + resolucion + ", puertoHDMI: " + puertoHDMI + "\nPrecio Final: "
                + this.obtenerPrecioFinal();
    }
    
    
    
}
