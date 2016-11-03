import exeption.NotRectangleException;

import java.text.DecimalFormat;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    private final DecimalFormat formater = new DecimalFormat("#.##");

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double returnArea() throws NotRectangleException {
        if (!isRectangle()){
            throw new NotRectangleException("Not a Rectangle");

        } else {
            return Double.parseDouble(formater.format(width * height));
        }
    }


    public boolean isRectangle() {
        return width > 0.0 && height > 0.0 ? true : false;
    }
}
