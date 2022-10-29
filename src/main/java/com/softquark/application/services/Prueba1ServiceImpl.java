package com.softquark.application.services;

import com.softquark.application.model.dao.Prueba1DAO;
import com.softquark.application.model.entity.Prueba1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Prueba1ServiceImpl implements Prueba1Service {
    
    @Override
    @Transactional(readOnly = true)
    public List<Prueba1> listarPrueba1() {
        return (List<Prueba1>) prueba1DAO.findAll();
    }
    
    @Override
    @Transactional
    public void guardar(Prueba1 prueba1) {
        prueba1DAO.save(prueba1);
    }
    
    @Override
    @Transactional
    public void eliminar(Prueba1 prueba1) {
        prueba1DAO.delete(prueba1);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Prueba1 encontrarPrueba1(Prueba1 prueba1) {
        return prueba1DAO.findById(prueba1.getId()).orElse(null);
    }
    
    @Autowired
    private Prueba1DAO prueba1DAO;
}
