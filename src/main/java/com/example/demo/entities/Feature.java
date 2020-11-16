package com.example.demo.entities;

public enum Feature {
    SEEDSTARTER_SPECIFIC_SUBSTRATE("SEEDSTARTER_SPECIFIC_SUBSTRATE"),
    FERTILIZER("FERTILIZER"),
    PH_CORRECTOR("PH_CORRECTOR");

    public static final Feature[] ALL = {SEEDSTARTER_SPECIFIC_SUBSTRATE, FERTILIZER, PH_CORRECTOR};

    private final String name;

    Feature(final String name) {
        this.name = name;
    }

    public static Feature forName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null for feature");
        }
        switch (name.toUpperCase()) {
            case "SEEDSTARTER_SPECIFIC_SUBSTRATE":
                return SEEDSTARTER_SPECIFIC_SUBSTRATE;
            case "FERTILIZER":
                return FERTILIZER;
            case "PH_CORRECTOR":
                return PH_CORRECTOR;
        }
        throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Feature");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
