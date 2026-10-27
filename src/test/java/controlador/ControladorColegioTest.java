
package controlador;

/**
 *
 * @author Jurbano
 */
import modelo.Colegio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorColegioTest {
    
    @Test
    public void testGetYSetColegio(){
        Colegio c1 = new Colegio("Colegio 1");
        ControladorColegio ctrl = new ControladorColegio(c1);
        assertEquals(c1, ctrl.getColegio());
        
        Colegio c2 = new Colegio("Colegio 2");
        ctrl.setColegio(c2);
        assertEquals(c2, ctrl.getColegio());
    }
    
    @Test
    public void testRegistrarEstudianteExitosoYValidar(){
        Colegio col = new Colegio("Colegio Test");
        ControladorColegio ctrl = new ControladorColegio(col);
        
        // registro exitoso
        String resOk = ctrl.registrarEstudiante("Jheffrey Urbano", "Cra 40b", 
                                                "318", 25, 11, 2002, "001", "11", 4.5);
        assertEquals("Estudiante registrado exitosamente.", resOk);
        
        // validar campos vacios (sin nombre)
        String resVacio = ctrl.registrarEstudiante("", "calle 10", "300", 1, 1, 2000, "002", "11", 4.0);
        assertTrue(resVacio.startsWith("Error:"));
        
        // validar promedio (maximo 5.0)
        String resProm = ctrl.registrarEstudiante("Camila", "Calle 10", "300", 15, 5, 2010, "C01", "9B", 6.0);
        assertTrue(resProm.startsWith("Error:"));
    }
    
    @Test
    public void testRegistrarProfesorExitosoYMenorDeEdad() {
        Colegio col = new Colegio("Colegio Test");
        ControladorColegio ctrl = new ControladorColegio(col);

        // profesor mayor de edad (nacido en 1985)
        String resOk = ctrl.registrarProfesor("Roberto", "Cra 5", "310", 10, 3, 1985, "100200", "Calculo", 50000.0, 30);
        assertEquals("Profesor registrado exitosamente.", resOk);

        // profesor menor de edad (nacido en 2015) debe rechazarlo
        String resMenor = ctrl.registrarProfesor("Joven", "Cra 5", "310", 10, 3, 2015, "999", "Calculo", 50000.0, 30);
        assertTrue(resMenor.contains("mayor de edad"));
    }
    
    @Test
    public void testObtenerReportesDesdeControlador() {
        Colegio col = new Colegio("Colegio Test");
        ControladorColegio ctrl = new ControladorColegio(col);

        ctrl.registrarEstudiante("Sofia", "Dir", "300", 10, 10, 2011, "099", "8A", 4.0);
        ctrl.registrarProfesor("Andres", "Dir", "311", 10, 10, 1980, "12345", "Ingles", 45000.0, 20);

        assertTrue(ctrl.obtenerReporteEstudiantes().contains("Sofia"));
        assertTrue(ctrl.obtenerReporteProfesores().contains("Andres"));
    }
    
}
