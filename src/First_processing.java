import processing.core.PApplet;

public class First_processing extends PApplet {

    public static final int WIDTH = 645;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;
    int x=0;

    public static void main(String[] args) {
        PApplet.main("First_processing", args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        getBackground();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x++, mouseY, DIAMETER, DIAMETER);
    }

    private void getBackground() {
        background(255);
    }
}
