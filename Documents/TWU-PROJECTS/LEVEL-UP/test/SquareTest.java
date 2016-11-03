import exeption.NotSquareException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnAreaOfASquareAsFour() throws Exception {
        Square square = new Square(2.0, 2.0);
        Assert.assertEquals(4.0, square.returnArea(), 0);
    }

    @Test
    public void shouldReturnAreaOfASquareAsSixPointTwentyFive() throws Exception {
        Square square = new Square(2.5, 2.5);
        assertEquals(6.25, square.returnArea(), 0);

    }

    @Test
    public void shouldThrowExceptionIfNotSquare() throws NotSquareException {
       try {

           Square square = new Square(2.0, 3.0);
           Assert.assertEquals("Not a Square", square.returnArea());

       } catch (NotSquareException ex){

           ex.getMessage();
       }
    }

    @Test
    public void isSquare() throws Exception {
        Square firstSquare = new Square(2.0, 2.0);
        Square secondSquare = new Square(4.0, 4.0);

        Assert.assertTrue(firstSquare.isSquare());
        Assert.assertTrue(secondSquare.isSquare());
    }

    @Test
    public void isNotASquare() throws Exception {
        Square firstSquare = new Square(-2.0, 2.0);
        Square secondSquare = new Square(0.0, 4.0);

        Assert.assertTrue(!firstSquare.isSquare());
        Assert.assertTrue(!secondSquare.isSquare());
    }

}
