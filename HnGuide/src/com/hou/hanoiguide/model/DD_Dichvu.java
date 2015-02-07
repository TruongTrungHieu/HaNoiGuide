
package com.hou.hanoiguide.model;

/**
 * DD_Dichvu
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Dichvu {
    private String mId_dv;
    private String mTendv;
    private String mId_diemDL;
    private String mMota;

    public DD_Dichvu() {
    }

    public DD_Dichvu(String mId_dv, String mTendv, String mId_diemDL, String mMota) {
        this.mId_dv = mId_dv;
        this.mTendv = mTendv;
        this.mId_diemDL = mId_diemDL;
        this.mMota = mMota;
    }

    public String getmId_dv() {
        return mId_dv;
    }

    public void setmId_dv(String mId_dv) {
        this.mId_dv = mId_dv;
    }

    public String getmTendv() {
        return mTendv;
    }

    public void setmTendv(String mTendv) {
        this.mTendv = mTendv;
    }

    public String getmId_diemDL() {
        return mId_diemDL;
    }

    public void setmId_diemDL(String mId_diemDL) {
        this.mId_diemDL = mId_diemDL;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
