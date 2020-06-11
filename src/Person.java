public class Person {
}


//6/9-6/10

//================================= OOP
//        -- UP TO NOW --
//        - mostly programming in an imperative way both in JS and Java.
//        - functions/methods change the state of various variables
//        -- DEFINITION --
//        OOP - Object-oriented programming
//        - A programming paradigm where state (data/properties) and behavior (functionality/methods)
//        are grouped together (often into objects).
//        - Objects in Java are created from classes (a blueprint for an object/instance)
//        -- ADVANTAGES OF OOP --
//        Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
//        - implementation details can be abstracted away making code more readable (Abstraction)
//        - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
//        - duplication is minimized through inheritance hierarchies (Inheritance)
//        - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)
//        -- THE FOUR PILLARS OF OOP --
//        1. Abstraction - keep it clean
//        2. Encapsulation - keep it contained
//        3. Inheritance - keep it hierarchical (DRY)
//        4. Polymorphism - keep it versatile
//        https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219
//        Today we will focus on Abstraction and Encapsulation.
//        -- CONCEPTS COVERED --
//        - how to create custom classes and objects from these classes
//        - defining and using instance and static fields
//        - how to control class constructors
//  - using the "this" keyword
//          - controlling encapsultation with visibility modifiers (edited)


//-- OOP SHORT ASSIGNMENT #1 --
//        Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "printSummary" with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//        Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
//
//
//        -- SHORT ASSIGNMENT #2 --
//        PART 1
//        Refactor your Dish and DishTest classes...
//        1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//      2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//              3) Refactor code as needed in DishTest to access and modify dish object property values
//              4) Add a constructor method to Dish that will assign all properties
//              5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
//              PART 2
//              Create a class of static fields (properties and methods) called DishTools
//      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000
//              - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//              - analyzeDishCost() - that takes in a Dish object and will print out either "More expensive than average" or "Less expensive than average", depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//              - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//              Try out the DishTools methods with Dish objects in the DishTest main method




//wednesday extra practice work
//================================= OOP CHALLENGES
//        Create a text adventure game using custom classes and objects (e.g. Character, Enemy, Item, Game, etc.)
//        Create a MadLib generator program
//        10:01
//        ================================= OOP PRACTICE RECOMMENDATIONS
//        Objects are simply a way of representing state and behavior. To practice writing objects, it helps in the beginning to write objects that represent tangible things like animals, people, cars, etc. With that in mind, until you can write a class quickly and create objects from it, choose a real world concept and do the following...
//        1. add three instance variables set to private of at least two primitive types
//        2. add 2 instance methods that affect one or more instance variables
//        3. add 1 static constant that makes sense for the given class
//  4. add 1 static method that makes sense for the given class
//  5. add an empty constructor and a constructor that sets all instance variables
//          6. add getters and setters for all instance variables
//          7. add main method to create the objects
//          Here are some class suggestions:
//        User
//        Product
//        Comment
//        Post
//        Car
//        Pet
//        Radio
//        SodaCan
//        Table
//        Remote
//        Building
//        Toy
//        Food
//        Animal
//        Location