import exeption.NotACircleException;

import java.text.DecimalFormat;

public class Circle implements Shape {

    private final double radius;
    private final DecimalFormat formater = new DecimalFormat("#.##");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double returnArea() throws NotACircleException {

        if (!isARadius()) {
            throw new NotACircleException("Not a Circle");

        } else {
            return Double.parseDouble(formater.format((Math.PI) * (radius * radius)));
        }
    }

    public double returnDiameter() throws NotACircleException {
        if (!isARadius()) {
            throw new NotACircleException("Not a circle");

        } else {

            return Double.parseDouble(formater.format((2 * Math.PI) * (radius * radius)));
        }
    }

    public boolean isARadius() {
        return radius > 0 ? true : false;
    }


}
