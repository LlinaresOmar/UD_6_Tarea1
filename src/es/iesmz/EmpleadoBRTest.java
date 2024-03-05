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
}
