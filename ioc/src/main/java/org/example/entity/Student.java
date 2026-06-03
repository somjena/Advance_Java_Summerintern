package org.example.entity;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private University university;


    public Student() {
        System.out.println("Created By Spring");
    }

    public void dispayinfo(){
        System.out.println("id = :"+id);
        System.out.println("name = :"+name);
        System.out.println(university);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
