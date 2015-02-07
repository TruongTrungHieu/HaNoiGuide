
package com.hou.hanoiguide.model;

/**
 * DD_Dm_loaihinhdl
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 
 */
public class DD_Dm_loaive {
    private String mId_loaive;
    private String mTenloaive;

    public DD_Dm_loaive() {
    }

    public DD_Dm_loaive(String mId_loaive, String mTenloaive) {
        this.mId_loaive = mId_loaive;
        this.mTenloaive = mTenloaive;
    }

    public String getmId_loaive() {
        return mId_loaive;
    }

    public void setmId_loaive(String mId_loaive) {
        this.mId_loaive = mId_loaive;
    }

    public String getmTenloaive() {
        return mTenloaive;
    }

    public void setmTenloaive(String mTenloaive) {
        this.mTenloaive = mTenloaive;
    }
    
    
}
