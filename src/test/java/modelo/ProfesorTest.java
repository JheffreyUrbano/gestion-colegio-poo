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

public class ProfesorTest {

    @Test
    public void testConstructorYGetters() {
        Fecha fn = new Fecha(20, 8, 1985);
        Profesor prof = new Profesor("Edwin Gallego", "Calle 25 #105-85", "3105556677", fn,
                "1144000111", "Programacion", 50000.0, 40);

        assertEquals("Edwin Gallego", prof.getNombre());
        assertEquals("Calle 25 #105-85", prof.getDireccion());
        assertEquals("3105556677", prof.getTelefono());
        assertEquals(fn, prof.getFechaNacimiento());
        assertEquals("1144000111", prof.getCedula());
        assertEquals("Programacion", prof.getArea());
        assertEquals(50000.0, prof.getSalarioHora(), 0.01);
        assertEquals(40, prof.getHorasDictadas());
    }

    @Test
    public void testSetters() {
        Profesor prof = new Profesor("A", "B", "C", new Fecha(1, 1, 1980), "1", "Area", 1000.0, 10);
        prof.setCedula("999999");
        prof.setArea("Fisica");
        prof.setSalarioHora(60000.0);
        prof.setHorasDictadas(30);

        assertEquals("999999", prof.getCedula());
        assertEquals("Fisica", prof.getArea());
        assertEquals(60000.0, prof.getSalarioHora(), 0.01);
        assertEquals(30, prof.getHorasDictadas());
    }

    @Test
    public void testCalcularPagoSinParametrosYConParametros() {
        // salario base 50,000 * 40 = 2,000,000. Con +30% preparación = 2,600,000
        Profesor prof = new Profesor("Mario Wilson Castro", "Calle 8", "310", new Fecha(1, 1, 1980),
                "1144", "Sistemas", 50000.0, 40);

        assertEquals(2600000.0, prof.calcularPago(), 0.01);

        // sobrecarga con 20 horas: (50,000 * 20) * 1.30 = 1,300,000
        assertEquals(1300000.0, prof.calcularPago(20), 0.01);
    }

    @Test
    public void testCalcularPrestaciones() {
        // pago total 2,600,000. Prestaciones (19%): 2,600,000 * 0.19 = 494,000
        Profesor prof = new Profesor("Mario Wilson Castro", "Calle 8", "310", new Fecha(1, 1, 1980),
                "1144", "Sistemas", 50000.0, 40);

        assertEquals(494000.0, prof.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testToStringSobreescrito() {
        Profesor prof = new Profesor("Maria Camila", "Av 3", "300", new Fecha(10, 10, 1982),
                "223344", "Algebra Lineal", 40000.0, 20);
        String texto = prof.toString();

        assertTrue(texto.contains("[PROFESOR]"));
        assertTrue(texto.contains("223344"));
        assertTrue(texto.contains("Algebra Lineal"));
        assertTrue(texto.contains("Maria Camila"));
    }
}
