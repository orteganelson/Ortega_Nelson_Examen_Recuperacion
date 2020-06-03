/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();


        ControladorElectrodomestico controlador = new ControladorElectrodomestico(vista , dao);
        
        int cont=0;
        while(cont<3){            
            controlador.registrarTelevision();
            System.out.println(" ");
            cont++;
        }
        
        int cont2=0;
        while(cont2<3){
            controlador.registrarLavadora();
            System.out.println("");
            cont2++;
        }   
        
        controlador.verTelevisiones();
        controlador.verLavadoras();
        
        
       /* Scanner ingresar = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Ingresar Television-->1");
        System.out.println("Ingresar Lavadora---->2");
        System.out.println("Listar Televisiones-->3");
        System.out.println("Listar Lavadoras------>4");
        int op = ingresar.nextInt();
        
        switch(op){
            case 1:
                controlador.registrarTelevision();
                break;
            case 2:
                controlador.registrarLavadora();
                break;
            case 3:
                controlador.verTelevisiones();
                break;
            case 4:
                controlador.verLavadoras();
                break;
        }*/
       
    }
}
