/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArrayEstudiante;
import Modelo.Estudiante;
import Vista.ManipulaEstudiantes;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Controlador_Mantenimiento_Estudiante implements ActionListener {

    public final static int CARNET = 1;
    public final static int NOMBRE = 2;
    public final static int CORREO = 3;
    public final static int AGREGAR = 4;
    public final static int ELIMINAR = 5;
    public final static int MODIFICAR = 6;
    public final static int BUSCAR = 7;
    
    private ManipulaEstudiantes manipulaEstudiantes;
    private Estudiante estudiante;
    private ArrayEstudiante arrayEstudiante;
    
    public Controlador_Mantenimiento_Estudiante(ManipulaEstudiantes manipulaEstudiantes){
            //, ArrayEstudiante arrayEstudiante
        this.manipulaEstudiantes = manipulaEstudiantes;
       // this.arrayEstudiante = arrayEstudiante;
    }    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.manipulaEstudiantes.get_codigo_por_fuente(ae.getSource());
       //cambiar get_codigo_por_fuente por funte 
        switch(codigo)
        {
             case AGREGAR:
                if (manipulaEstudiantes.verificar() == true) {

                    JOptionPane.showMessageDialog(null, "LLene todos los campos");

                } else {
                    //if((arrayEstudiante.buscarEstudiante(manipulaEstudiantes.getJtCarnet())) == false){
                        estudiante = new Estudiante(manipulaEstudiantes.getJtCarnet(), manipulaEstudiantes.getJtNombre(), manipulaEstudiantes.getJtCorreo());
                        arrayEstudiante = new ArrayEstudiante();
                        arrayEstudiante.agregarEstudiante(estudiante);
                        JOptionPane.showMessageDialog(null,"Agregado exitosamente");
                        manipulaEstudiantes.limpiar();
                        System.out.println(estudiante.getCarnet());
                    //}
                    //else{
                      //  JOptionPane.showMessageDialog(null,"Ya existe un estudiante con ese carnet");
                    //}
                        
                }
                break;
            
            case ELIMINAR:
                if(manipulaEstudiantes.verificar() == true)
                {
                        JOptionPane.showMessageDialog(null,"Digite un Carnet");
                }
                else
                {
                        arrayEstudiante.eliminarEstudiante(manipulaEstudiantes.getJtCarnet());
                }
                manipulaEstudiantes.limpiar();
            break;
            case BUSCAR:
                if(this.manipulaEstudiantes.verificarCarnet() == true)
                {
                    JOptionPane.showMessageDialog(null,"Digite un carnet");
                    manipulaEstudiantes.limpiar();
                }
                else
                {
                   
                    if(arrayEstudiante.buscarEstudiante(manipulaEstudiantes.getJtCarnet()) == false)
                    {
                            
                        JOptionPane.showMessageDialog(null,"El estudiante no se encuentra");
                        manipulaEstudiantes.limpiar();
                    }
                    else
                    {
                        manipulaEstudiantes.setJtNombre(arrayEstudiante.getArray().getNombre());
                        manipulaEstudiantes.setJtCorreo(arrayEstudiante.getArray().getCorreo());
                    }
                }
                
            break;
            case MODIFICAR:
                if(manipulaEstudiantes.verificar() == true)
                {
                    JOptionPane.showMessageDialog(null,"Busque primero el estudiante que desea eliminar");
                }
                else
                {
                    if(estudiante == null)
                    {
                        JOptionPane.showMessageDialog(null,"El estudiante no existe");
                        manipulaEstudiantes.limpiar();
                    }
                    else
                    {
                        manipulaEstudiantes.setJtCarnet(manipulaEstudiantes.getJtCarnet());
                        manipulaEstudiantes.setJtCorreo(manipulaEstudiantes.getJtCorreo());
                        manipulaEstudiantes.setJtNombre(manipulaEstudiantes.getJtNombre());
                        
                        JOptionPane.showMessageDialog(null,"Modificado correctamente");
                        
                        manipulaEstudiantes.limpiar();
                    }
                }
            break;
        }
    }
    
}
