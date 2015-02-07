
package com.hou.hanoiguide.model;

/**
 * KS_Dm_loaikhachsan
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Dm_loaikhachsan {
    private String mId_loaikhachsan;
    private String mTenloai;
    private String mMota;

    public KS_Dm_loaikhachsan() {
    }

    public KS_Dm_loaikhachsan(String mId_loaikhachsan, String mTenloai, String mMota) {
        this.mId_loaikhachsan = mId_loaikhachsan;
        this.mTenloai = mTenloai;
        this.mMota = mMota;
    }

    public String getmId_loaikhachsan() {
        return mId_loaikhachsan;
    }

    public void setmId_loaikhachsan(String mId_loaikhachsan) {
        this.mId_loaikhachsan = mId_loaikhachsan;
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
