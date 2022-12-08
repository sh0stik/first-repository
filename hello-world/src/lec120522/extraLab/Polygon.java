package lec120522.extraLab;

class Polygon {
    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class Rectangle extends Polygon{
    public void render(){
        System.out.println("Rendering Rectangle...");
    }
}

class PolymorphismExample {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();

        Polygon p1 = new Polygon();
        p1.render();

        Rectangle r1 = new Rectangle();
        r1.render();

    }
}