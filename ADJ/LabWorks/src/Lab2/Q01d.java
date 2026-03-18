// d. Multiple Inheritance using Interface

package Lab2;

interface Area {
    int findArea();
}

interface Perimeter {
    int findPeri();
}

class Rectangle implements Area, Perimeter {
    int length, breadth;

    public Rectangle() {
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int findArea() {
        return length * breadth;
    }

    public int findPeri() {
        return (2 * (length + breadth));
    }
}

public class Q01d {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        System.out.println("Area of Rectangle =" + r1.findArea());
        System.out.println("Perimeter of Rectangle =" + r1.findPeri());
    }
}
