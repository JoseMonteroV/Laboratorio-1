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
    int pos;
    
    public ArrayEstudiante()
    {
        lista = new ArrayList<Estudiante>();
    }
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    /*public String agregarEstudiante(Estudiante estudiante)
    {
        if(verificarEstudiante(estudiante.getCarnet()) == true)
        {
            return "Ya hay un estudiante con ese carnet";
        }
        lista.add(estudiante);
        return "Agregado exitosamente";
    }*/
    
    public void agregarEstudiante(Estudiante estudiante) {

        //if (verificarEstudiante(estudiante.getCarnet()) == true) {
          //  return " ya existe un estudiante con ese numero de carnet";
        //}
        lista.add(estudiante);
        //return "se agrego con exito";
    }
    
    public boolean verificarEstudiante(String carnet) {

        boolean dev = false;
        if (lista.size() != 0) {

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getCarnet().equalsIgnoreCase(carnet)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }
    
    public boolean buscarEstudiante(String carnet)
    {
        boolean estudiante = false;
         for(int i = 0; i < lista.size(); i++)
         {
             if(lista != null){
                if(lista.get(i).getCarnet().equalsIgnoreCase(carnet))
                {
                     estudiante = true;
                     setPos(i);
                }
             }
         }
         return estudiante;
    }
    
    public Estudiante getArray(){
         return lista.get(getPos());
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


