package D;

import D.Point;

public class Main {
    private static void main(String[] args) {
        Point one = new Point(0,0);
        Point two = new Point(2,3);
        System.out.println(distanceBeetwen(one, two));
    }

    private static double distanceBeetwen(Point first, Point second) {
        return Math.sqrt((first.getX() - second.getX()) ^ 2 + (first.getY() - second.getY()) ^ 2);
    }
}
