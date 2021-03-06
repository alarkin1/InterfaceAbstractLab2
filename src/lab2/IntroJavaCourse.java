package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @Alex Larkin
 * @version 1.00
 */
public class IntroJavaCourse implements ProgrammingCourse, ProgrammingCoursesWPrereq {

    private String prerequisites;
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroJavaCourse(String courseName, String courseNumber) {
        //May need validation
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            //Carry the error from here
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            //Carry th error from here
        }
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            //Carry the error from here
        }
        this.courseName = courseName;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            //Carry error from here
        }
        this.prerequisites = prerequisites;
    }

}
