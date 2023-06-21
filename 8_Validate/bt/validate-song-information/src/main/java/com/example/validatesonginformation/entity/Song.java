package com.example.validatesonginformation.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Ten bai hat khong duoc de trong")
    @Size(max = 800, message = "khong duoc vuot qua 800 ky tu")
    @Pattern(regexp =  "^[a-zA-Z0-9]+$", message = "khong chua cac ky tu dac biet")
    private String tenBaiHat;
    @NotBlank(message = "Nghe si the hien khong duoc de trong")
    @Size(max = 300, message = "khong duoc vuot qua 300 ky tu")
    @Pattern(regexp =  "^[a-zA-Z0-9]+$", message = "khong chua cac ky tu dac biet")
    private String ngheSiTheHien;
    @NotBlank(message = "The loai nhac khong duoc de trong")
    @Size(max = 1000, message = "khong duoc vuot qua 100 ky tu")
    @Pattern(regexp =  "^[a-zA-Z0-9,]+$", message = "khong chua cac ky tu dac biet ngoai tru dau , ")
    private String theLoaiNhac;

    public Song() {
    }

    public Song(int id, String tenBaiHat, String ngheSiTheHien, String theLoaiNhac) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.ngheSiTheHien = ngheSiTheHien;
        this.theLoaiNhac = theLoaiNhac;
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
}


