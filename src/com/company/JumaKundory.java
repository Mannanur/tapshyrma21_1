package com.company;

public enum JumaKundory {

    MONDAY("Duishombu kunu"),
    TUESDAY("Sheishembi kunu"),
    WEDNESDAY("Sharshembi kunu"),
    THURSDAY("Beishembi kunu"),
    FRIDAY("Juma kunu"),
    SATURDAY("Ishembi kunu"),
    SUNDAY("Jekshembi kunu");





    private String name;

    JumaKundory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
