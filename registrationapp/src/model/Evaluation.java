package model;

import java.util.List;

/**
 * an interface is an abstract class that provides the method
 * signature of what a class
 */
public interface Evaluation {

    //describe this method signature: getApprovedCourses
    //is a method that returns a list of courses

    List<Course> getApprovedCourses();

}
