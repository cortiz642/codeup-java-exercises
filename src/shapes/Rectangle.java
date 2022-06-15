package shapes;

//Created a class named "Rectangle"
public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
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
    //Protected properties for length and width
//    protected double length;
//    protected double width;
//    //defined Rectangle Constructor
//    //used double for length and width to accept two numbers
//        public Rectangle(double length, double width){
//            this.length = length;
//            this.width = width;
//    }
//
//
//    //Created getArea method
//        public double getArea(){
//            return width * length;
//        }
//        //Created getPerimeter method
//        public double getPerimeter(){
//           return 2 * (length + width);
//        }

}
