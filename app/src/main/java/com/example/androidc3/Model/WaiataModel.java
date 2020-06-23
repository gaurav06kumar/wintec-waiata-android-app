package com.example.androidc3.Model;

public class WaiataModel {
    private int id;
    private int image;
    private String name;
    private String description;
    private String lyricseng;
    private String lyricsmaori;
    private String lyricsurdu;
    private int video, video1;
//getter setter of declared variables

    public WaiataModel(int id, int image, String name, String description, String lyricseng, String lyricsmaori, String lyricsurdu, int video, int video1) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.lyricseng= lyricseng;
        this.lyricsmaori = lyricsmaori;
        this.lyricsurdu = lyricsurdu;
        this.video = video;
        this.video1 = video1;
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

    public String getLyricsurdu() {
        return lyricsurdu;
    }

    public void setLyricsurdu(String lyricsurdu) {
        this.lyricsurdu = lyricsurdu;
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

    public int getVideo1() {
        return video1;
    }

    public void setVideo1(int video1) {
        this.video1 = video1;
    }
}
