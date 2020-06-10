package com.github.enesusta.mockrest.human.service;

import com.github.enesusta.mockrest.human.Human;
import com.github.enesusta.mockrest.human.exception.HumanNotFoundException;

import java.util.List;

public interface HumanService {
    List<Human> getAll() throws HumanNotFoundException;
    List<Human> findByName(String name);
}
