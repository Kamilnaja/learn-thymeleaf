package com.example.demo.business.entities;

import java.util.Calendar;

public class Customer {
    private Integer id = null;
    private String name = null;
    private Calendar customerSince = null;

    public Customer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Calendar customerSince) {
        this.customerSince = customerSince;
    }
}
