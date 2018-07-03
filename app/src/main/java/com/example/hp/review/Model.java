package com.example.hp.review;

public class Model {
    int img_user,img_mov;
    String username,moviename,locname,movlang,movdim,movrate,movgenre,numwatch,numrev;

    public Model(int img_user, int img_mov, String username, String moviename, String locname, String movlang, String movdim,String movrate, String movgenre, String numwatch, String numrev) {
        this.img_user = img_user;
        this.img_mov = img_mov;
        this.username = username;
        this.moviename = moviename;
        this.locname = locname;
        this.movlang = movlang;
        this.movdim = movdim;
        this.movrate=movrate;
        this.movgenre = movgenre;
        this.numwatch = numwatch;
        this.numrev = numrev;
    }

    public int getImg_user() {
        return img_user;
    }

    public int getImg_mov() {
        return img_mov;
    }

    public String getUsername() {
        return username;
    }

    public String getMoviename() {
        return moviename;
    }

    public String getLocname() {
        return locname;
    }

    public String getMovlang() {
        return movlang;
    }

    public String getMovdim() {
        return movdim;
    }

    public String getMovgenre() {
        return movgenre;
    }

    public String getNumwatch() {
        return numwatch;
    }

    public String getNumrev() {
        return numrev;
    }

    public String getMovrate() {
        return movrate;
    }
}
