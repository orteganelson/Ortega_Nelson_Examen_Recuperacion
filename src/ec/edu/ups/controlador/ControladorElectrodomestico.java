/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class ControladorElectrodomestico {
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private ElectrodomesticoDAO dao;

    
    public ControladorElectrodomestico(VistaElectrodomestico vista, ElectrodomesticoDAO dao) {
        this.vista = vista;

        this.dao = dao;
    }
    
    
    public void registrarTelevision() {

        modelo= vista.ingresarTelevision();
        dao.crearTelevision((Television) modelo);
    }

    public void registrarLavadora() {
        modelo= vista.ingresarLavadora();
        dao.crearLavadora((Lavadora) modelo);
    }

    public void verLavadoras() {
        List<Lavadora> lavadora = new ArrayList<>();
        lavadora = dao.listarLavadora();
        vista.mostrarLavadoras(lavadora);
    }

    public void verTelevisiones() {
        List<Television> television = new ArrayList<>();
        television = dao.listarTelevision();
        vista.mostrarTelevisiones(television);

    }
    
}
