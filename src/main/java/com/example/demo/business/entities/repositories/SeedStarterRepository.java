package com.example.demo.business.entities.repositories;

import com.example.demo.business.entities.Feature;
import com.example.demo.business.entities.SeedStarter;
import com.example.demo.business.entities.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SeedStarterRepository {
    private final List<SeedStarter> seedStarters = new ArrayList<>();

    public SeedStarterRepository() {
        super();
        SeedStarter ss = new SeedStarter();
        ss.setCovered(true);
        ss.setDatePlanted(new Date());
        ss.setId(1);
        ss.setType(Type.PLASTIC);
        Feature[] features = {
                Feature.FERTILIZER
        };
        ss.setFeatures(features);
        seedStarters.add(ss);
    }

    public List<SeedStarter> findAll() {
        return new ArrayList<>(this.seedStarters);
    }

    public void add(final SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
}
