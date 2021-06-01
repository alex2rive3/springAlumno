/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unae.Alumnos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Ruben
 */
@Controller
@Slf4j
public class controladorInicio {
   @Autowired
   private AlumnoDao alumnosDao;
   @GetMapping("/")
   public String inicio(Model model){
       //se llamna al metodo FindAll que ya esta implementado
       String algo = "fsdjslakj";
       var alumnos = alumnosDao.findAll();
       log.info("Ejecutando el controlador Spring MVC");
       model.addAttribute("alumnos ", alumnos);
       model.addAttribute("Algo", algo);
       return "index";
   }
}
