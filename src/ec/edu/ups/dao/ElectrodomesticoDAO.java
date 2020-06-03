/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.iDao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author Usuario
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{
    
    private SortedSet<Electrodomestico> lista;

    
    public ElectrodomesticoDAO() {
        lista = new TreeSet<>();
    }
    
    @Override
    public void crearTelevision(Television television) {
        lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }
    
    @Override
    public List<Lavadora> listarLavadora() {
        List<Lavadora> listaLavadora = new ArrayList<>();
        
        Iterator<Electrodomestico> iterador = lista.iterator();
        while(iterador.hasNext()){
            Electrodomestico electrodomestico = iterador.next();
            if(electrodomestico instanceof Lavadora){
                Lavadora lavadora = (Lavadora) electrodomestico;
                listaLavadora.add(lavadora);
            }
        }
        return listaLavadora;
    }    
    
    @Override
    public List<Television> listarTelevision() {
        List<Television> listaTelevision = new ArrayList<>();
        
        Iterator<Electrodomestico> iterador = lista.iterator();
        while(iterador.hasNext()){
            Electrodomestico electrodomestico = iterador.next();
            if(electrodomestico instanceof Television){
                Television television = (Television) electrodomestico;
                listaTelevision.add(television);
            }
        }
        return listaTelevision;
        
    }
    
}
