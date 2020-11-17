package com.example.demo.business.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SeedStarter {
    private Integer id = null;
    private Date datePlanted = null;
    private Boolean covered = null;
    private Type type = Type.PLASTIC;
    private Feature[] features = null;

    private List<Row> rows = new ArrayList<Row>();

    public SeedStarter() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(Date datePlanted) {
        this.datePlanted = datePlanted;
    }

    public Boolean getCovered() {
        return covered;
    }

    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "SeedStarter [id=" + this.id + ", datePlanted=" + this.datePlanted
                + ", covered=" + this.covered + ", type=" + this.type + ", features="
                + Arrays.toString(this.features) + ", rows=" + this.rows + "]";
    }
}
