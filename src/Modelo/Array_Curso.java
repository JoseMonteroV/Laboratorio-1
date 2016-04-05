/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Array_Curso {
    ArrayList<Curso> lista_cursos;

    public Array_Curso(ArrayList<Curso> lista_cursos) {
        this.lista_cursos = lista_cursos;
    }
    
    public void agregar(Curso curso){
        lista_cursos.add(curso);
    }
    
    public int buscar(String siglas){
         
        for(int indice=0;indice<lista_cursos.size();indice++){
            if(lista_cursos.get(indice).getSiglas().equalsIgnoreCase(siglas))
                return indice;
        }
        return -1;
    }
    
    public void eliminarCurso(int posicion) {
        lista_cursos.remove(posicion);
    }

    public void eliminarCurso(Curso curso) {
        lista_cursos.remove(curso);
    }

    public boolean eliminarCurso(String siglas) {
        int posicion = buscar(siglas);
        if (posicion != -1) {
            eliminarCurso(posicion);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificar(Curso curso) {
        int posicion = buscar(curso.getSiglas());
        if (posicion != -1) {
            lista_cursos.set(posicion, curso);
            return true;
        }
        else
            return false;
    }
    
    public Curso getCurso(String siglas){
        int posicion = buscar(siglas);
        if (posicion != -1) {
            return lista_cursos.get(posicion);
        }
        else
            return null;
    }

    public ArrayList getCursos(){
        return lista_cursos;
    }
    
}
