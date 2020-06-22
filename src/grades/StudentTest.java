//package grades;
//
//public class StudentTest {
//}


package grades;

public class StudentTest {

    public static void main(String [] args){

        Student newStudent= new  Student("brookeline");
        newStudent.addGrade(85);
        newStudent.addGrade(90);
        newStudent.addGrade(95);

        Student newStudent2= new Student("genesis");
        newStudent2.addGrade(90);
        newStudent2.addGrade(95);
        newStudent2.addGrade(100);






        System.out.println(newStudent.getGradeAverage());
        System.out.println(newStudent2.getGradeAverage());
        System.out.println(newStudent2.getGrades());





    }
}