/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softquark.application.services;

import com.softquark.application.model.entity.Prueba1;
import java.util.List;

/**
 *
 * @author Augusto Vicente
 */

public interface Prueba1Service {
    public List<Prueba1> listarPrueba1();
    
    public void guardar(Prueba1 prueba1);
    
    public void eliminar(Prueba1 prueba1);
    
    public Prueba1 encontrarPrueba1(Prueba1 prueba1);
}
