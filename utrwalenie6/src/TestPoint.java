public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        System.out.println(p1.distance(p2));

    }
}

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distance(Point otherPoint){
        double dx = x-otherPoint.x;
        double dy = y - otherPoint.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
