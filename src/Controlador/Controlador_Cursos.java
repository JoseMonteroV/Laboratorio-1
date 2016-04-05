/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Array_Curso;
import Modelo.Curso;
import Vista.Ventana_Cursos;

/**
 *
 * @author DELL
 */
public class Controlador_Cursos {

    public Controlador_Cursos(Ventana_Cursos ventana_curso) {
        this.ventana_curso = ventana_curso;
    }
    
    private Ventana_Cursos ventana_curso;
    private Curso curso;
    private Array_Curso array_curso;
    
    
    
}
