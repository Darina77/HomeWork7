package com.mycompany.app;

import com.mycompany.app.dao.interfaces.LecturesDao;
import com.mycompany.app.entities.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }

    public List<Lecture> getAllLectors()
    {
        List<Lecture> lectors = lecturesDao.getAll();
        for (Lecture l: lectors)
        {
            System.out.println(l);
        }
        return lectors;
    }

    public List<Lecture> getLectureWithName()
    {
        List<Lecture> lectors = lecturesDao.getLectureWithName();
        for (Lecture l: lectors)
        {
            System.out.println(l);
        }
        return lectors;
    }

    public List<Lecture> getLecturesByName(String name)
    {
        List<Lecture> lectors = lecturesDao.getLectureByName(name);
        for (Lecture l: lectors)
        {
            System.out.println(l);
        }
        return lectors;
    }

    public List<Lecture> getLecturesById(int id)
    {
        List<Lecture> lectors = lecturesDao.getLectureById(id);
        for (Lecture l: lectors)
        {
            System.out.println(l);
        }
        return lectors;
    }
}

