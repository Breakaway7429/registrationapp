package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();

    //subscribeStudent
    public void subscribeStudent(Student student){

        students.put(student.getId(), student);

    }

    //findStudent
    public Student findStudent(String studentId) {
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }
        return null;
    }

    //enrollStudentToCourse
    public void enrolStudentToCourse(String studentId, Course course) {
        //must first check that the student exists before enrolling him/her to a course

        if (students.containsKey(studentId)) {
            students.get(studentId).enrollToCourses(course);
        }

    }

    public boolean isSubscribed(String studentId) {
        //TODO
        return students.containsKey(studentId);
    }

    public void showSummary() {
        //TODO
    }

}
