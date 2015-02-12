package lab1;

import javax.swing.JOptionPane;

/**
 * This is a class that allows inheriting classes to automatically have
 * certain methods and properties that are shared between the Java courses.
 *
 * @author alarkin1
 * @version 1.00
 */
public class ProgrammingCourseWithPrerequisites extends ProgrammingCourse {

    private String prerequisites;

    public ProgrammingCourseWithPrerequisites(String courseName, String courseNumber) {
        super(courseName, courseName);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            //Do something here to carry the error
        }
        this.prerequisites = prerequisites;
    }

}
