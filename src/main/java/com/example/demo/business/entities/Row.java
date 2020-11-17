package com.example.demo.business.entities;

public class Row {
    private Variety variety = null;
    private Integer seedsPerCell = null;

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Integer getSeedsPerCell() {
        return seedsPerCell;
    }

    public void setSeedsPerCell(Integer seedsPerCell) {
        this.seedsPerCell = seedsPerCell;
    }

    public Row() {
        super();
    }

    @Override
    public String toString() {
        return "Row [variety=" + this.variety + ", seedsPerCell=" + this.seedsPerCell + "]";
    }

}
