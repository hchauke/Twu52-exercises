import exeption.NotRectangleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {


    @Test
    public void shouldPass() throws Exception {
        assertTrue(true);
    }

    @Test
    public void shouldReturnAreaOfARectangleAsTwenty() throws Exception {
        Rectangle rectangle = new Rectangle(5.00, 4.00);

        assertEquals(20.00, rectangle.returnArea(), 0);
    }

    @Test
    public void shouldReturnAreaOfARectangleAsThirtyTwoPointFive() throws Exception {
        Rectangle rectangle = new Rectangle(6.50, 5.00);

        assertEquals(32.50, rectangle.returnArea(), 0);
    }

    @Test
    public void testIfIsARectangle() throws Exception {
        Rectangle firstRectangle = new Rectangle(2.00, 4.00);
        Rectangle secondRectangle = new Rectangle(3.55, 5.55);

        assertTrue(firstRectangle.isRectangle());
        assertTrue(secondRectangle.isRectangle());
    }

    @Test
    public void testIfIsNotARectangle() throws Exception {
        Rectangle firstRectangle = new Rectangle(0.00, 5.00);
        Rectangle secondRectangle = new Rectangle(-2, 5);

        assertTrue(!firstRectangle.isRectangle());
        assertTrue(!secondRectangle.isRectangle());
    }

    @Test
    public void shouldThrowExceptionIfNotRectangle() throws NotRectangleException {
        try {

            Rectangle firstRectangle = new Rectangle(0.00, 3.00);
            Rectangle secondRectangle= new Rectangle(2.55, -5.55);

            assertEquals("Not a Rectangle", firstRectangle.returnArea());
            assertEquals("Not a Rectangle", secondRectangle.returnArea());

        } catch (NotRectangleException ex){

            ex.getMessage();
        }
    }
}
