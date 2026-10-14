/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestion.colegio.poo;

/**
 *
 * @author Jurbano
 */

import controlador.ControladorColegio;
import modelo.Colegio;
import vista.VistaColegio;

public class GestionColegioPoo {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(()->{
            Colegio colegio = new Colegio("Colegio Urbano");
            ControladorColegio controlador = new ControladorColegio(colegio);
            VistaColegio vista = new VistaColegio();
            vista.setControlador(controlador);
            vista.setVisible(true);
        });
    }
}
