package com.mycompany.app.dao.interfaces;

import com.mycompany.app.entities.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
