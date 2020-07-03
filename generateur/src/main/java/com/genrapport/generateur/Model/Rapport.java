package com.genrapport.generateur.Model;

public class Rapport {
    
    private int id;
    private String name;

    public Rapport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rapport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
}