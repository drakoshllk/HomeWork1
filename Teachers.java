package org.future.code.homework;

public class Teachers {
    private String name;
    private String object;
    Teachers(String name, String object) {
        this.name = name;
        this.object = object;
    }

    String getName() {
        return this.name;
    }

    String getObject() {
        return this.object;
    }

    Students[] students = {new Students("Boris"),
            new Students("Maksim"),
            new Students("Artem")};


    void studentsInformation() {
        for (int i = 0; i < this.students.length; i++) {
            System.out.println("Student " + this.students[i].getName());
            System.out.println("GPA: " + this.students[i].getGPA());
            int enrolled = (int) (Math.random()*2+1);
            if (enrolled == 1) {
                students[i].setEnlisted(true);
                System.out.println("Enlisted");
                System.out.println("Course: " + this.students[i].getCourse());
            } else {
                students[i].setEnlisted(false);
                System.out.println("not enrolled");
            }
            if (i != this.students.length-1) System.out.println();
        }
    }
}
