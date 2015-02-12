package lab2;
/**
 * Describe responsibilities here.
 *
 * @Alex Larkin
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse{

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        //May need validation
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            //Carry error from here
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            //Carry error from here
        }
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            //Carry error from here
        }
        this.courseName = courseName;
    }
    
}