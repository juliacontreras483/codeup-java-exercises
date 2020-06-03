import java.util.Scanner;

public class ConsoleExercises {
        public static void main(String [] args){
            double pi = 3.14159;
            System.out.format("The value of pi is approximately %.2f", pi);







            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a integer: ");
            int userInput = scanner.nextInt();
            System.out.println(userInput);


            System.out.print("Enter Three words: ");
            String userInput2 = scanner.next();
            String userInput3 = scanner.next();
            String userInput4 = scanner.next();

            System.out.println(userInput2 );
            System.out.println(userInput3);
            System.out.println(userInput4 );

            scanner.nextLine();
            System.out.print("Enter sentence: ");
            String userSentence = scanner.nextLine();
            System.out.println(userSentence);






            System.out.printf("what is the width of the classroom?:");
            String answer=scanner.nextLine();
            double width=Double.valueOf(answer);


            System.out.printf("what is the length of the classroom?:");
            String response=scanner.nextLine();
            double length=Double.valueOf(response);

            System.out.printf("area of classroom: %.2f%n",length*width);
            System.out.printf("area of classroom: %.2f%n",length*2+width*2);


        }
}



