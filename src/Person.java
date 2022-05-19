public class Person {           //based off instance method
    private String name;       //private name field "String"
    public String getName() { //String method
//TODO: return the person's name
        return name;          //return statement
    }
        public void setName (String name){  //string method
//TODO: change the name field to the passed value
            this.name = name;   //line the this refers to current object name "line2"
        }
        public void sayHello () {   //method
//TODO: print a message to the console using the person's name
            System.out.printf("Hello %s", this.name);   //utilizing print format parameter
                                                        //to use modulus

        }

    public static void main(String[] args) {    //main method
        Person Chris = new Person();    //Person Chris variable is equal to new object Person
        Chris.setName("Chris"); //Variable Chris utilizing setName method is used to change the name of a thread
        Chris.sayHello(); //Calling sayHello method
    }
    }

