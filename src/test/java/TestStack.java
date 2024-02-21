import org.example.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestStack
{
    @Test
    public void PushShouldAddElementToTheTopOfTheStack() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    public void PushShouldExpandArrayIfStackIsFull() {
        Stack stack = new Stack();
        for (int i=0;i<10;i++)
        {
            stack.push(i);
        }
        assertEquals(10,stack.size());
        stack.push(10);
        assertEquals(11,stack.size());
        assertEquals(10,stack.peek());
    }


    @Test
    public void DoesThePopedElementMatchsWithTheElementGiven() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(5, stack.pop());
    }


    @Test
    public void ExceptionIfTheStackIsEmptyAndWePopAnElement() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }


    @Test
    public void DoesThePickedElementMatchsWithTheElementGiven() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(5, stack.peek());
    }


   /* @Test
    public void ExceptionIfTheStackIsNotEmptyAfterPickingElement() {
        Stack stack = new Stack();
        stack.push(5);

        //assertThrows()

    }*/

    @Test
    public void ReturnTrueIfStackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void ReturnFalseIfStackIsEmpty() {
        Stack stack = new Stack();
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void VerifyTheSizeOfTheStack() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());
        stack.push(5);
        assertEquals(1, stack.size());
    }

}
