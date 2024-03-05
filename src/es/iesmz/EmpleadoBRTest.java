package es.iesmz;
import org.junit.jupiter.api.Test;
import static es.iesmz.EmpleadoBR.calcularSalarioBruto;
import static es.iesmz.EmpleadoBR.calcularSalarioNeto;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpleadoBRTest {

   @Test
    public void testCalculaSalarioNeto2000to1640() {
        assertEquals(1640, calcularSalarioNeto(2000) , 0.01);
    }

    @Test
    public void testCalculaSalarioNeto1500to1230() {
        assertEquals(1230, calcularSalarioNeto(1500) , 0.01);
    }


    @Test
    public void testCalculaSalarioNeto1499con99to1259con9916() {
        assertEquals(1259.9916, calcularSalarioNeto(1499.99f) , 0.01);
    }

    @Test
    public void testCalculaSalarioNeto1000to840() {
        assertEquals(840, calcularSalarioNeto(1000) , 0.01);
    }

    @Test
    public void testCalculaSalarioNeto999con99to999con999() {
        assertEquals(999.99f, calcularSalarioNeto(999.99f) , 0.01);
    }

    @Test
    public void testCalculaSalarioNeto500to500() {
        assertEquals(500, calcularSalarioNeto(500) , 0.01);
    }

    @Test
    public void testCalculaSalarioNeto0to0() {
        assertEquals(0, calcularSalarioNeto(0) , 0.01);
    }

    @Test
    public void testCalculaSalarioNetoMenos1toMenos1() {
        assertEquals(-1, calcularSalarioNeto(-1) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoV1() {
        assertEquals(1360, calcularSalarioBruto(TipoEmpleado.venedor, 2000, 8) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoV2() {
        assertEquals(1260, calcularSalarioBruto(TipoEmpleado.venedor, 1500, 3) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoV3() {
        assertEquals(1100, calcularSalarioBruto(TipoEmpleado.venedor, 1499.99f, 0) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE1() {
        assertEquals(1760, calcularSalarioBruto(TipoEmpleado.encarregat, 1250, 8) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE2() {
        assertEquals(1600, calcularSalarioBruto(TipoEmpleado.encarregat, 1000, 0) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE3() {
        assertEquals(1560, calcularSalarioBruto(TipoEmpleado.encarregat, 999.99f, 3) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE4() {
        assertEquals(1500, calcularSalarioBruto(TipoEmpleado.encarregat, 500, 0) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE5() {
        assertEquals(1660, calcularSalarioBruto(TipoEmpleado.encarregat, 0, 8) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE6() {
        assertEquals(-1, calcularSalarioBruto(TipoEmpleado.encarregat, -1, 8) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE7() {
        assertEquals(-1, calcularSalarioBruto(TipoEmpleado.encarregat, 1500, -1) , 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoE8() {
        assertEquals(-1, calcularSalarioBruto(null, 1500, 8) , 0.01);
    }

}
