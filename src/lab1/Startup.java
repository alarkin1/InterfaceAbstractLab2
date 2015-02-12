/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Use the Liskov Substitiution Principle when you need to access generic methods and properties.  Do not use it if you need to access unique properties from a unique object.  
package lab1;

/**
 *
 * @author Alex
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourseWithPrerequisites newCourse = new IntroJavaCourse("JAVAJAVAJAVA","101");
        newCourse.setCourseName("BOB");
        System.out.println(newCourse.getCourseName());
    }
}
