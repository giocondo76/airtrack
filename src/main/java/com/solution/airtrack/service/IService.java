package com.solution.airtrack.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IService<T> {

    List<T> getAll();
    T getById(Integer id);
    T save(T t);
    T remove(T t);
}
