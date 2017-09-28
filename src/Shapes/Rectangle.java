package Shapes;

public class Rectangle {

    private int length;

    private int width;

    // GETTERS
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    //    Constructor
    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }
    public Rectangle() {}

//    Methods
    public int getArea () {
        return length * width;
    }

    //    Methods
    public int getPerimeter(){
        return (2 * length) + (2 * width);

    }
}
