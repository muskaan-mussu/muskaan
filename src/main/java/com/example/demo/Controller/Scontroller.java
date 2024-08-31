package com.example.demo.Controller;

import com.example.demo.Model.Smodel;
import com.example.demo.Services.Sservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Scontroller {
    @Autowired                                    //without using new keyword it creates a object
    Sservice ser;

    @GetMapping("/getAll")
    private List<Smodel> getAllStudents(){
        return ser.getAllStudents();
    }
    @PostMapping("/saving")
    private String saveOrUpdate(@RequestBody Smodel model)
    {
      ser.saveOrUpdate(model);
         return model.getName();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") int id){
        ser.delete(id);
    }

    @GetMapping("/getStudent/{id}")
    private Smodel getStudent(@PathVariable("id") int id)
    {
        return ser.getStudentById(id);
    }
}
