package com.hou.hanoiguide;

import java.util.ArrayList;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MyArrayAdapterPlace extends ArrayAdapter<MyPlace> {
	Activity context;
	ArrayList<MyPlace> myArray = null;
	int layoutId;

	public MyArrayAdapterPlace(Activity context, int layoutId,
			ArrayList<MyPlace> arr) {
		super(context, layoutId, arr);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.layoutId = layoutId;
		this.myArray = arr;
	}
	public View getView(int position, View convertView, ViewGroup parent){

        return convertView;

    }

}
