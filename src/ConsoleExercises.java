//import java.util.Scanner;
//
//public class ConsoleExercises {
//        public static void main(String [] args){
//            double pi = 3.14159;
//            System.out.format("The value of pi is approximately %.2f", pi);
//
//
//
//
//
//
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a integer: ");
//            int userInput = scanner.nextInt();
//            System.out.println(userInput);
//
//
//            System.out.print("Enter Three words: ");
//            String userInput2 = scanner.next();
//            String userInput3 = scanner.next();
//            String userInput4 = scanner.next();
//
//            System.out.println(userInput2 );
//            System.out.println(userInput3);
//            System.out.println(userInput4 );
//
//            scanner.nextLine();
//            System.out.print("Enter sentence: ");
//            String userSentence = scanner.nextLine();
//            System.out.println(userSentence);
//
//
//
//
//
//
//            System.out.printf("what is the width of the classroom?:");
//            String answer=scanner.nextLine();
//            double width=Double.valueOf(answer);
//
//
//            System.out.printf("what is the length of the classroom?:");
//            String response=scanner.nextLine();
//            double length=Double.valueOf(response);
//
//            System.out.printf("area of classroom: %.2f%n",length*width);
//            System.out.printf("area of classroom: %.2f%n",length*2+width*2);
//
//
//        }
//}


import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
//        The value of pi is approximately 3.14.
        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userInt = sc.nextInt();
        System.out.println("The user entered: " + userInt);

        System.out.println("Please enter three words...");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);
        System.out.println("Please enter a sentence...");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.print("Please enter length of room in centimeters:");
        int length = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter width of room in centimeters:");
        int width = Integer.parseInt(sc.nextLine());
        int area = length * width;
        int perimeter = (length + width) * 2;
        System.out.printf("The area of the room is %d%nThe perimeter of the room is %d", area, perimeter);


    }


}
