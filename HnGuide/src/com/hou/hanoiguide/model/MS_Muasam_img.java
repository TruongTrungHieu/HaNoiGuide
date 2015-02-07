

package com.hou.hanoiguide.model;

/**
 * MS_Muasam_img
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Muasam_img {
    private String mImg;
    private String mId_muasam;
    private String mAudio;
    private String mGhichu;

    public MS_Muasam_img() {
    }

    public MS_Muasam_img(String mImg, String mId_muasam, String mAudio, String mGhichu) {
        this.mImg = mImg;
        this.mId_muasam = mId_muasam;
        this.mAudio = mAudio;
        this.mGhichu = mGhichu;
    }

    public String getmImg() {
        return mImg;
    }

    public void setmImg(String mImg) {
        this.mImg = mImg;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
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
