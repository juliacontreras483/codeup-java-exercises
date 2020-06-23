//package contactsManager;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
////package ContactsManager;
//
//
//
//public class Contact {
//
//        private String firstName;
//        private String lastName;
//        private String phoneNumber;
//        public static void main(String[] args) {
//
//
//            Path myDirectory = Paths.get("src");
//            Path gitignore = Paths.get(".gitignore");
//
//
//
//            System.out.println(Files.exists(myDirectory));
//            System.out.println(Files.notExists(gitignore));
//
//            String directory = "test";
//            Path contactsFile = Paths.get("src","contacts.txt");
//
//            menu();
//
//
////        String menu ="\n\nMENU";
////        menu +="\n1. View Contacts.\n";
////        menu +="\n2. Add New Contact.\n";
////        menu +="\n3. Search a new Contact.\n";
////        menu +="\n4. Delete an existing contact.\n";
////        menu +="\n5. Exit.\n";
////        menu +="Enter an option:\n";
//
////        if(Files.notExists(myTest)){
////            try {
////                Files.createDirectory(myTest);
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
//
//            if(Files.notExists(contactsFile)){
//                try {
//                    Files.createFile(contactsFile);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
////        Writing to contacts.txt
//
//            List<String> contacts = new ArrayList<>();
//            contacts.add("Goku");
//            contacts.add("Piccolo");
//            contacts.add("Vegeta");
//            contacts.add("Bulma");
//            contacts.add("Yamcha");
//
//            try {
//                Files.write(contactsFile, contacts);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                List<String> myStudents = Files.readAllLines(contactsFile);
//                System.out.println(myStudents);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//            String newStudent = "Ramon";
//            List<String> newStudents = Arrays.asList("Ramon","Justin","Julia","Augustine","Sophie");
//            try {
//                Files.write(contactsFile,newStudents,StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            List<String> newClass = new ArrayList<>();
//
////        for(String student : myStudents){
////            if(student.equals("Justin")){
////                newClass.add("Shelby");
////                continue;
////            }
////            newClass.add(student);
//        }
//
//        //        try {
////            Files.write(contactsFile,newClass);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        System.out.println(newClass);
////
////    }
//        public static int menu() {
//
//            int selection;
//            Scanner input = new Scanner(System.in);
//
//            /***************************************************/
//
//            System.out.println("\n\nMENU");
//            System.out.println("\n1. View Contacts.");
//            System.out.println("\n2. Add New Contact.");
//            System.out.println("\n3. Search a new Contact.");
//            System.out.println("\n4. Delete an existing contact.");
//            System.out.println("\n5. Exit.\n");
//            System.out.println("Enter an option:\n");
//
//            selection = input.nextInt();
//            return selection;
//
//        }
//
//
//    }
//
//
//
//
//    import java.io.IOException;
////
////public class ContactsTest extends Contacts{
////    public ContactsTest(String firstName, String lastName, String phoneNumber) throws IOException {
////        super(firstName, lastName, phoneNumber);
//// }
////
//// public static void main(String[] args) throws IOException {
////
//////        VARIABLES
//// File file = new File("/Users/Julia/IdeaProjects/Contacts-Manager/data/contacts.txt");
//// Scanner scanner = new Scanner(file);
////Scanner scan = new Scanner(System.in);
////Path contactsPath = Paths.get("data", "contacts.txt");
//// int input;
////
//////        PRINTS LIST
////List<String> list = Files.readAllLines(contactsPath);
////Collections.sort(list);
//////            for (int i = 0; i < list.size(); i += 1) {
//////                System.out.println((i + 1) + " : " + list.get(i));
//////            }
//////        System.out.println();
////
//// //--FOR THE SWITCH CASE:
//////
////String menu="\n\nMENU";
//// menu +="\n1. View contacts.\n";
//// menu+="2. Add a new contact.\n";
//// menu+="3. Search a contact by name.\n";
//////        menu+="4. Edit a contact.\n";
//// menu+="4. Delete an existing contact.\n";
//// menu+="5. Exit.\n" ;
//// menu+="Enter an option:\n";
////
////do {
//// System.out.println(menu);
////
////input = scan.nextInt();
////
//////NEED TO WRAP IN A DO WHILE;
////switch (input) {
//// case 1:
//// list = Files.readAllLines(contactsPath);
//// Collections.sort(list);
//// for (int i = 0; i < list.size(); i += 1) {
//// System.out.println((i + 1) + " : " + list.get(i));
//// }
////                    break;
////                case 2:
////                    addContact();
////                    break;
////                case 3:
////                    searchContact();
////                    break;
////                case 4:
////                    removeContact();
////                    break;
////                case 5:
////                    System.out.println("Goodbye");
////                    default:
////                break;
////
////     }
////     }while(input !=5);
////
////
////    }
////
////}
