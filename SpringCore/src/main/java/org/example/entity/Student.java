package org.example.entity;

public class Student {
    private int id;
    String name;
    private University univ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniv() {
        return univ;
    }

    public void setUniv(University univ) {
        this.univ = univ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", univ=" + univ +
                '}';
    }
}
