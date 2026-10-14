/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
public class Colegio {

    private String nombre;
    private Estudiante[] estudiantes;
    private Profesor[] profesores;
    private int cantidadEstudiantes;
    private int cantidadProfesores;

    // Único constructor
    public Colegio(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[100];
        this.profesores = new Profesor[50];
        this.cantidadEstudiantes = 0;
        this.cantidadProfesores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getCantidadProfesores() {
        return cantidadProfesores;
    }

    public void setCantidadProfesores(int cantidadProfesores) {
        this.cantidadProfesores = cantidadProfesores;
    }
    
    public boolean agregarEstudiante(Estudiante e) {
        if (e != null && cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = e;
            cantidadEstudiantes++;
            return true;
        }
        return false;
    }

    public boolean agregarProfesor(Profesor p) {
        if (p != null && cantidadProfesores < profesores.length) {
            profesores[cantidadProfesores] = p;
            cantidadProfesores++;
            return true;
        }
        return false;
    }
    
}
