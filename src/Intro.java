public class Intro {
    public static void main(String[] args){
        System.out.println("Intro to Java!");
        System.out.println("Test?");

//        This is a single-line comment

        /**
         * This is a multi-line comment
         */

        int age;
        double price;
        final String name = "Sophie";

        System.out.println(name);

        age = 24;

        System.out.println(++age);
        System.out.println(age++);
        System.out.println(--age);

        price = 19.99;

        double randomNumber = 5.5;

        System.out.println(age/randomNumber);
        System.out.println("This is my string");
        System.out.println('y');

        System.out.println("\"This is a double quoted string\"");
        System.out.println("One backslash: \\ 'test'");

        int x = 3;
        int y = 2;

        x = x * y;

        x *= y;
        x /= y;
        x %= y;
        x += y;
        x -= y;

//        Implicit Casting
//        putting contents of smaller glass of water into a larger glass
        short lessPrecise = 5;
        int morePrecise = lessPrecise;

        System.out.println(lessPrecise);
        System.out.println(morePrecise);

//        Explicit Casting
//        Taking contents of larger glass, drinking some, pouring into a smaller glass.

        double pi = 3.14159;
        System.out.println(pi);

        int almostPi = (int) pi;
        System.out.println(almostPi);

        double piAgain = almostPi;
        System.out.println(piAgain);

    }
}


//////////////////////////////////////////////////////
//
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//
//        int myFavoriteNumber = 4;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "Hello Ganymede";
//        System.out.println(myString);
//
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//
//        Object o = theNumberThree;
//        System.out.println(o);
//
////        int three = (int) o;
//
//        int a = 4;
//        a += 5;
//
//        int b = 3;
//        int y = 4;
//        y *= b;
//
//        int c = 10;
//        int d = 2;
//        c /= d;
//        d -= c;
//
//        byte randomNumber  = 127;
//        System.out.println(++randomNumber);
//
//        short otherNumber = 32767;
//        System.out.println(++otherNumber);
//
//        System.out.println(randomNumber + otherNumber);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//    }
//}

/////////////////////////////////

//import java.util.Scanner;
//
//public class ConsoleIOLecture {
//
//    public static void main(String[] args) {

//        System.out.println("Hello Ganymede!");

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//        System.out.print("Hello ");
//        System.out.print("World");

//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            String hello = "Hello";
//            String world = "World";
//            System.out.println(hello + " " + world);
//            System.out.println("Hello" + " " + "World");


        // ================================== printf()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");




        // creating a string variable:
//            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello%n%S", bigBall); // all caps

        // multiple variables:
//            double three = 3.5;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %f %s.", three, typeOfPetGroup);

        // currency:
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);

        // write a program that will print your name with a greeting
        // Welcome, YOUR_NAME_HERE!

//        String name = "Justin Reich";
//        System.out.printf("Welcome, %s!", name);




        // ================================== USER INPUT

//        Scanner sc = new Scanner(System.in);


        // .next() captures each input separated by whitespace:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);


        // .nextLine():

//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);


        // unexpected behaviour

//            System.out.println("Enter a word:");
//            String word1 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//            System.out.println("Enter a sentence:");
//            String line1 = sc.nextLine();
//            String word2 = sc.next();
//            sc.nextLine(); // needed to clear out hitting enter
//            String line2 = sc.nextLine();


//        System.out.printf("The word is: %s%nThe sentence is: %s", word1, line1);


//            System.out.printf("%s%n%s%n%s%n%s%n", word1, line1, word2, line2);

        // check for presence of various data types

//            int userInt = 0;
//            if (sc.hasNextInt()) {
//                userInt = sc.nextInt();
//                System.out.printf("The user entered %d. This number times two is %d.", userInt, userInt * 2);
//            } else {
//                System.out.println("The user did not enter an integer");
//            }


//    }
//
//}