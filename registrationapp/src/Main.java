import model.Person;
import model.Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Student A", "studentA.email.com", new Date("11/22/2003"));
        System.out.println(student1);

        Student student2 = new Student(2, "Student B", "studentB.email.com", new Date("12/12/2003"), 3.5);
        System.out.println(student2);

        //printe out only the average gpa of the student n no other value
        System.out.println(student2.getAverage());

        //change the average gpa of student 2
        student2.setAverage(3.2);
        System.out.println(student2.getAverage());
    }

}