import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 750;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    int x1,x2,x3,x4=0;
    int y=HEIGHT/5;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x1+=1,y, DIAMETER, DIAMETER);
    }

    private void drawCircle2() {
        ellipse(x2+=2,2*y, DIAMETER, DIAMETER);
    }

    private void drawCircle3() {
        ellipse(x3+=3,3*y, DIAMETER, DIAMETER);
    }

    private void drawCircle4() {
        ellipse(x4+=4, 4*y, DIAMETER, DIAMETER);
    }
}

