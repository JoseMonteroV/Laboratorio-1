/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    
    public void agregarEstudiante(Estudiante estudiante)
    {
        lista.add(estudiante);
    }
    
    public Estudiante buscarEstudiante(String carnet)
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
    
    public void eliminarEstudiante(String carnet)
    {
        int opcion = 2;
        for(int i = 0; i < lista.size(); i++)
        {
                if(lista.get(i).getCarnet().equals(carnet))
                {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Esta seguro que desea eliminar al estudiante? \n\n      1. SI    2. NO"));
                        if(opcion == 1)
                        {
                                lista.remove(lista.get(i));
                                JOptionPane.showMessageDialog(null,"El estudiante se elimino correctamente");
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null,"El estudiante NO se elimino");
                        }
                }
                else
                {
                        JOptionPane.showMessageDialog(null,"El estudiante no se encuentra");
                }
        }
    }
}


