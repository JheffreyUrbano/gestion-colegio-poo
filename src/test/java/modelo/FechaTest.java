
package modelo;

/**
 *
 * @author Jurbano
 */
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FechaTest {
    
    @Test // consulta fechas
    public void testConstructorYGetters(){
        Fecha fecha = new Fecha(28,10,2026);
        assertEquals(28, fecha.getDia());
        assertEquals(10, fecha.getMes());
        assertEquals(2026, fecha.getAnio());
    }
    
    @Test // Actualiza fechas
    public void testSetters(){
        Fecha fecha = new Fecha(1,1,2025);
        // Usamos los setters para actualizar
        fecha.setDia(31);
        fecha.setMes(12);
        fecha.setAnio(2026);
        
        assertEquals(31, fecha.getDia());
        assertEquals(12, fecha.getMes());
        assertEquals(2026, fecha.getAnio());
    }
    
    @Test // valida la fecha por dia, mes y anio
    public void testEsValida(){
        assertTrue(Fecha.esValida(28, 10, 2026)); //Entrega
        assertTrue(Fecha.esValida(29, 2, 2024)); // anio bisiesto valido
        assertFalse(Fecha.esValida(29, 2, 2025)); // anio No bisiesto no valido
        assertFalse(Fecha.esValida(32, 12, 2025)); // dia invalido
        assertFalse(Fecha.esValida(1, 13, 2025));  // mes invalido
        assertFalse(Fecha.esValida(1, 1, 2500)); // anio no valido
    }
    
    @Test // prueba si la fecha de hoy coincide con LocalDate.now()
    public void testHoy(){
        Fecha hoy = Fecha.hoy(); // metodo estatico
        LocalDate local = LocalDate.now();
        
        assertEquals(local.getDayOfMonth(), hoy.getDia());
        assertEquals(local.getMonthValue(), hoy.getMes());
        assertEquals(local.getYear(), hoy.getAnio());
    }
    
    @Test //fecha completa en String
    public void testToString(){
        Fecha fecha = new Fecha(6,6,2026);
        assertEquals("06/06/2026",fecha.toString());
    }
}
