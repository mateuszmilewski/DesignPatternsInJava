/*
    The Factory Pattern
    simple example in Java Language

    quite fine for creation of objects
    especially if we using same interface for diff classes
    which implements it
*/


abstract interface Shape {
    void draw();
}


class Rect implements Shape {
    public void draw() {
        System.out.println("Rect::draw()");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square::draw()");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle::draw()");
    }
}


class ShapeFactory {
    public static Shape getShape() {
        return null;
    }

    public static Shape getShape(int e) {
        if( e == 1) {
            return new Rect();
        } else if( e == 2) {
            return new Square();
        } else if( e == 3 ) {
            return new Circle();
        } else {
            return null;
        }
    }
}



public class factory {
    public static void main(String ... args) {
        System.out.println("This is example of factory design pattern");

        // of course there is no exception catching when for example s1, s2 or s3 is null...
        Shape s1 = ShapeFactory.getShape(1);
        s1.draw();

        Shape s2 = ShapeFactory.getShape(2);
        s2.draw();

        Shape s3 = ShapeFactory.getShape(3);
        s3.draw();


        s1 = ShapeFactory.getShape();
        // Exception in thread "main" java.lang.NullPointerException
        try {
            s1.draw();    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("you can not draw from this object, because is empty: null.");
        }
        
    }
}