package com.sample.Student.service;

import com.sample.Student.entity.Students;
import com.sample.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Students save(Students students){
        return repo.save(students);
    }
    public List<Students> listAll(){
        return repo.findAll();
    }
}
