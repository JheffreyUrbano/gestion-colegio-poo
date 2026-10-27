
package modelo;

/**
 *
 * @author Jurbano
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColegioTest {

    @Test
    public void testConstructorYGettersSetters() {
        Colegio col = new Colegio("Colegio Cali");
        assertEquals("Colegio Cali", col.getNombre());
        assertEquals(0, col.getCantidadEstudiantes());
        assertEquals(0, col.getCantidadProfesores());
        assertNotNull(col.getEstudiantes());
        assertNotNull(col.getProfesores());

        col.setNombre("Colegio UAO");
        col.setEstudiantes(new Estudiante[10]);
        col.setProfesores(new Profesor[10]);
        col.setCantidadEstudiantes(2);
        col.setCantidadProfesores(3);

        assertEquals("Colegio UAO", col.getNombre());
        assertEquals(10, col.getEstudiantes().length);
        assertEquals(10, col.getProfesores().length);
        assertEquals(2, col.getCantidadEstudiantes());
        assertEquals(3, col.getCantidadProfesores());
    }

    @Test
    public void testAgregarYReporteEstudiantes() {
        Colegio col = new Colegio("Colegio Cali");
        Estudiante e = new Estudiante();
        e.setNombre("Juanito");
        e.setCodigo("001");
        e.setGrado("11A");
        e.setPromedio(4.8);
        e.setFechaNacimiento(new Fecha(1, 1, 2009));

        assertTrue(col.agregarEstudiante(e));
        assertEquals(1, col.getCantidadEstudiantes());

        String reporte = col.reporteEstudiantes();
        assertTrue(reporte.contains("Juanito"));
        assertTrue(reporte.contains("001"));
    }

    @Test
    public void testAgregarYReporteProfesoresOrdenadosPorSalario() {
        Colegio col = new Colegio("Colegio Cali");

        // profesor 1 con menor salario (40,000 * 10 * 1.30 = 520,000)
        Profesor pMenor = new Profesor("Prof Menor", "Dir1", "111", new Fecha(1, 1, 1980),
                "CED1", "Arte", 40000.0, 10);

        // profesor 2 con mayor salario (60,000 * 40 * 1.30 = 3,120,000)
        Profesor pMayor = new Profesor("Prof Mayor", "Dir2", "222", new Fecha(1, 1, 1980),
                "CED2", "Sistemas", 60000.0, 40);

        assertTrue(col.agregarProfesor(pMenor));
        assertTrue(col.agregarProfesor(pMayor));
        assertEquals(2, col.getCantidadProfesores());

        String reporte = col.reporteProfesores();

        // verifica que Prof Mayor aparezca antes que Prof Menor en el reporte (orden descendente)
        int posMayor = reporte.indexOf("Prof Mayor");
        int posMenor = reporte.indexOf("Prof Menor");
        assertTrue(posMayor < posMenor);
        assertTrue(reporte.contains("TOTAL PRESTACIONES SOCIALES"));
    }
}
