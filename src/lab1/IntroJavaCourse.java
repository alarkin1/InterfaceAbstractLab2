package lab1;

/**
 * Describe responsibilities here.
 *This class inherits its properties and methods from ProgrammingCourseWithPrerequisites.  
 I think that inheriting from 
 ProgrammingCourseWithPrerequisites is more efficient than simply adding the properties and methods to each class.
 The way I have stuctured the classes allows for easy expansion in the future
 * @alarkin1
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourseWithPrerequisites {

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

}
