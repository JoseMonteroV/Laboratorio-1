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



public class ArrayEstudiante 
{
    private ArrayList<Estudiante>lista;
    
    public ArrayEstudiante()
    {
        lista = new ArrayList<Estudiante>();
    }
    
    public void agregar(Estudiante estudiante)
    {
        lista.add(estudiante);
    }
    
    public Estudiante buscar(String carnet)
    {
        Estudiante estudiante = null;
         for(int i = 0; i < lista.size(); i++)
         {
             if(lista.get(i).getCarnet().equalsIgnoreCase(carnet))
             {
                 estudiante = lista.get(i);
             }
         }
         return estudiante;
    }
}


