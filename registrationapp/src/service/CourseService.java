package service;

import model.Course;
import model.Student;
import model.Module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService {

    private final Map<String, Course> courses = new HashMap<>(); //stores the list of courses in the app

    private final Map<String, List<Student>> enrolledStudents = new HashMap<>();  //stores list of students in the app

    public CourseService() {            //empty constructor

        Module module = new Module("INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs");
        registerCourse(new Course("INTRO-CS-1", "Introduction to Computer Science", 9, module));
        registerCourse(new Course("INTRO-CS-2", "Introduction to Algorithms", 9, module));
        registerCourse(new Course("INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ", 9, module));
        registerCourse(new Course("INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced", 9, module));
        registerCourse(new Course("INTRO-CS-5", "Terminal Fundamentals", 9, module));
        registerCourse(new Course("INTRO-CS-6", "Source Control Using Git and Github", 9, module));
        registerCourse(new Course("INTRO-CS-7", "Agile Software Development with SCRUM", 9, module));

        Module moduleWebFundamentals = new Module("INTRO-WEB", "Web Development Fundamentals",
                "Introduction to fundamentals of web development");
        registerCourse(new Course("INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals));
        registerCourse(new Course("INTRO-WEB-2", "Introduction to HTML", 9, moduleWebFundamentals));
        registerCourse(new Course("INTRO-WEB-3", "Introduction to CSS", 9, moduleWebFundamentals));
        registerCourse(new Course("INTRO-WEB-4", "Advanced HTML", 9, moduleWebFundamentals));
        registerCourse(new Course("INTRO-WEB-5", "Advanced CSS", 9, moduleWebFundamentals));
        registerCourse(new Course("INTRO-WEB-6", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals));
        registerCourse(
                new Course("INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals));

    }

    public void registerCourse(Course course) {

        courses.put(course.getCode(), course);      //store a course into courses by key: course.code, value: course

    }

    //getting a course

    public Course getCourse(String code) {
        if (courses.containsKey(code))
            return courses.get(code);
        return null;
    }

    //enroll a student

    public void enrollStudent(String courseId, Student student) {
        //how to save the course and the student enrolled into a course
        //enroll a student to a course.
        //if courseID is not found in enrollStudent
        //put (add) the course ID to enrollStudents, and instantiate a new ArrayList
        //thereafter, we add teh student to the ArrayList after getting the courseId
        if (!courses.containsKey(courseId)) {
            enrolledStudents.put(courseId, new ArrayList<>());
        }
        enrolledStudents.get(courseId).add(student);
    }

    //show all enrolled students
    //if key courseId exists in enrolledStudents
    //get all the students as a List
    //iterate thru the list
    //print each student info
    public void showEnrolledStudents(String courseId) {
        if (enrolledStudents.containsKey(courseId)) {
            List<Student> students = enrolledStudents.get(courseId);
            students.forEach(student -> {
                System.out.println(student);
            });
        }
    }

    //show summary of courses and enrolled students
    //iterate thru the courses key
    //get each course by its key and store it to local variable course
    //print the course retrieved from each key
    public void showSummary() {
        System.out.println("Available Courses:");
        for (String key : courses.keySet()) {
            Course course = courses.get(key);
            System.out.println(course);
        }

        //iterate thru the courses found in enrolledStudents
        //store the students from each key (courseId)
        //iterate thru the returned students by its courseId
        //print out the student
        System.out.println("Enrolled Students: ");
        for (String key : enrolledStudents.keySet()) {
            List<Student> students = enrolledStudents.get(key);

            System.out.println("Students in Course Code: " + key);
            for (Student student : students) {
                System.out.println(student);
            }

        }

    }
}