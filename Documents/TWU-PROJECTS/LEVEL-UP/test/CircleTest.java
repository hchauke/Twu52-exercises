import exeption.NotACircleException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircleTest {

    @Test
    public void shouldReturnAreaIfRadiusIsOne() throws NotACircleException {
        Circle circle = new Circle(1);

        assertEquals(3.14, circle.returnArea(), 0);
    }

    @Test
    public void shouldReturnAreaIfRadiusIsTwo() throws NotACircleException {
        Circle circle = new Circle(2);

        assertEquals(12.57, circle.returnArea(), 0);
    }

    @Test
    public void testIfRadiusIsGreaterThanZero() throws Exception {
        Circle firstCircle = new Circle(2);
        assertTrue(firstCircle.isARadius());
    }

    @Test
    public void testIsRadius() throws Exception {
        Circle firstCircle = new Circle(1);
        Circle secondCircle = new Circle(2.5);

        assertTrue(firstCircle.isARadius());
        assertTrue(secondCircle.isARadius());

    }

    @Test
    public void testIsNotARadius() throws Exception {
        Circle firstCircle = new Circle(0);
        Circle secondCircle = new Circle(-3);

        assertTrue(!firstCircle.isARadius());
        assertTrue(!secondCircle.isARadius());
    }

    @Test
    public void testShouldReturnDiameterForRadiusIsTwo() throws NotACircleException {
        Circle firstCircle = new Circle(1.00);
        Circle secondCircle = new Circle(2.55);

        assertEquals(6.28, firstCircle.returnDiameter(), 0);
        assertEquals(40.86, secondCircle.returnDiameter(), 0);
    }


    @Test
    public void shouldThrowExceptionIfNotACircle() throws NotACircleException {
        try {

            Circle firstCircle = new Circle(0);
            Circle secondCircle = new Circle(-3);

            assertEquals("Not a Circle", firstCircle.returnArea());
            assertEquals("Not a Circle", secondCircle.returnArea());

            assertEquals("Not a Circle", firstCircle.returnDiameter());
            assertEquals("Not a Circle", secondCircle.returnDiameter());

        }catch (NotACircleException ex){

            ex.getMessage();
        }
    }
}
