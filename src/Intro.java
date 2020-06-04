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
