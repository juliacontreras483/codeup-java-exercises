import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;


public class FileIOLecture {

    public static void main(String[] args){
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src/grades", "student.java");
        Path gitignore = Paths.get("gitignore");

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));
        System.out.println(Files.notExists(gitignore));

        String directory = "test";
        Path myTest = Paths.get("src",directory);
        Path helloFile = Paths.get("test", "hello.txt");



        if(Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        writing to hello.txt
        String[] names = {"justin", "sophie", "vivian"};
        List<String> instructors = Arrays.asList(names);
        List<String> students = new ArrayList<>();
        students.add("Laura");
        students.add("Julia");
        students.add("Mark");
        students.add("Aaron");
        students.add("Augustine");
        try {
            Files.write(helloFile,students);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> myStudents = Files.readAllLines(helloFile);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
