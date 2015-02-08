package com.hou.hanoiguide;

import com.cipolat.slidenavigation.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Chitiet_Activity extends Activity {
	ImageView slideplay;
	Button bt_save, bt_ivebeen, bt_eat, bt_todo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chitiet_);
		ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00CC00")));
        slideplay = (ImageView) findViewById(R.id.slideplay);
        slideplay.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(), Slideplay_activity.class);
				startActivity(intent);
			}

		});
        bt_save = (Button) findViewById(R.id.bt_save);
        bt_save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "tee hee", Toast.LENGTH_LONG).show();
			}
		});
        bt_ivebeen = (Button) findViewById(R.id.bt_ivebeen);
        bt_ivebeen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "haha", Toast.LENGTH_LONG).show();
			}
		});
        
        bt_eat = (Button) findViewById(R.id.bt_eat);
        bt_eat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "há»? há»?", Toast.LENGTH_LONG).show();
			}
		});
        bt_todo = (Button) findViewById(R.id.bt_todo);
        bt_todo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), ":3 :3", Toast.LENGTH_LONG).show();
			}
		});
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
		/*if (id == R.id.action_settings) {
			return true;
		}*/
		return super.onOptionsItemSelected(item);
	}
}
