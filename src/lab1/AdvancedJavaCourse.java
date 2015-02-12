package lab1;

/**
 * Describe responsibilities here.
 *This class inherits its properties and methods from ProgrammingCoursesWithPrerequisites.  
I think that inheriting from 
 ProgrammingCoursesWithPrerequisites is more efficient than simply adding the properties and methods to each class.
 My way allows for easy expansion in the future
 * @Alex Larkin
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCoursesWithPrerequisites {

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

}
