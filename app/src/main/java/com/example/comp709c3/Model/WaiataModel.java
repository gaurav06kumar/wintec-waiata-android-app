package com.example.comp709c3.Model;

public class WaiataModel {
    private int image;
    private String name;
    private String description;
    private String Abilities;
    private String Combo;
//getter setter of declared variables

    public WaiataModel(int image, String name, String description, String Abilities, String Combo) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.Abilities= Abilities;
        this.Combo = Combo;
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

    public String getAbilities() {
        return Abilities;
    }

    public void setAbilities(String abilities) {
        Abilities = abilities;
    }

    public String getCombo() {
        return Combo;
    }

    public void setCombo(String combo) {
        Combo = combo;
    }
}
