package com.hou.hanoiguide;

/**
 * Mytour_details
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */

public class Mytour_details {
    private String mId_mytour;
    private String mId_diemden;
    private String mMota;
    private String mThoigian;
    private int mSothutu;
    private String mId_mytour_details;

    public Mytour_details() {
    }

    public Mytour_details(String mId_mytour, String mId_diemden, String mMota, String mThoigian, int mSothutu, String mId_mytour_details) {
        this.mId_mytour = mId_mytour;
        this.mId_diemden = mId_diemden;
        this.mMota = mMota;
        this.mThoigian = mThoigian;
        this.mSothutu = mSothutu;
        this.mId_mytour_details = mId_mytour_details;
    }

    public String getmId_mytour() {
        return mId_mytour;
    }

    public void setmId_mytour(String mId_mytour) {
        this.mId_mytour = mId_mytour;
    }

    public String getmId_diemden() {
        return mId_diemden;
    }

    public void setmId_diemden(String mId_diemden) {
        this.mId_diemden = mId_diemden;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }

    public String getmThoigian() {
        return mThoigian;
    }

    public void setmThoigian(String mThoigian) {
        this.mThoigian = mThoigian;
    }

    public int getmSothutu() {
        return mSothutu;
    }

    public void setmSothutu(int mSothutu) {
        this.mSothutu = mSothutu;
    }

    public String getmId_mytour_details() {
        return mId_mytour_details;
    }

    public void setmId_mytour_details(String mId_mytour_details) {
        this.mId_mytour_details = mId_mytour_details;
    }
    
    
}
