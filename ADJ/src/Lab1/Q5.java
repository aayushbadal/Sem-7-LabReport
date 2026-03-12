/*
5. Write a class Circle containing provate variable radius of type float,
suitable constructors, and two methods findArea and findCircumference to find
area and circumference of circle respectively. Write  Seperate class MyClass
containing main method to create and use circle objects.
*/

package Lab1;
// Circle.java
class Circle {
    // Private variable
    private float radius;

    // Default constructor
    public Circle() {
        radius = 0.0f;
    }

    // Parameterized constructor
    public Circle(float r) {
        radius = r;
    }

    // Method to calculate area
    public float findArea() {
        return 3.1416f * radius * radius;
    }

    // Method to calculate circumference
    public float findCircumference() {
        return 2 * 3.1416f * radius;
    }

    // Getter for radius (optional)
    public float getRadius() {
        return radius;
    }

    // Setter for radius (optional)
    public void setRadius(float r) {
        radius = r;
    }
}

// MyClass.java
public class Q5 {
    public static void main(String[] args) {
        // Creating circle objects
        Circle c1 = new Circle();           // Using default constructor
        Circle c2 = new Circle(5.0f);      // Using parameterized constructor

        // Setting radius for c1
        c1.setRadius(3.0f);

        // Displaying area and circumference
        System.out.println("Circle c1:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.findArea());
        System.out.println("Circumference: " + c1.findCircumference());

        System.out.println("\nCircle c2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.findArea());
        System.out.println("Circumference: " + c2.findCircumference());
    }
}
