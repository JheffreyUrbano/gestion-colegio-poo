/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Jurbano
 */
import controlador.ControladorColegio;
import modelo.Colegio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VistaColegioTest {

    @Test
    public void testConstructorVista() {
        VistaColegio vista = new VistaColegio();
        assertNotNull(vista);
        assertEquals("Sistema de Gestión Escolar - MVC", vista.getTitle());
    }

    @Test
    public void testGetYSetControlador() {
        VistaColegio vista = new VistaColegio();
        Colegio colegio = new Colegio("Colegio Cali");
        ControladorColegio controlador = new ControladorColegio(colegio);

        // Probamos setControlador y getControlador
        vista.setControlador(controlador);
        assertEquals(controlador, vista.getControlador());
    }
}