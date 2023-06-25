// Produkt
interface Shape {
    void draw();
}

// Konkretne produkty
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rysuję okrąg");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rysuję prostokąt");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Rysuję kwadrat");
    }
}

// Fabryka abstrakcyjna
abstract class ShapeFactory {
    abstract Shape createShape();
}

// Konkretne fabryki
class CircleFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}

class SquareFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Square();
    }
}

// Przykładowe użycie
public class Factory {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.createShape();
        shape.draw();

        factory = new RectangleFactory();
        shape = factory.createShape();
        shape.draw();

        factory = new SquareFactory();
        shape = factory.createShape();
        shape.draw();
    }
}
