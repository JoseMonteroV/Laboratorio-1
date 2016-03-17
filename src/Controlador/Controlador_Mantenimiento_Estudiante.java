/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArrayEstudiante;
import Modelo.Estudiante;
import Vista.ManipulaEstudiantes;
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
    
    private String carnet, correo, nombre;
    
    private ManipulaEstudiantes manipulaEstudiantes;
    private Estudiante estudiante;
    private ArrayEstudiante arrayEstudiante;
    
    public Controlador_Mantenimiento_Estudiante(ManipulaEstudiantes manipulaEstudiantes) {
        this.manipulaEstudiantes = manipulaEstudiantes;       
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.manipulaEstudiantes.get_codigo_por_fuente(ae.getSource());
        
        switch(codigo)
        {
            case AGREGAR:
                carnet = jtCarnet.getText();
                correo = jtCorreo.getText();
                nombre = jtNombre.getText();
                
                estudiante = new Estudiante(carnet, nombre, correo);
                arrayEstudiante = new ArrayEstudiante();
                arrayEstudiante.agregarEstudiante(estudiante);
                
            case ELIMINAR:
                if(!jtCarnet.getText().equals(""))
                {
                        arrayEstudiante.eliminarEstudiante(jtCarnet.getText());
                }
                else
                {
                        JOptionPane.showMessageDialog(null,"Digite un Carnet");
                }
                
            case BUSCAR:
                if(!jtCarnet.getText().equals(""))
                {
                    arrayEstudiante.buscarEstudiante(jtCarnet.getText());
                    if(arrayEstudiante.buscarEstudiante(jtCarnet.getText()) != false)
                    {
                            jtCarnet.setText(estudiante.getCarnet());
                            jtCorreo.setText(estudiante.getCorreo());
                            jtNombre.setText(estudiante.getNombre());
                            
                    }
                    else
                    {
                            JOptionPane.showMessageDialog(null,"El estudiante no se encuentra");
                    }
                }
                else
                {
                        JOptionPane.showMessageDialog(null,"Digite un carnet");
                }
            case MODIFICAR:
        }
    }
    
}
