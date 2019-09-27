package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMultiplicar {
    
    public TestMultiplicar() {
    }
    
    @Test
    public void testMultiplicar(){
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Multiplicar(2, 8)==16);
    }
}
