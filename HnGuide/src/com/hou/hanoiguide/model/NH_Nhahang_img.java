package com.hou.hanoiguide.model;

/**
 * NH_Nhahang_img
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Nhahang_img {
    private String mId_nhahang;
    private String mImg;
    private String mAudio;
    private String mGhichu;
    
    public NH_Nhahang_img() {
        
    }

    public NH_Nhahang_img(String mId_nhahang, String mImg, String mAudio, String mGhichu) {
        this.mId_nhahang = mId_nhahang;
        this.mImg = mImg;
        this.mAudio = mAudio;
        this.mGhichu = mGhichu;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmImg() {
        return mImg;
    }

    public void setmImg(String mImg) {
        this.mImg = mImg;
    }

    public String getmAudio() {
        return mAudio;
    }

    public void setmAudio(String mAudio) {
        this.mAudio = mAudio;
    }

    public String getmGhichu() {
        return mGhichu;
    }

    public void setmGhichu(String mGhichu) {
        this.mGhichu = mGhichu;
    }
    
    
}
