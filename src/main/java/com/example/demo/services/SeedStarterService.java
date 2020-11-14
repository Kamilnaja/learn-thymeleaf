package com.example.demo.services;

import com.example.demo.entities.SeedStarter;
import com.example.demo.entities.repositories.SeedStarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeedStarterService {

    @Autowired
    private SeedStarterRepository seedStarterRepository;

    public List<SeedStarter> findAll() {
        return this.seedStarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedStarterRepository.add(seedStarter);
    }
}
