/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class VistaElectrodomestico {
    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada=new Scanner(System.in);
    }
    
    public Television ingresarTelevision(){
        Television television = new Television();
        
        System.out.println("Ingrese los datos de Television: ");
        System.out.print("Ingrese Codigo: ");
        int codigo = entrada.nextInt();
        television.setCodigo(codigo);
        
        System.out.print("Ingrese Descripcion: ");
        String descripcion = entrada.next();
        television.setDescripcion(descripcion);
        
        System.out.print("Ingrese Precio Base: ");
        double precio = entrada.nextDouble();
        television.setPrecioBase(precio);
        
        System.out.print("Ingrese Color: ");
        String color = entrada.next();
        television.setColor(color);
        
        System.out.print("Ingrese Consumo de energia: ");
        String consumoEnergetico = entrada.next();
        char consumo = consumoEnergetico.charAt(0);
        television.setConsumoEnergetico(consumo);
        
        System.out.print("Ingrese Peso: ");
        int peso = entrada.nextInt();
        television.setPeso(peso);
        
        System.out.print("Ingrese Resolucion: ");
        int resolucion = entrada.nextInt();
        television.setResolucion(resolucion);
        
        System.out.print("¿Tiene puerto HDMI? [Si/No]: ");
        String co = entrada.next();
        boolean puerto = false;
        if (co.equalsIgnoreCase("Si")) {
            puerto = true;
        }
        television.setPuertoHDMI(puerto);
        
        return television;
    }
    
    public Lavadora ingresarLavadora(){
         Lavadora lavadora = new Lavadora();
        
        System.out.println("Ingrese los datos de Lavadora: ");
        System.out.print("Ingrese Codigo: ");
        int codigo = entrada.nextInt();
        lavadora.setCodigo(codigo);
        
        System.out.print("Ingrese Descripcion: ");
        String descripcion = entrada.next();
        lavadora.setDescripcion(descripcion);
        
        System.out.print("Ingrese Precio Base: ");
        double precio = entrada.nextDouble();
        lavadora.setPrecioBase(precio);
        
        System.out.print("Ingrese Color: ");
        String color = entrada.next();
        lavadora.setColor(color);
        
        System.out.print("Ingrese Consumo de energia: ");
        String consumoEnergetico = entrada.next();
        char consumo = consumoEnergetico.charAt(0);
        lavadora.setConsumoEnergetico(consumo);
        
        System.out.print("Ingrese Peso: ");
        int peso = entrada.nextInt();
        lavadora.setPeso(peso);
        
        System.out.print("Ingrese Carga: ");
        int carga = entrada.nextInt();
        lavadora.setCarga(carga);
        
        return lavadora;
    }
    
     public void mostrarLavadoras(List<Lavadora> lista) {
        System.out.println("\nLista ordenada de Lavadoras:\n ");
        for(Lavadora lavadora : lista){
            System.out.println(lavadora.toString());
        }
        
    }
    
    public void mostrarTelevisiones(List<Television> lista) {
        System.out.println("\nLista ordenada de Televisiones:\n");
        for(Television television: lista){
            System.out.println(television.toString());
        }
        
    }
    
}
