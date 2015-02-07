
package com.hou.hanoiguide.model;

/**
 * DD_Chitietdv
 Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 
 */

public class DD_Chitietdv {
    private String mId_dv;
    private String mId_loaive;
    private String mGia;

    public DD_Chitietdv() {
    }

    public DD_Chitietdv(String mId_dv, String mId_loaive, String mGia) {
        this.mId_dv = mId_dv;
        this.mId_loaive = mId_loaive;
        this.mGia = mGia;
    }

    public String getmId_dv() {
        return mId_dv;
    }

    public void setmId_dv(String mId_dv) {
        this.mId_dv = mId_dv;
    }

    public String getmId_loaive() {
        return mId_loaive;
    }

    public void setmId_loaive(String mId_loaive) {
        this.mId_loaive = mId_loaive;
    }

    public String getmGia() {
        return mGia;
    }

    public void setmGia(String mGia) {
        this.mGia = mGia;
    }
    
    
}
