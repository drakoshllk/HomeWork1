package org.future.code.homework;

public class Students {
    private String name;
    private int course;
    private boolean enlisted;
    private double GPA;

    Students(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    double getGPA() {
        return this.GPA = (double) Math.round((Math.random()*4+1)*100)/100;
    }

    int getCourse() {
        return course = (int) (Math.random()*4+1);
    }

    void setEnlisted(boolean enlisted) {
        this.enlisted = enlisted;
    }

}
