import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperatorTest {
 
    @Test
    public void testAdd() {
        System.out.println("add");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "8";
        String result = instance.add(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuit() {
        System.out.println("quit");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "2";
        String result = instance.quit(num);
        assertEquals(expResult, result);      
    }

    @Test
    public void testDiv() {
        System.out.println("div");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(6);
        Operator instance = new Operator();
        String expResult = "3";
        String result = instance.div(num);
        assertEquals(expResult, result);        
    }

    @Test
    public void testMulti() {
        System.out.println("multi");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "15";
        String result = instance.multi(num);
        assertEquals(expResult, result);       
    }
    
}
