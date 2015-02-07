
package com.hou.hanoiguide.model;

/**
 * KS_Chitietks
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Chitietks {
    private String mId_img;
    private String mId_khachsan;
    private String mMota;

    public KS_Chitietks() {
    }

    public KS_Chitietks(String mId_img, String mId_khachsan, String mMota) {
        this.mId_img = mId_img;
        this.mId_khachsan = mId_khachsan;
        this.mMota = mMota;
    }

    public String getmId_img() {
        return mId_img;
    }

    public void setmId_img(String mId_img) {
        this.mId_img = mId_img;
    }

    public String getmId_khachsan() {
        return mId_khachsan;
    }

    public void setmId_khachsan(String mId_khachsan) {
        this.mId_khachsan = mId_khachsan;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
