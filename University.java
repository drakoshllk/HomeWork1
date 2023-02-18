package org.future.code.homework;

public class University {
    public static void main(String[] args) {
        Teachers[] teachers = {new Teachers("Peter", "Math"),
                new Teachers("Dmitry", "Physics"),
                new Teachers("Alexander", "Geography")};
        for (int i = 0; i < teachers.length; i++) {
            System.out.println("Teacher: " + teachers[i].getName());
            System.out.println("Object: " + teachers[i].getObject());
            System.out.println("------------------");
            teachers[i].studentsInformation();
            if (i != teachers.length-1) System.out.println("__________________");
        }
    }
}
