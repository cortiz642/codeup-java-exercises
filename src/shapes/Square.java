
package shapes;
//Created a class named Square inside of shapes
//which extends Rectangle
public class Square extends Rectangle{
    protected double side;
        public Square(double side) {
        super(side, side);
        this.side = side;

    }
    //seperate instance of setclass
        @Override
        public double getArea(){
            return side * side;
        }

    //seperate instance of setclass
        @Override
        public double getPerimeter(){
            return 4 * side;
            }

    public double getSide() {
            return 8 * side;
    }

//    public int getSide() {
//        return 0;
//    }
}



