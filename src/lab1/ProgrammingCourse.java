/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
/**
 *
 * @author Alex
 */
public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public ProgrammingCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            //Do something here to carry the error
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            //Do something here to carry the error
        }
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            //Do something here to carry the error
        }
        this.courseName = courseName;
    }

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

}
