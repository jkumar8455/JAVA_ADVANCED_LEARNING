package com.jkc;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Student student=new Student(1,"Nipun");
        student.insertData();
        Student.readData();
        student.setName("Jitendra");
        student.updateDate();
        Student.readData();
        student.deleteData();
        Student.readData();
    }
}
