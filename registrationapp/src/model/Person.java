package model;

import java.util.Date;

/**
 * person class is an abstract class
 * as an abstract class, i should not be able to
 * create an instance out of it
 * as the attributes are set to final (immutable)
 * we will need to create constructors for each attribute
 */

public abstract class Person {

    private final String id;

    private final String name;

    private final String email;

    private final Date DOB;


    public Person(String id, String name, String email, Date DOB) {    //overloaded constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
    }

    //getters and setters (cus no direct access to properties


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDOB() {
        return DOB;
    }



    //toString is a built in method(right click > generate>toString)
    //so need to use the annotation @Override to override default implementation
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
