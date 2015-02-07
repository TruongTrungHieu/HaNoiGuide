package com.hou.hanoiguide;

/**
 * NH_Nhahang_img
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Nhahang_loai {
    private String mId_nhahang;
    private String mId_chitiet_dmloai;
    
    public NH_Nhahang_loai() {
        
    }

    public NH_Nhahang_loai(String mId_nhahang, String mId_chitiet_dmloai) {
        this.mId_nhahang = mId_nhahang;
        this.mId_chitiet_dmloai = mId_chitiet_dmloai;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmId_chitiet_dmloai() {
        return mId_chitiet_dmloai;
    }

    public void setmId_chitiet_dmloai(String mId_chitiet_dmloai) {
        this.mId_chitiet_dmloai = mId_chitiet_dmloai;
    }
    
    
}
