package com.ics.demo.models;

public class MockLecturer {

    private long id;
    private  String name;

    private  MockLecturer(){

    }

    public MockLecturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MockLecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
