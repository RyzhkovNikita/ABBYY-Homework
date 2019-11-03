package D;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /*@Override
    public int hashCode() {
        return x * 19 + y;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Point) return false;
        return ((Point) obj).x == this.x && ((Point) obj).y == this.y;
    }*/
}
