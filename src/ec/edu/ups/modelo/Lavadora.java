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
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int codigo) {
        super(codigo);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double obtenerPrecioFinal(){
        double preF = super.obtenerPrecioFinal();
        double preB = super.getPrecioBase();
        double preF2 = preF + preB;

        if (this.carga > 30) {
            preF2= preF2+50;
        }
        
        return preF2;
    }

    @Override
    public String toString() {
        return   super.toString() + "Lavadora: " + "carga: " + carga + "Precio Final: "
                + this.obtenerPrecioFinal();
    }        
    
}
