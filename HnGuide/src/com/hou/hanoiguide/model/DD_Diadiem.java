

package com.hou.hanoiguide.model;

/**
 * DD_Diadiem
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Diadiem {
    private String mId_diemdulich;
    private String mTen_diemdulich;
    private String mDiachi;
    private String mDienthoai;
    private String mEmail;
    private String mWebsite;
    private String mNguoilienhe;
    private String mHuongdandulich;
    private String mMota;
    private String mChitiet;
    private String mLocation;

    public DD_Diadiem() {
    }

    public DD_Diadiem(String mId_diemdulich, String mTen_diemdulich, String mDiachi, String mDienthoai, String mEmail, String mWebsite, String mNguoilienhe, String mHuongdandulich, String mMota, String mChitiet, String mLocation) {
        this.mId_diemdulich = mId_diemdulich;
        this.mTen_diemdulich = mTen_diemdulich;
        this.mDiachi = mDiachi;
        this.mDienthoai = mDienthoai;
        this.mEmail = mEmail;
        this.mWebsite = mWebsite;
        this.mNguoilienhe = mNguoilienhe;
        this.mHuongdandulich = mHuongdandulich;
        this.mMota = mMota;
        this.mChitiet = mChitiet;
        this.mLocation = mLocation;
    }

    public String getmId_diemdulich() {
        return mId_diemdulich;
    }

    public void setmId_diemdulich(String mId_diemdulich) {
        this.mId_diemdulich = mId_diemdulich;
    }

    public String getmTen_diemdulich() {
        return mTen_diemdulich;
    }

    public void setmTen_diemdulich(String mTen_diemdulich) {
        this.mTen_diemdulich = mTen_diemdulich;
    }

    public String getmDiachi() {
        return mDiachi;
    }

    public void setmDiachi(String mDiachi) {
        this.mDiachi = mDiachi;
    }

    public String getmDienthoai() {
        return mDienthoai;
    }

    public void setmDienthoai(String mDienthoai) {
        this.mDienthoai = mDienthoai;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public String getmNguoilienhe() {
        return mNguoilienhe;
    }

    public void setmNguoilienhe(String mNguoilienhe) {
        this.mNguoilienhe = mNguoilienhe;
    }

    public String getmHuongdandulich() {
        return mHuongdandulich;
    }

    public void setmHuongdandulich(String mHuongdandulich) {
        this.mHuongdandulich = mHuongdandulich;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }

    public String getmChitiet() {
        return mChitiet;
    }

    public void setmChitiet(String mChitiet) {
        this.mChitiet = mChitiet;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }
    
    
}
