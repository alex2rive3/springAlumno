/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unae.Alumnos;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ruben
 */
public interface AlumnoDao extends CrudRepository<Alumno, Long>{
    //se pueden definir algunos metodos a utilizar 
    
}
