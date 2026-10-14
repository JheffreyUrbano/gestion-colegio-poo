/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorColegio;
import javax.swing.JOptionPane;

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
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión Escolar - MVC");

        pestanas = new javax.swing.JTabbedPane();
        pnlEstudiante = new javax.swing.JPanel();
        pnlProfesor = new javax.swing.JPanel();
        pnlReportes = new javax.swing.JPanel();

        // estudiante
        pnlEstudiante.setLayout(new java.awt.GridLayout(8, 2, 8, 8));
        pnlEstudiante.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtNomEst = new javax.swing.JTextField();
        txtDirEst = new javax.swing.JTextField();
        txtTelEst = new javax.swing.JTextField();
        txtDiaEst = new javax.swing.JTextField(3);
        txtMesEst = new javax.swing.JTextField(3);
        txtAnioEst = new javax.swing.JTextField(5);
        txtCodEst = new javax.swing.JTextField();
        txtGradoEst = new javax.swing.JTextField();
        txtPromEst = new javax.swing.JTextField();
        btnGuardarEst = new javax.swing.JButton("Registrar Estudiante");

        javax.swing.JPanel pnlFechaEst = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 0));
        pnlFechaEst.add(new javax.swing.JLabel("Día:"));
        pnlFechaEst.add(txtDiaEst);
        pnlFechaEst.add(new javax.swing.JLabel("Mes:"));
        pnlFechaEst.add(txtMesEst);
        pnlFechaEst.add(new javax.swing.JLabel("Año:"));
        pnlFechaEst.add(txtAnioEst);

        pnlEstudiante.add(new javax.swing.JLabel("Nombre completo:"));
        pnlEstudiante.add(txtNomEst);
        pnlEstudiante.add(new javax.swing.JLabel("Dirección:"));
        pnlEstudiante.add(txtDirEst);
        pnlEstudiante.add(new javax.swing.JLabel("Teléfono:"));
        pnlEstudiante.add(txtTelEst);
        pnlEstudiante.add(new javax.swing.JLabel("Fecha de Nacimiento:"));
        pnlEstudiante.add(pnlFechaEst);
        pnlEstudiante.add(new javax.swing.JLabel("Código estudiantil:"));
        pnlEstudiante.add(txtCodEst);
        pnlEstudiante.add(new javax.swing.JLabel("Grado / Curso:"));
        pnlEstudiante.add(txtGradoEst);
        pnlEstudiante.add(new javax.swing.JLabel("Promedio (0.0 - 5.0):"));
        pnlEstudiante.add(txtPromEst);
        pnlEstudiante.add(new javax.swing.JLabel(""));
        pnlEstudiante.add(btnGuardarEst);

        btnGuardarEst.addActionListener(evt -> accionRegistrarEstudiante());

        
        // profesor
        pnlProfesor.setLayout(new java.awt.GridLayout(9, 2, 8, 8));
        pnlProfesor.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        txtNomProf = new javax.swing.JTextField();
        txtDirProf = new javax.swing.JTextField();
        txtTelProf = new javax.swing.JTextField();
        txtDiaProf = new javax.swing.JTextField(3);
        txtMesProf = new javax.swing.JTextField(3);
        txtAnioProf = new javax.swing.JTextField(5);
        txtCedProf = new javax.swing.JTextField();
        txtAreaProf = new javax.swing.JTextField();
        txtSalHoraProf = new javax.swing.JTextField();
        txtHorasProf = new javax.swing.JTextField();
        btnGuardarProf = new javax.swing.JButton("Registrar Profesor");

        javax.swing.JPanel pnlFechaProf = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 0));
        pnlFechaProf.add(new javax.swing.JLabel("Día:"));
        pnlFechaProf.add(txtDiaProf);
        pnlFechaProf.add(new javax.swing.JLabel("Mes:"));
        pnlFechaProf.add(txtMesProf);
        pnlFechaProf.add(new javax.swing.JLabel("Año:"));
        pnlFechaProf.add(txtAnioProf);

        pnlProfesor.add(new javax.swing.JLabel("Nombre completo:"));
        pnlProfesor.add(txtNomProf);
        pnlProfesor.add(new javax.swing.JLabel("Dirección:"));
        pnlProfesor.add(txtDirProf);
        pnlProfesor.add(new javax.swing.JLabel("Teléfono:"));
        pnlProfesor.add(txtTelProf);
        pnlProfesor.add(new javax.swing.JLabel("Fecha de Nacimiento:"));
        pnlProfesor.add(pnlFechaProf);
        pnlProfesor.add(new javax.swing.JLabel("Cédula (Mayor de edad):"));
        pnlProfesor.add(txtCedProf);
        pnlProfesor.add(new javax.swing.JLabel("Área de trabajo:"));
        pnlProfesor.add(txtAreaProf);
        pnlProfesor.add(new javax.swing.JLabel("Salario por Hora ($):"));
        pnlProfesor.add(txtSalHoraProf);
        pnlProfesor.add(new javax.swing.JLabel("Horas dictadas en el mes:"));
        pnlProfesor.add(txtHorasProf);
        pnlProfesor.add(new javax.swing.JLabel(""));
        pnlProfesor.add(btnGuardarProf);

        btnGuardarProf.addActionListener(evt -> accionRegistrarProfesor());
    }
    
    
    // registar
    private void accionRegistrarEstudiante() {
        try {
            String nombre = txtNomEst.getText().trim();
            String dir = txtDirEst.getText().trim();
            String tel = txtTelEst.getText().trim();
            int dia = Integer.parseInt(txtDiaEst.getText().trim());
            int mes = Integer.parseInt(txtMesEst.getText().trim());
            int anio = Integer.parseInt(txtAnioEst.getText().trim());
            String cod = txtCodEst.getText().trim();
            String grado = txtGradoEst.getText().trim();
            double prom = Double.parseDouble(txtPromEst.getText().trim());

            String respuesta = controlador.registrarEstudiante(nombre, dir, tel, dia, mes, anio, cod, grado, prom);
            JOptionPane.showMessageDialog(this, respuesta);

            if (respuesta.startsWith("Estudiante registrado")) {
                txtNomEst.setText("");
                txtDirEst.setText("");
                txtTelEst.setText("");
                txtDiaEst.setText("");
                txtMesEst.setText("");
                txtAnioEst.setText("");
                txtCodEst.setText("");
                txtGradoEst.setText("");
                txtPromEst.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que la fecha y el promedio sean valores numéricos.");
        }
    }
    
    private void accionRegistrarProfesor() {
        try {
            String nombre = txtNomProf.getText().trim();
            String dir = txtDirProf.getText().trim();
            String tel = txtTelProf.getText().trim();
            int dia = Integer.parseInt(txtDiaProf.getText().trim());
            int mes = Integer.parseInt(txtMesProf.getText().trim());
            int anio = Integer.parseInt(txtAnioProf.getText().trim());
            String cedula = txtCedProf.getText().trim();
            String area = txtAreaProf.getText().trim();
            double salHora = Double.parseDouble(txtSalHoraProf.getText().trim());
            int horas = Integer.parseInt(txtHorasProf.getText().trim());

            String respuesta = controlador.registrarProfesor(nombre, dir, tel, dia, mes, anio, cedula, area, salHora, horas);
            JOptionPane.showMessageDialog(this, respuesta);

            if (respuesta.startsWith("Profesor registrado")) {
                txtNomProf.setText("");
                txtDirProf.setText("");
                txtTelProf.setText("");
                txtDiaProf.setText("");
                txtMesProf.setText("");
                txtAnioProf.setText("");
                txtCedProf.setText("");
                txtAreaProf.setText("");
                txtSalHoraProf.setText("");
                txtHorasProf.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que fecha, salario por hora y horas dictadas sean numéricos.");
        }
    }
    
}
