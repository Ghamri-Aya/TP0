import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPerson
{
    @Test void testGetFullName()
    {
        Person person = new Person("Aya", "Ghamri", 21);
        assertEquals("Aya Ghamri", person.getFullName());
    }

    @Test
    void testIsAdult()
    {
        Person adultPerson = new Person("Amine", "Ghamri", 28);
        assertTrue(adultPerson.isAdult());
    }

    @Test
    void testIsNotAdult()
    {
        Person notAdultPerson = new Person("Aya", "Ghamri", 17);
        assertFalse(notAdultPerson.isAdult());
    }
}

