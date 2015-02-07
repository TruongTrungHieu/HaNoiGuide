

package com.hou.hanoiguide.model;

/**
 * DD_Dm_loaihinhdl
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Dm_loaihinhdl {
    private String mId_loaihinhDL;
    private String mTenloai;
    private String mMota;

    public DD_Dm_loaihinhdl() {
    }

    public DD_Dm_loaihinhdl(String mId_loaihinhDL, String mTenloai, String mMota) {
        this.mId_loaihinhDL = mId_loaihinhDL;
        this.mTenloai = mTenloai;
        this.mMota = mMota;
    }

    public String getmId_loaihinhDL() {
        return mId_loaihinhDL;
    }

    public void setmId_loaihinhDL(String mId_loaihinhDL) {
        this.mId_loaihinhDL = mId_loaihinhDL;
    }

    public String getmTenloai() {
        return mTenloai;
    }

    public void setmTenloai(String mTenloai) {
        this.mTenloai = mTenloai;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
    
}
