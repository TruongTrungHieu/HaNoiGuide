

package com.hou.hanoiguide.model;

/**
 * MS_Thoigian_hoatdong
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Thoigian_hoatdong {
    private String mId_tgHoatdong;
    private String mId_muasam;
    private String mId_thu;
    private String mId_thoigian;

    public MS_Thoigian_hoatdong() {
    }

    public MS_Thoigian_hoatdong(String mId_tgHoatdong, String mId_muasam, String mId_thu, String mId_thoigian) {
        this.mId_tgHoatdong = mId_tgHoatdong;
        this.mId_muasam = mId_muasam;
        this.mId_thu = mId_thu;
        this.mId_thoigian = mId_thoigian;
    }

    public String getmId_tgHoatdong() {
        return mId_tgHoatdong;
    }

    public void setmId_tgHoatdong(String mId_tgHoatdong) {
        this.mId_tgHoatdong = mId_tgHoatdong;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
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
    
    
}
