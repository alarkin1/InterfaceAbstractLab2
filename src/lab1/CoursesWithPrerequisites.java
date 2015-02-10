package lab1;

import javax.swing.JOptionPane;

/**
 * This is a class that allows inheriting classes to automatically have
 * certain methods that are shared between the Java courses.
 *
 * @author your name goes here
 * @version 1.00
 */
public class CoursesWithPrerequisites extends Course {

    private String prerequisites;

    public CoursesWithPrerequisites(String courseName, String courseNumber) {
        super(courseName, courseName);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

}
