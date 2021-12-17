public class Circle {
    private int horizontalPosition;
    private int verticalPosition;
    private int diameter;

    public Circle() {}

    public Circle(int horizontalPosition, int verticalPosition, int diameter) {
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
        this.diameter = diameter;
    }

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    public void setHorizontalPosition(int horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    public int getVerticalPosition() {
        return verticalPosition;
    }

    public void setVerticalPosition(int verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
