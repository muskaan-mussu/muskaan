package com.example.demo.Repository;

import com.example.demo.Model.Smodel;
import org.springframework.data.repository.CrudRepository;

public interface repo extends CrudRepository<Smodel,Integer> {
}