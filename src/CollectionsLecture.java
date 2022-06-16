//import shapes.Square;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class CollectionsLecture {
//    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4};
//            ArrayList<Integer> collectionOfNums = new ArrayList<>();
//            collectionOfNums.add(16);
//            collectionOfNums.add(44);
//            collectionOfNums.add(53);
//            collectionOfNums.add(32);
//
////            for(Integer num : collectionOfNums){
//// in order to print out the num Array you would have to use the util.
//// and use the Arrays.toString(num) method which will then print out the full array and not location
////                System.out.println(num);
////            }
////            System.out.println(numbers);
////            System.out.println(collectionOfNums);
//
//        System.out.println(collectionOfNums.contains(53));
//
//        List<Square> squares = new ArrayList<>();
//        Square specialOne = new Square(4);
//        squares.add(specialOne);
//        System.out.println(squares.contains(specialOne));
//        //making new instance of square with side of 8
//        squares.add(new Square(8));
//        //does my square contain 8 sides
//        //will get back false because you would need a reference
//        System.out.println(squares.contains(new Square(8)));
//
//        for(Square square : squares){
//            if(square.getSide() == 8){
//                System.out.println("true, Square found with a side lenght of 8");
//            }
//        }
//
//        System.out.println(squares.get(1).getSide());
//
//        //index methods
//        //"specialOne" give indexOf [0] and print 0
//        System.out.println(squares.indexOf(specialOne));
//
//
//        Square outsider = new Square(5);
//        //will print -1 which means it is not there because in java there is no -1 only positive numbers
//        System.out.println(squares.indexOf(outsider));
//
////        int biggestNum = 0;
////        for(int nums : collectionOfNums){
////            biggestsNum = Math.max(biggestNum, num);
//
////        }
////        System.out.println(biggestNum);
//
//        //build new array list
//
//        ArrayList<String> names = new ArrayList<>();
//        names.add("some name");
////        if(names.isEmpty()){
////            System.out.println("Hey, you ain't got no names in there.");
////        }else {
////            System.out.println("Cool names, bro!");
////        }
//
//
//
//        boolean resultOfRemove = names.remove("some name");
//        System.out.println(resultOfRemove);
//
//
//
//        boolean didWeRemoveThatSquare = squares.remove(new Square(8));
//        System.out.println(didWeRemoveThatSquare);
//
//        ///////////////////HashMaps//////////////////
//        //first is key second is value
////        HashMap<Character, Circle> circles = new HashMap<>();
////        circles.put('A', new Circle(3));
////        Circle specialCircle = new Circle(6);
////        circles.put('B', specialCircle);
////        System.out.println(circles);
////        ///in HashMap a key can never be repeated
////        circles.putIfAbsent('B', new Circle(9.99));
////        System.out.println(circles);
////        circles.putIfAbsent('C', specialCircle);
////        circles.putIfAbsent('D', specialCircle);
////        System.out.println(circles);
////        circles.put('Z', Circle(3.14));
////        circles.put('G', new Circle(8.8));
////        circles.put('L', new Circle(66.423));
////        System.out.println(circles);
////        //Grabbing keyset off of HashMap
////        ////Set is another type of collection within Java
////        //In a set all of the values are unique which is important when wanting to
////        //use all of the HashMap keys to use all of the data
////        //Iterate through and get the values of a HashMap
////        //You will get back the keys and iterate through all the different values
////        Set<Character> keyFromCircles = circles.keySet();
////        System.out.println(keysFromCircles);
////        for(char key : keysFromCircles){
////            System.out.println(circles.get(key).getArea());
////
////            //a way to check if a specific value is held a key contained within
////            //the map key 'P'
////            System.out.println(circles.containsKey('P'));
////            System.out.println(circles.containsValue(specialCircle));
//
//
////        }
//        }
//    }
//
