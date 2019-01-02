/*
    a lot of people said that this is a simple one...

    well... i remember making some time ago private constructor in cpp
    ...
*/


class SingleObject {
    private static SingleObject i = new SingleObject();
    
    private SingleObject() {}

    // this method will be available only
    public static SingleObject getInstance() {
        return i;
    }

    public void someSimpleMethodThatShowsMsg() {
        System.out.println("Hello from Singleton!");
    }
}

public class Singleton {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern.");

        // there is no possibility to create in normal way
        // because default contructor is private
        // that we need use method getInstance
        SingleObject o = SingleObject.getInstance();
        o.someSimpleMethodThatShowsMsg();

        /*
        Singleton.java:35: error: SingleObject() has private access in SingleObject
        SingleObject o2 = new SingleObject();
        try {
            SingleObject o2 = new SingleObject();
        } catch( Exception e) {
            System.out.println("You can not do it!");
        }
        */
    }
}