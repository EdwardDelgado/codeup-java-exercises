package Shapes;

public class Square extends Rectangle {
    public Square(int side){
        super(side, side);
    }


    public int getArea () {
        System.out.println("From square method");
        return super.getLength() * super.getWidth();
    }

    public int getPerimeter(){
        System.out.println("From square method");
        return 4 * super.getLength();

    }

}
