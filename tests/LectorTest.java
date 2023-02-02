import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LectorTest {
    
    public void testDecodeExpresion() {
        System.out.println("DecodeExpresion");
        String line = "3 3 3 3 3 *";
        Decoder instance = new Decoder();
        String expResult = "243";
        String result = instance.DecodeExpresion(line);
        assertEquals(expResult, result);
    }
    
}
