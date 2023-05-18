public class Task1Maria61677 {
    public enum Shape {
        SQUARE(4, "Equal sides"),
        RECTANGLE(4, "Opposite sides equal"),
        CIRCLE(0, "Round shape"),
        TRAPEZOID(4, "One pair of parallel sides"),
        RHOMBUS(4, "Opposite angles equal"),
        TRIANGLE(3, "Three sides"),
        OVAL(0, "Elliptical shape"),
        HEXAGON(6, "Six sides");

        private final int sides;
        private final String description;

        Shape(int sides, String description) {
            this.sides = sides;
            this.description = description;
        }

        public int getSides() {
            return sides;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println(shape.name() + " has " + shape.getSides() + " sides, and is " + shape.getDescription() +
                    ". Its ordinal value is " + shape.ordinal() + ".");
        }
    }
}