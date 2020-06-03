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
        double preF= super.obtenerPrecioFinal();
        double preB = super.getPrecioBase();

        preF=preF+preB;
        
        if(this.resolucion>40){
            preF =preF +(preF*0.3);
        }
        
        if (this.puertoHDMI == true){
            preF=preF+50;
        }
        
        return preF;
    }

    @Override
    public String toString() {
        return   super.toString() + "Television:" + "resolucion: "
                + resolucion + ", puertoHDMI: " + puertoHDMI + "Precio Final: "
                + this.obtenerPrecioFinal();
    }
    
    
    
}
