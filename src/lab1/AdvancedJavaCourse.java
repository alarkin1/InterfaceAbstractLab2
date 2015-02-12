package lab1;

/**
 * Describe responsibilities here.
 *This class inherits its properties and methods from ProgrammingCourseWithPrerequisites.  
I think that inheriting from 
 ProgrammingCourseWithPrerequisites is more efficient than simply adding the properties and methods to each class.
 My way allows for easy expansion in the future
 * @alarkin1
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourseWithPrerequisites {

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

}
