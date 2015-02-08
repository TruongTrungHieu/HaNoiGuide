package com.hou.hanoiguide.model;

/**
 * NH_Thoigian_hoatdong
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Thoigian_hoatdong {
    private String mId_tgHoatdong;
    private String mId_nhahang;
    private String mId_thu;
    private String mId_thoigian;
    private String mMota;
    
    public NH_Thoigian_hoatdong() {
        
    }

    public NH_Thoigian_hoatdong(String mId_tgHoatdong, String mId_nhahang, String mId_thu, String mId_thoigian, String mMota) {
        this.mId_tgHoatdong = mId_tgHoatdong;
        this.mId_nhahang = mId_nhahang;
        this.mId_thu = mId_thu;
        this.mId_thoigian = mId_thoigian;
        this.mMota = mMota;
    }

    public String getmId_tgHoatdong() {
        return mId_tgHoatdong;
    }

    public void setmId_tgHoatdong(String mId_tgHoatdong) {
        this.mId_tgHoatdong = mId_tgHoatdong;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmId_thu() {
        return mId_thu;
    }

    public void setmId_thu(String mId_thu) {
        this.mId_thu = mId_thu;
    }

    public String getmId_thoigian() {
        return mId_thoigian;
    }

    public void setmId_thoigian(String mId_thoigian) {
        this.mId_thoigian = mId_thoigian;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
