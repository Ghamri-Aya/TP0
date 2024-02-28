import org.example.Prime;
import org.junit.Test;
import static org.junit.Assert.*;
//testprime
public class TestPrime
{
    @Test
    public void IsTheNumberPrimeForNumbersPrimes() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
    }

    @Test
    public void IsTheNumberPrimeForNumbersNotPrimes() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(9));
    }

    @Test
    public void IsTheNumberPrimeForNegativeNumbers() {
        assertFalse(Prime.isPrime(-5));
        assertFalse(Prime.isPrime(-50));
    }

    @Test
    public void IsTheNumberPrimeForNumbersLessThanTwo() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }
}
