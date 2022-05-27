package shapes;

//Created a class named "Rectangle"
public class Rectangle {
    //Protected properties for length and width
    protected double length;
    protected double width;
    //defined Rectangle Constructor
    //used double for length and width to accept two numbers
        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
    }


    //Created getArea method
        public double getArea(){
            return length * length;
        }
        //Created getPerimeter method
        public double getPerimeter(){
           return 2 * (length + width);
        }

}
