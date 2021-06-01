/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unae.Alumnos;

import java.util.List;

/**
 *
 * @author Ruben
 */
public interface AlumnoService {
    public List<Alumno> listaAlumnos();
    public void guardar(Alumno alumno);
    public void eliminar(Alumno alumno);
    public Alumno encontrarAlumno();
}
