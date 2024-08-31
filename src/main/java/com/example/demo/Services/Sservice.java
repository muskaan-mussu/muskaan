package com.example.demo.Services;

import com.example.demo.Model.Smodel;
import com.example.demo.Repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

public class Sservice {
    @Autowired
    repo repository;
    public List<Smodel> getAllStudents()
    {
        List<Smodel> StudentModel=new ArrayList<>();
        repository.findAll().forEach(kk ->StudentModel.add(kk));
        return StudentModel;
    }
    public void saveOrUpdate(Smodel model){repository.save(model);}

    public void delete(int id){repository.deleteById(id);
    }
    public Smodel getStudentById(int id){
      return  repository.findById(id).get();
    }

}
