package com.example.demo.business.services;

import com.example.demo.business.entities.Variety;
import com.example.demo.business.entities.repositories.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyService {
    @Autowired
    VarietyRepository varietyRepository;

    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Variety findById( final Integer id) {
        return this.varietyRepository.findById(id);
    }
}
