/*
6. Write a class Distance containing provate variables feet of type int and inches of type int, suitable constructors,
and two methods addDistance and displayDistance for adding and display distance objects. Write a separate class MyDistance 
containing main method to create and use distance objects.
*/

package Lab1;

// Distance.java
class Distance {
    // Private variables
    private int feet;
    private int inches;

    // Default constructor
    public Distance() {
        feet = 0;
        inches = 0;
    }

    // Parameterized constructor
    public Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize(); // Ensures inches < 12
    }

    // Method to normalize inches to feet
    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    // Method to add two distances
    public Distance addDistance(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;
        Distance result = new Distance(totalFeet, totalInches);
        return result;
    }

    // Method to display distance
    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }

}

public class Q6 {
    public static void main(String[] args) {
        // Creating distance objects
        Distance d1 = new Distance(5, 8); // 5 feet 8 inches
        Distance d2 = new Distance(3, 9); // 3 feet 9 inches

        // Displaying the original distances
        System.out.print("Distance 1: ");
        d1.displayDistance();
        System.out.print("Distance 2: ");
        d2.displayDistance();

        // Adding distances
        Distance d3 = d1.addDistance(d2);
        System.out.print("Sum of distances: ");
        d3.displayDistance();
    }
}
