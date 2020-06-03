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
public class Electrodomestico implements Comparable<Electrodomestico>{
    
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    public Electrodomestico(){
        
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double obtenerPrecioFinal(){
        
        double precioF=0;
        char cE= consumoEnergetico;
                
        if(cE=='A'){
            precioF=precioF+100;
        }
        if(cE=='B'){
            precioF=precioF+80;
        }
        if(cE=='C'){
            precioF=precioF+60;
        }
        if(cE=='D'){
            precioF=precioF+50;
        }
        if(cE=='E'){
           precioF=precioF+30;
        }
        if(cE=='F'){
           precioF=precioF+10;
        }
        
        if(this.peso>=0 && this.peso<=19){
           precioF=precioF+10;
        }
        if(this.peso>=20 && this.peso<=49){
           precioF=precioF+5;
        }
        if(this.peso>=50 && this.peso<=79){
            precioF=precioF+80;
        }
        if(this.peso>=80){
            precioF=precioF+100;
        }   
        precioF=precioF+this.precioBase;
        return precioF;
    }

    @Override
    public int compareTo(Electrodomestico ob){        
        return (int) (this.precioBase-ob.precioBase);
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" +
                descripcion + ", precioBase=" + precioBase + ", color=" +
                color + ", consumoEnergetico=" + consumoEnergetico + 
                ", peso=" + peso + '}';
    }
    
    
    
    
    
}
