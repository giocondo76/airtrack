package com.solution.airtrack.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Controller
public interface IService<T> {

    List<T> getAll();
    T getById(Long id);
    T save(T t);
    T remove(T t);
}
