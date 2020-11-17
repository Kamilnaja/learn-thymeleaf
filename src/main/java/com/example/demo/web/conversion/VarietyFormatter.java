package com.example.demo.web.conversion;

import com.example.demo.business.entities.Variety;
import com.example.demo.business.services.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class VarietyFormatter implements Formatter<Variety> {
    @Autowired
    VarietyService varietyService;

    public VarietyFormatter() {
        super();
    }

    @Override
    public Variety parse(final String text, final Locale locale) throws ParseException {
        final Integer varietyId = Integer.valueOf(text);
        return this.varietyService.findById(varietyId);
    }

    @Override
    public String print(final Variety object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
}
