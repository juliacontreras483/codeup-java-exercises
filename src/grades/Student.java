//package grades;
//
//public class Student {
////    // returns the student's name
////    public String getName();
////    // adds the given grade to the grades property
////    public void addGrade(int grade);
////    // returns the average of the students grades
////    public double getGradeAverage();
//
//}


package grades;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


//constructor

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//methods


    // returns the student's name
    public String getName() {

        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {

        this.grades.add(grade);
    }

// returns the average of the students grades

    public double getGradeAverage() {
//        Collections.sort(grades); can use to sort if import but not necessary for this problem
        int sum = 0;
        for (int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        //calculate average value
        double average = sum / grades.size();
        return average;


    }
    // returns individual Grades
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }



}


//    Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
//
//        Copied to clipboard
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//        Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
//
//        Create a map for students and GitHub usernames
//
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//
//        Be creative! Make up GitHub usernames and grades for your student objects.
//
//        Create the command line interface
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//        After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
//
//        Example output:
//
//
//        Welcome!
//
//        Here are the GitHub usernames of our students:
//
//        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//        What student would you like to see more information on?
//
//        > pizza
//
//        Sorry, no student found with the GitHub username of "pizza".
//
//        Would you like to see another student?
//
//        > y
//
//        What student would you like to see more information on?
//
//        > zgulde
//
//        Name: Zach - GitHub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//        > no
//
//        Goodbye, and have a wonderful day!

