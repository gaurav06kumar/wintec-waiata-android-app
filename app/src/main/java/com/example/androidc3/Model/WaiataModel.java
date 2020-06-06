package com.example.androidc3.Model;

public class WaiataModel {
    private int id;
    private int image;
    private String name;
    private String description;
    private String lyricseng;
    private String lyricsmaori;
    private int video;
//getter setter of declared variables

    public WaiataModel(int id, int image, String name, String description, String lyricseng, String lyricsmaori, int video) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.lyricseng= lyricseng;
        this.lyricsmaori = lyricsmaori;
        this.video = video;
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

    public String getLyricseng() {
        return lyricseng;
    }

    public void setLyricseng(String lyricseng) {
        this.lyricseng = lyricseng;
    }

    public String getLyricsmaori() {
        return lyricsmaori;
    }

    public void setLyricsmaori(String lyricsmaori) {
        this.lyricsmaori = lyricsmaori;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }
}
