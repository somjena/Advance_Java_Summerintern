package org.example.entity;

public class University {
    private String Uname;
    private String Ccode;

    public University() {
        System.out.println("University Object Created");
    }

    @Override
    public String toString() {
        return "University{" +
                "Uname='" + Uname + '\'' +
                ", Ccode='" + Ccode + '\'' +
                '}';
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getCcode() {
        return Ccode;
    }

    public void setCcode(String ccode) {
        Ccode = ccode;
    }
}
