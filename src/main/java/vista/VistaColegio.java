/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Jurbano
 */
import controlador.ControladorColegio;
import javax.swing.JOptionPane;

public class VistaColegio extends javax.swing.JFrame {
    
    private ControladorColegio controlador;
    
    // Variables de los componentes Swing
    private javax.swing.JTabbedPane pestanas;
    private javax.swing.JPanel pnlEstudiante;
    private javax.swing.JPanel pnlProfesor;
    private javax.swing.JPanel pnlReportes;

    // Campos Estudiante
    private javax.swing.JTextField txtNomEst, txtDirEst, txtTelEst;
    private javax.swing.JTextField txtDiaEst, txtMesEst, txtAnioEst;
    private javax.swing.JTextField txtCodEst, txtGradoEst, txtPromEst;
    private javax.swing.JButton btnGuardarEst;

    // Campos Profesor
    private javax.swing.JTextField txtNomProf, txtDirProf, txtTelProf;
    private javax.swing.JTextField txtDiaProf, txtMesProf, txtAnioProf;
    private javax.swing.JTextField txtCedProf, txtAreaProf, txtSalHoraProf, txtHorasProf;
    private javax.swing.JButton btnGuardarProf;

    // Componentes Reportes
    private javax.swing.JButton btnRepEstudiantes, btnRepProfesores;
    private javax.swing.JTextArea txtAreaReportes;
    private javax.swing.JScrollPane scrollReportes;
    
    // contrsuctor
    public VistaColegio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public ControladorColegio getControlador() {
        return controlador;
    }

    public void setControlador(ControladorColegio controlador) {
        this.controlador = controlador;
    }
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
