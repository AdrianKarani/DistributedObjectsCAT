package com.ics.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class MockStudent {

    private String studentnumber;
    private String firstName;
    private String gender;

    public MockStudent() {}

    public MockStudent(String studentnumber, String firstName, String gender) {
        this.studentnumber = studentnumber;
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getStudentnumber() {
        return studentnumber;
    }
    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MockStudent{" +
                "studentnumber='" + studentnumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
