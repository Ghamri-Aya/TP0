import org.example.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestFibonacci
{
    @Test
    public void ExceptionIfNumberGivenIsLessThanZero(){
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    public void RetrunZeroIfTheNumberGivenIsZero (){
        assertEquals(0, Fibonacci.fibonacci(0));

    }

    @Test
    public void RetrunOneIfTheNumberGivenIsOne (){
        assertEquals(1, Fibonacci.fibonacci(1));

    }

    @Test
    public void CalcSuiteOfFibIfNumberIsGratterThanOne(){
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));

    }

}
