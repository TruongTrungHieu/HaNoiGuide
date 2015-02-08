
package com.hou.hanoiguide.model;

/**
 * NH_Chitiet_dm_loainhahang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:35
 */
public class NH_Chitiet_dm_loainhahang {
    private String mId_chitet_dmloai;
    private String mTenchitiet_dmloai;
    private String mIcon;
    private String mId_dm_loai;
    
    public NH_Chitiet_dm_loainhahang() {
        
    }

    public NH_Chitiet_dm_loainhahang(String mId_chitet_dmloai, String mTenchitiet_dmloai, String mIcon, String mId_dm_loai) {
        this.mId_chitet_dmloai = mId_chitet_dmloai;
        this.mTenchitiet_dmloai = mTenchitiet_dmloai;
        this.mIcon = mIcon;
        this.mId_dm_loai = mId_dm_loai;
    }

    public String getmId_chitet_dmloai() {
        return mId_chitet_dmloai;
    }

    public void setmId_chitet_dmloai(String mId_chitet_dmloai) {
        this.mId_chitet_dmloai = mId_chitet_dmloai;
    }

    public String getmTenchitiet_dmloai() {
        return mTenchitiet_dmloai;
    }

    public void setmTenchitiet_dmloai(String mTenchitiet_dmloai) {
        this.mTenchitiet_dmloai = mTenchitiet_dmloai;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    public String getmId_dm_loai() {
        return mId_dm_loai;
    }

    public void setmId_dm_loai(String mId_dm_loai) {
        this.mId_dm_loai = mId_dm_loai;
    }
    
    
}
