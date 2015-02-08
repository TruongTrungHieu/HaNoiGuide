package com.hou.hanoiguide.model;

/**
 * Mytour
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */

public class Mytour {
    private String mId_mytour;
    private String mTentour;
    private String mMota;

    public Mytour() {
    }

    public Mytour(String mId_mytour, String mTentour, String mMota) {
        this.mId_mytour = mId_mytour;
        this.mTentour = mTentour;
        this.mMota = mMota;
    }

    public String getmId_mytour() {
        return mId_mytour;
    }

    public void setmId_mytour(String mId_mytour) {
        this.mId_mytour = mId_mytour;
    }

    public String getmTentour() {
        return mTentour;
    }

    public void setmTentour(String mTentour) {
        this.mTentour = mTentour;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
}
