/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasDictadas;
    private final double PORC_PREPARACION = 0.30;
    private final double PORC_PRESTACIONES = 0.19;

    // unica subclase que solicita datos por constructor
    public Profesor(String nombre, String direccion, String telefono, Fecha fechaNacimiento,
            String cedula, String area, double salarioHora, int horasDictadas) {
        super();
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasDictadas = horasDictadas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    // Sobrecarga que calcula el pago usando las horasDictadas del atributo
    public double calcularPago() {
        return calcularPago(this.horasDictadas);
    }

    // Sobrecarga que calcula el pago recibiendo las horas por parámetro (+30% preparación)
    public double calcularPago(int horasDictadas) {
        double salarioBase = this.salarioHora * horasDictadas;
        return salarioBase + (salarioBase * PORC_PREPARACION);
    }

    // Prestaciones sociales: 19% del pago total mensual
    public double calcularPrestaciones() {
        return calcularPago() * PORC_PRESTACIONES;
    }

    // Sobreescritura de método (Polimorfismo)
    @Override
    public String toString() {
        return "[PROFESOR] Cédula: " + cedula
                + " | Área: " + area
                + " | " + super.toString()
                + String.format(" | Pago Total: $%,.2f | Prestaciones (19%%): $%,.2f",
                        calcularPago(), calcularPrestaciones());
    }
}