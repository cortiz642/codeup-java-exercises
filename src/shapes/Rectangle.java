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
        public int getArea(){
            int area;
            return area = (int)(2 * length + 2 * width);
        }
        //Created getPerimeter method
        public int getPerimeter(){
            int perimeter;
           return perimeter = (int) (2 * length + 2 * width);
        }

}
