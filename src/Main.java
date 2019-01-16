public class Main {

    public static void main(String[] args) {

        Point.printHello(10); //Static method can be called without an instance


        Point p5 = new Point(500, 500);
        p5.translate(100, 200); //instance method need to be called with an instance



        //If we don't declare PI with static we need to do the following
//        Math m1 = new Math(); //create an instance
//        System.out.println(m1.PI); //call PI on that instance. This is B.A.D.

        //Have PI static and
        System.out.println(Math.PI); //we can use without instantiating!


//        A a = new A();
//        a.pts = new Point(1, 2);
//
//        A a2 = new A();
//        a2.pts = new Point(11, 22);
//
//
        System.out.println(Point.msg);
        //Point.msg = "I am not a Point"; //you cannot change something with final keyword

        System.out.println(Point.msg);

//        System.out.println(Point.x); //SUPER INVALID x is an instance field!
        Point p3 = new Point(30, 30);
        System.out.println(p3.x); //this is SO valid

        Point p1 = new Point(10, 20); //object instantiation
        System.out.println(p1);
        p1.translate(100, 200);
        System.out.println(p1); //method call

        Point p2 = new Point(20, 40); //object instantiation
        System.out.println(p2);
        p2.translate(300, 500);
        System.out.println(p2);
    }
}
