import java.util.HashMap;
import java.util.Map;

// Prototyp
abstract class Shape2 implements Cloneable {
    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    abstract void draw();

    @Override
    public Shape2 clone() {
        Shape2 clone = null;
        try {
            clone = (Shape2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

// Konkretne prototypy
class Circle2 extends Shape2 {
    public Circle2() {
        type = "Koło";
    }

    @Override
    void draw() {
        System.out.println("Rysuję koło");
    }
}

class Rectangle2 extends Shape2 {
    public Rectangle2() {
        type = "Prostokąt";
    }

    @Override
    void draw() {
        System.out.println("Rysuję prostokąt");
    }
}

class Square2 extends Shape2 {
    public Square2() {
        type = "Kwadrat";
    }

    @Override
    void draw() {
        System.out.println("Rysuję kwadrat");
    }
}

// Klasa zarządzająca prototypami
class ShapeCache {
    private static Map<String, Shape2> shapeMap = new HashMap<>();

    public static Shape2 getShape(String shapeId) {
        Shape2 cachedShape2 = shapeMap.get(shapeId);
        return cachedShape2.clone();
    }

    public static void loadCache() {
        Circle2 circle2 = new Circle2();
        circle2.setId("1");
        shapeMap.put(circle2.getId(), circle2);

        Rectangle2 rectangle2 = new Rectangle2();
        rectangle2.setId("2");
        shapeMap.put(rectangle2.getId(), rectangle2);

        Square2 square2 = new Square2();
        square2.setId("3");
        shapeMap.put(square2.getId(), square2);
    }
}

// Przykładowe użycie
public class Prototype {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape2 clonedShape21 = ShapeCache.getShape("1");
        System.out.println("Typ: " + clonedShape21.getType());

        Shape2 clonedShape22 = ShapeCache.getShape("2");
        System.out.println("Typ: " + clonedShape22.getType());

        Shape2 clonedShape23 = ShapeCache.getShape("3");
        System.out.println("Typ: " + clonedShape23.getType());
    }
}
