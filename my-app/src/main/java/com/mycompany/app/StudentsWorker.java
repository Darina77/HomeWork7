package com.mycompany.app;

import com.mycompany.app.dao.interfaces.StudentsDao;
import com.mycompany.app.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentsWorker
{
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }

    public Student getStudentFromDbById(int id)
    {
        Student student = studentsDao.getStudentById(id);
        System.out.println("Get student "+student);
        return student;
    }
}
