package com.example.music_player_app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicPlayer {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "tenBaiHat", columnDefinition = "nvarchar(100)")
    private String tenBaiHat;
    @Column(name = "ngheSiTheHien", columnDefinition = "nvarchar(100)")
    private String ngheSiTheHien;
    private String theLoaiNhac;
    private String duongDanFileBaiHat;


    public MusicPlayer() {
    }

    public MusicPlayer(int id, String tenBaiHat, String ngheSiTheHien, String theLoaiNhac, String duongDanFileBaiHat) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.ngheSiTheHien = ngheSiTheHien;
        this.theLoaiNhac = theLoaiNhac;
        this.duongDanFileBaiHat = duongDanFileBaiHat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getNgheSiTheHien() {
        return ngheSiTheHien;
    }

    public void setNgheSiTheHien(String ngheSiTheHien) {
        this.ngheSiTheHien = ngheSiTheHien;
    }

    public String getTheLoaiNhac() {
        return theLoaiNhac;
    }

    public void setTheLoaiNhac(String theLoaiNhac) {
        this.theLoaiNhac = theLoaiNhac;
    }

    public String getDuongDanFileBaiHat() {
        return duongDanFileBaiHat;
    }

    public void setDuongDanFileBaiHat(String duongDanFileBaiHat) {
        this.duongDanFileBaiHat = duongDanFileBaiHat;
    }
}
