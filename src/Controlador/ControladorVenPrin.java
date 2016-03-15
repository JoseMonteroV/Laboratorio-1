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
public class ControladorVenPrin implements ActionListener {

    private ManipulaEstudiantes manipulaEstudiantes;

    public ControladorVenPrin() {
        this.manipulaEstudiantes = new ManipulaEstudiantes();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        else
        {
            if(e.getActionCommand().equals("Manipular Estudiante"))
            {
                this.manipulaEstudiantes.setVisible(true);
            }
        }
        
    }
    
    
}
