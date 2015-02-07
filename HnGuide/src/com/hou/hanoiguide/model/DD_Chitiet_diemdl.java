

package com.hou.hanoiguide.model;

/**
 * DD_Chitiet_diemdl
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Chitiet_diemdl {
    private String mId_diemDL;
    private String mImg;
    private String mAudio;
    private String mGhichu;

    public DD_Chitiet_diemdl() {
    }

    public DD_Chitiet_diemdl(String mId_diemDL, String mImg, String mAudio, String mGhichu) {
        this.mId_diemDL = mId_diemDL;
        this.mImg = mImg;
        this.mAudio = mAudio;
        this.mGhichu = mGhichu;
    }

    public String getmId_diemDL() {
        return mId_diemDL;
    }

    public void setmId_diemDL(String mId_diemDL) {
        this.mId_diemDL = mId_diemDL;
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
