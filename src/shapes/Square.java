
package shapes;
//Created a class named Square inside of shapes
//which extends Rectangle
public class Square extends Quadrilateral{
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return length + length + width + width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
    this.length = length;
    }

    @Override
    public void setWidth(double width) {
    this.width = width;
    }
//    protected double side;
//        public Square(double side) {
//        super(side, side);
//        this.side = side;
//
//    }
//    //seperate instance of setclass
//        @Override
//        public double getArea(){
//            return side * side;
//        }
//
//    //seperate instance of setclass
//        @Override
//        public double getPerimeter(){
//            return 4 * side;
//            }
//
//    public double getSide() {
//            return 8 * side;
//    }

//    public int getSide() {
//        return 0;
//    }
}



