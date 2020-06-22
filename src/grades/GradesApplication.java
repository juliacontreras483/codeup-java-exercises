//package grades;
//
//public class GradesApplication {
//}


package grades;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input= new Input();
        boolean useranswer;


//        new Student objects

        Student julia=new Student("julia");
        julia.addGrade(85);
        julia.addGrade(90);
        julia.addGrade(92);


        Student marina=new Student("marina");
        marina.addGrade(80);
        marina.addGrade(90);
        marina.addGrade(88);

        Student jane=new Student("jane");
        jane.addGrade(90);
        jane.addGrade(95);
        jane.addGrade(100);


        Student rachel=new Student("rachel");
        rachel.addGrade(98);
        rachel.addGrade(90);
        rachel.addGrade(95);

        Student nullstudent = new Student("there is no student that exist with that username");


//        HashMap

        HashMap<String,Student> students = new HashMap<>();

//                      keys           values
        students.put("juliacontreras483",julia);
        students.put("rinadelray",marina);
        students.put("jane2000",jane);
        students.put("rdady",rachel);




//        commandline interface


        System.out.println("Here are the Github usernames of our students:");

        for (String username : students.keySet()) {
            System.out.printf(" | %s | ", username);
        }

//    do while loop

        do {

            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = scanner.nextLine();
            String answer = (students.getOrDefault(userInput, nullstudent).getName());
            System.out.println("Students name is: "+ answer);

            for (Student student : students.values()) {
                if (answer.equals(student.getName())) {
                    System.out.println("this is their grade average: \n"+student.getGradeAverage());
                    System.out.println("List of this Students Grades:");
                    for(Integer grade:student.getGrades()){
                        System.out.println( grade);
                    }
                }
            }

            System.out.println("Would you like to continue? yes/no");
            useranswer=input.yesNo();

        }while(useranswer);


        //    prints all all the Students names and Grades

        System.out.println("would you like to see a list of all the students Grades?");
        boolean userInput = input.yesNo();

        if(userInput=true) {

            for (Student student : students.values()) {
                System.out.println("\n Student name is: " + student.getName());

                System.out.println("their list of Grades is: ");
                for (Integer grade : student.getGrades()) { System.out.println(grade); }
            }
        }

        else { System.out.println("no problem"); }


    }


}