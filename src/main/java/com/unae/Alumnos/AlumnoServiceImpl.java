/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unae.Alumnos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruben
 */
@Service
public class AlumnoServiceImpl implements AlumnoService{
    
    @Autowired
    private AlumnoDao alumnoDao;
    
    @Override
    public List<Alumno> listaAlumnos() {
        return(List<Alumno>) alumnoDao.findAll();
    }

    @Override
    public void guardar(Alumno alumno) {
        
    }

    @Override
    public void eliminar(Alumno alumno) {
        
    }

    @Override
    public Alumno encontrarAlumno() {
        return (Alumno) alumnoDao;
    }
    
}
