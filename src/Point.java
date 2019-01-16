public class Point {

    //a field belongs to an instance
    public int x; //instance field (non-static field)
    public int y; //instance field (non-static)
    public static final String msg = "I am Point";

    public Point(int initX, int initY){
        x = initX;
        y = initY;
    }

    //instance method (non-static method)
    // a method belongs to an instance
    public void translate(int deltaX, int deltaY){
        x += deltaX;
        y += deltaY;
    }

    //Make this static method!!
    public static void printHello(int times){
        for(int i = 0 ; i < times ; i++)
            System.out.println("hello");
    }

    @Override
    public String toString() {
        return "x: " + x + "  y: " + y;
    }
}
