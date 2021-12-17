import processing.core.PApplet;

public class Main extends PApplet{

    private Window window;
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Circle circle4;

    public Main() {
        window = new Window();
        window.setWidth(1500);
        window.setHeight(500);

        circle1 = new Circle();
        circle2 = new Circle();
        circle3 = new Circle();
        circle4 = new Circle();

        circle1.setHorizontalPosition(50);
        circle1.setVerticalPosition(100);
        circle1.setDiameter(20);

        circle2.setHorizontalPosition(50);
        circle2.setVerticalPosition(200);
        circle2.setDiameter(20);

        circle3.setHorizontalPosition(50);
        circle3.setVerticalPosition(300);
        circle3.setDiameter(20);

        circle4.setHorizontalPosition(50);
        circle4.setVerticalPosition(400);
        circle4.setDiameter(20);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(window.getWidth(),window.getHeight());
    }

    @Override
    public void draw() {

        ellipse(circle1.getHorizontalPosition(),circle1.getVerticalPosition(),circle1.getDiameter(),circle1.getDiameter());
        ellipse(circle2.getHorizontalPosition(),circle2.getVerticalPosition(),circle2.getDiameter(),circle2.getDiameter());
        ellipse(circle3.getHorizontalPosition(),circle3.getVerticalPosition(),circle3.getDiameter(),circle3.getDiameter());
        ellipse(circle4.getHorizontalPosition(),circle4.getVerticalPosition(),circle4.getDiameter(),circle4.getDiameter());

        changeCircleHorizontalPosition();
    }

    public void changeCircleHorizontalPosition(){
        circle1.setHorizontalPosition(circle1.getHorizontalPosition()+1);
        circle2.setHorizontalPosition(circle2.getHorizontalPosition()+2);
        circle3.setHorizontalPosition(circle3.getHorizontalPosition()+3);
        circle4.setHorizontalPosition(circle4.getHorizontalPosition()+4);
    }
}