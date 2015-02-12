package lab2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse newCourseA = new AdvancedJavaCourse("Bob","101");
        ProgrammingCoursesWPrereq newCourseB = new AdvancedJavaCourse("Bob2","101");
        System.out.println(newCourseA.getCourseName());
        System.out.println(newCourseB.getPrerequisites());
    }
}
