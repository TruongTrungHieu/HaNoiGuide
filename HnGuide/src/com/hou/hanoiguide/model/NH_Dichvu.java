package com.hou.hanoiguide.model;

/**
 * NH_Dichvu
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Dichvu {
    private String mId_dichvu;
    private String mId_nhahang;
    private String mId_dm_dichvu;
    private String mKhoanggia;
    private String mMota;
    
    public NH_Dichvu() {
        
    }

    public NH_Dichvu(String mId_dichvu, String mId_nhahang, String mId_dm_dichvu, String mKhoanggia, String mMota) {
        this.mId_dichvu = mId_dichvu;
        this.mId_nhahang = mId_nhahang;
        this.mId_dm_dichvu = mId_dm_dichvu;
        this.mKhoanggia = mKhoanggia;
        this.mMota = mMota;
    }

    public String getmId_dichvu() {
        return mId_dichvu;
    }

    public void setmId_dichvu(String mId_dichvu) {
        this.mId_dichvu = mId_dichvu;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmId_dm_dichvu() {
        return mId_dm_dichvu;
    }

    public void setmId_dm_dichvu(String mId_dm_dichvu) {
        this.mId_dm_dichvu = mId_dm_dichvu;
    }

    public String getmKhoanggia() {
        return mKhoanggia;
    }

    public void setmKhoanggia(String mKhoanggia) {
        this.mKhoanggia = mKhoanggia;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
