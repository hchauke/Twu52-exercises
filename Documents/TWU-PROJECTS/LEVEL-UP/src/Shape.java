import exeption.NotACircleException;
import exeption.NotRectangleException;
import exeption.NotSquareException;

public interface Shape {

    double returnArea() throws NotSquareException, NotACircleException, NotRectangleException;
}
