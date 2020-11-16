package com.example.demo.entities.repositories;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.SeedStarter;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeedStarterRepository {
    private final List<SeedStarter> seedStarters = new ArrayList<>();

    public SeedStarterRepository() {
        super();
    }

    public List<SeedStarter> findAll() {
        return new ArrayList<>(this.seedStarters);
    }

    public void add(final SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
}
