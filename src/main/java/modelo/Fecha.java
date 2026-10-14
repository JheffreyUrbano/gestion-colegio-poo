/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
import java.time.LocalDate;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    // Único constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    public static boolean esValida(int dia, int mes, int anio) {
        if (anio < 1920 || anio > LocalDate.now().getYear()) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            diasPorMes[1] = 29;
        }
        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    public static Fecha hoy() {
        LocalDate actual = LocalDate.now();
        return new Fecha(actual.getDayOfMonth(), actual.getMonthValue(), actual.getYear());
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
    
}