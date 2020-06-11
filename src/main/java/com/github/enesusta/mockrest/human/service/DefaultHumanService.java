package com.github.enesusta.mockrest.human.service;

import com.github.enesusta.mockrest.human.Human;
import com.github.enesusta.mockrest.human.exception.HumanNotFoundException;
import com.github.enesusta.mockrest.human.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultHumanService implements HumanService {

    @Autowired
    HumanRepository humanRepository;

    @Override
    public List<Human> getAll() throws HumanNotFoundException {
        return humanRepository.getAll().orElseThrow(HumanNotFoundException::new);
    }

    @Override
    public List<Human> findByName(String name) {
        return humanRepository.findByName(name);
    }
}
