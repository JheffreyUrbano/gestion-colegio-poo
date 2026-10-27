/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testGettersYSettersEstudiante() {
        Estudiante e = new Estudiante();
        e.setNombre("Valentina");
        e.setDireccion("Av Siempre Viva");
        e.setTelefono("3200000000");
        e.setFechaNacimiento(new Fecha(5, 3, 2003));
        e.setCodigo("001");
        e.setGrado("11");
        e.setPromedio(5.0);

        assertEquals("Valentina", e.getNombre());
        assertEquals("Av Siempre Viva", e.getDireccion());
        assertEquals("3200000000", e.getTelefono());
        assertEquals("001", e.getCodigo());
        assertEquals("11", e.getGrado());
        assertEquals(5.0, e.getPromedio(), 0.01);
    }

    @Test
    public void testToStringSobreescrito() {
        Estudiante e = new Estudiante();
        e.setNombre("Pedro Ruiz");
        e.setDireccion("Calle 1");
        e.setTelefono("3151112233");
        e.setFechaNacimiento(new Fecha(15, 6, 2012));
        e.setCodigo("002");
        e.setGrado("9");
        e.setPromedio(4.2);

        String resultado = e.toString();
        assertTrue(resultado.contains("[ESTUDIANTE]"));
        assertTrue(resultado.contains("002"));
        assertTrue(resultado.contains("9"));
        assertTrue(resultado.contains("Pedro Ruiz"));
    }
}
