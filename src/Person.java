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


    //Understanding references
    //
    //The following code blocks make use of the Person class from the previous
    // exercise. For each code block, think about what the code will output,
    // then copy the code into IntelliJ and run it to see if it matches your
    // expectations.


    //Create an input validation class
    //
    //Create a package inside of src named util. Inside of util, create a
    // class named Input that has a private field named scanner. When an
    // instance of this object is created, the scanner field should be set
    // to a new instance of the Scanner class. The class should have the
    // following methods, all of which return command line input from the user


    }

