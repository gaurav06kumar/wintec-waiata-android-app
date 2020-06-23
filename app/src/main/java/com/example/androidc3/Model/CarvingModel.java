package com.example.androidc3.Model;

public class CarvingModel {
    private int id;
    private int image;
    private String name;
    private String description;
//getter setter of declared variables

    public CarvingModel(int id, String name, String description, int image) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

}
