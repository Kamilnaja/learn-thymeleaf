package com.example.demo.web.controller;

import com.example.demo.business.entities.Feature;
import com.example.demo.business.entities.SeedStarter;
import com.example.demo.business.entities.Type;
import com.example.demo.business.entities.Variety;
import com.example.demo.business.services.SeedStarterService;
import com.example.demo.business.services.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Controller
public class SeedStarterMngController {

    @Autowired
    private VarietyService varietyService;

    @Autowired
    private SeedStarterService seedStarterService;

    public SeedStarterMngController() {
        super();
    }

    @ModelAttribute("allTypes")
    public List<Type> popularTypes() {
        return Arrays.asList(Type.ALL);
    }

    @ModelAttribute("allFeatures")
    public List<Feature> popularFeatures() {
        return Arrays.asList(Feature.ALL);
    }

    @ModelAttribute("allVarietes")
    public List<Variety> popularVarietes() {
        return this.varietyService.findAll();
    }

    @ModelAttribute("allSeedStarters")
    public List<SeedStarter> popularSeedStarters() {
        return seedStarterService.findAll();
    }

    @GetMapping()
    public String showSeedstarters(final SeedStarter seedStarter) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        return "seedstartermng";
    }
}
