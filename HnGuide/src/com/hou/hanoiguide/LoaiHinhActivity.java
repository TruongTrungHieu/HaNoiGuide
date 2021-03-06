package com.hou.hanoiguide;

import java.util.ArrayList;
import java.util.List;

import com.cipolat.slidenavigation.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class LoaiHinhActivity extends Activity {
	ListView lv;
    ArrayList imageName;
    ListView lv_Loaihinh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loai_hinh);
		Intent t = getIntent();
		Bundle b = t.getExtras();
		List<String> loaihinh = b.getStringArrayList("SearchList");
        lv_Loaihinh = (ListView) findViewById(R.id.lv_Loaihinh);
        lv_Loaihinh.setAdapter(new LoaiHinhAdapter(getApplicationContext(),loaihinh));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
		return super.onOptionsItemSelected(item);
	}
}
