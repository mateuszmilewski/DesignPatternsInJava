/*
    fun fact:
    in other words we can say that abstract factory is in some
    way factory of a factories

    but in my understanding it is just a box for many factories
    or in some way facade but still diff...
*/

// copy & paste from prev project
/* */
interface Shape {
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


// now new one with colors 

interface Color {
    void fill();
}

class Red implements Color {
    public void fill() {
        System.out.println("Red::fill()");
    }
}

class Green implements Color {
    public void fill() {
        System.out.println("Green::fill()");
    }
}

class Blue implements Color {
    public void fill() {
        System.out.println("Blue::fill()");
    }
}



abstract class AbstractFactoryTest {
    abstract Color getColor(int i);
    abstract Shape getShape(int i);
}

class MyColorFactory extends AbstractFactoryTest {
    public Color getColor(int i) {
        if( i == 1 ) {
            return new Red();
        } else {
            return new Blue();
        }
    }

    public Color getColor() {
        return new Green();
    }


    public Shape getShape(int i ) {
        return null;
    }
}

class MyShapeFactory extends AbstractFactoryTest {
    public Color getColor(int i) {
        return null;
    }


    public Shape getShape(int i ) {
        return new Circle();
    }
}


class FactoryFromFactory {
    // the factory producer

    public static AbstractFactoryTest getFactory(int f) {
        if(f == 1) {
            return new MyShapeFactory();
        } else if(f == 2) {
            return new MyColorFactory();
        } else {
            return null;
        }
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println("Abstract factory design pattern");


        // 1 stands for Shape
        AbstractFactoryTest f1 = FactoryFromFactory.getFactory(1);
        // 2 stands for Color
        AbstractFactoryTest f2 = FactoryFromFactory.getFactory(2);

        Shape s1 = f1.getShape(1);
        s1.draw();

        Color c1 = f2.getColor(1);
        c1.fill();

    }
}