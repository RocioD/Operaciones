package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {
    
    public TestRestar() {
    }
    
    @Test
    public void testRestar(){
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Restar(7, 2)==5);
    }
}
