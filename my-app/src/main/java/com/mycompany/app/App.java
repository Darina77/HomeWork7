package com.mycompany.app;


import com.mycompany.app.entities.*;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        CacheManager cm = new CacheManager();
        Cache cache = cm.getCache("studentsCache");
        System.out.println(cache.getName());
        System.out.println(cache.getDiskStoreSize());
        StudentsWorker worker = (StudentsWorker)context.getBean("worker");
        Student student = worker.getStudentFromDbById(1);
        System.out.println(student);
        student = worker.getStudentFromDbById(1);
        System.out.println(student);

        Lecture lecture = new Lecture();
        lecture.setName("Name");
        lecture.setCredits(2.5);
        LecturesWorker worker1 = (LecturesWorker)context.getBean("worker1");
        worker1.addLecture(lecture);
        worker1.getAllLectors();
        worker1.getLectureWithName();
        worker1.getLecturesByName("Name");
        worker1.getLecturesById(1);
    }

}
