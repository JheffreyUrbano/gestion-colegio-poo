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

public class PersonaTest {

    @Test
    public void testGettersYSetters() {
        Persona p = new Persona();
        Fecha fn = new Fecha(26, 3, 1986);

        p.setNombre("Edwin Gallego");
        p.setDireccion("Calle 25 #115-85"); //direccion uao
        p.setTelefono("1234567890");
        p.setFechaNacimiento(fn);

        assertEquals("Edwin Gallego", p.getNombre());
        assertEquals("Calle 25 #115-85", p.getDireccion());
        assertEquals("1234567890", p.getTelefono());
        assertEquals(fn, p.getFechaNacimiento());
    }

    @Test //evalua si se calcula bien las edades
          //antes y después del cumplea anios
    public void testCalcularEdadConReferencia() {
        Persona p = new Persona();
        p.setFechaNacimiento(new Fecha(25, 11, 2002));

        // antes de cumplir anios en 2026
        Fecha refAntes = new Fecha(20, 10, 2026);
        assertEquals(23, p.calcularEdad(refAntes));

        // despues de cumplir anios en 2026
        Fecha refDespues = new Fecha(1, 12, 2026);
        assertEquals(24, p.calcularEdad(refDespues));
    }

    @Test // edad de la persona a día de hoy
    public void testCalcularEdadActual() {
        Persona p = new Persona();
        Fecha hoy = Fecha.hoy();
        p.setFechaNacimiento(new Fecha(hoy.getDia(), hoy.getMes(), hoy.getAnio() - 20)); //nace en 2006
        assertEquals(20, p.calcularEdad()); //20 años, 2026-20=2006
    }

    @Test //info de persona a String
    public void testToString() {
        Persona p = new Persona();
        p.setNombre("Jheffrey Urbano");
        p.setDireccion("Cra 40b");
        p.setTelefono("3180000000");
        p.setFechaNacimiento(new Fecha(25, 11, 2002));

        String texto = p.toString();
        assertTrue(texto.contains("Jheffrey Urbano"));
        assertTrue(texto.contains("Cra 40b"));
        assertTrue(texto.contains("25/11/2002"));
    }
}
