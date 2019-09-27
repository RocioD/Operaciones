package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestDividir {
    
    public TestDividir() {
    }
    
    @Test
    public void testDividir(){
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Dividir(8, 2)==4);
    }
}
