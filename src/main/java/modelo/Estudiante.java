/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
public class Estudiante extends Persona {

    private String codigo;
    private String grado;
    private double promedio;

    // contructor con getters
    public Estudiante() {
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Sobreescritura a la super Persona
    @Override
    public String toString() {
        return "[ESTUDIANTE] Código: " + codigo
                + " | Grado: " + grado
                + " | Promedio: " + String.format("%.2f", promedio)
                + " | " + super.toString();
    }
}
