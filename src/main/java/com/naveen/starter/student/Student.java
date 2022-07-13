package com.naveen.starter.student;

import java.time.LocalDate;

public class Student {

    private long id;
    private String name;
    private String email;
    private LocalDate DOB;
    private int age;

    public Student() {
    }

    public Student(long id, String name, String email, LocalDate DOB, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public Student(String name, String email, LocalDate DOB, int age) {
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", age=" + age +
                '}';
    }
}
