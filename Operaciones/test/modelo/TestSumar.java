package modelo;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSumar {

    public TestSumar() {
    }
    
    @Test
    public void testSumar(){
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Sumar(2, 8)==10);
    }
    
}
