package model;

import java.util.*; //became * cus java knows we are importing afew classes as util

public class Student extends Person implements Evaluation {

    //student class can also have its own attributes
    private double average;

    //student has a list of courses that they attend
    private final List<Course> courses = new ArrayList<>();

    //student has a list of approved courses that they attend
    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date DOB) {
        super(id, name, email, DOB);
        average = 0.0;
    }

    public Student(String id, String name, String email, Date DOB, double average) {
        super(id, name, email, DOB);
        this.average = average;
    }

    //we override to String() method, otherwise it will revert to parent class method
    @Override
    public String toString() {
        return String.format(
                "{id: %d, name: %s, email: %s, DOB, %s, average GPA: %.2f}",
                super.getId(),
                super.getName(),
                super.getEmail(),
                super.getDOB(),
                this.average
                );
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void enrollToCourses(Course course) {
        //TODO
    }

    public void registerApprovedCourses() {
        //TODO
    }

    public boolean isCourseApproved(Course course) {
        // TODO
        return false;
    }

    @Override
    public List<Course> getApprovedCourses() {
       //TODO
        return null;
    }
}
