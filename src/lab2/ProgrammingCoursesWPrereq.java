/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Alex
 */
public interface ProgrammingCoursesWPrereq extends ProgrammingCourse {

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);
}
