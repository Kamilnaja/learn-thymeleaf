package com.example.demo.web.controller;

import com.example.demo.entities.Feature;
import com.example.demo.entities.SeedStarter;
import com.example.demo.entities.Type;
import com.example.demo.entities.Variety;
import com.example.demo.services.SeedStarterService;
import com.example.demo.services.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping({"/", "/seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        return "seedstartermng";
    }
}
