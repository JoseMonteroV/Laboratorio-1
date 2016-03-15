/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    
    public Controlador_Mantenimiento_Estudiante(ManipulaEstudiantes manipulaEstudiantes) {
        this.manipulaEstudiantes = manipulaEstudiantes;       
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.manipulaEstudiantes.get_codigo_por_fuente(ae.getSource());
        
        switch(codigo)
        {
            case AGREGAR:
            case ELIMINAR:
            case BUSCAR:
            case MODIFICAR:
        }
    }
    
}
