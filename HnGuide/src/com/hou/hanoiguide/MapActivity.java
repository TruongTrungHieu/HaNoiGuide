package com.hou.hanoiguide;

import java.util.ArrayList;

import com.cipolat.slidenavigation.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MapActivity extends Activity implements OnMapReadyCallback {
	GoogleMap mMap;
	ImageView imgDiemDL, imgKhachSan, imgGPS, imgNhaHang, imgMuaSam,
			imgGiaoThong;
	int status = 0; // 0b

	ArrayList<ImageView> lstImg = new ArrayList<ImageView>();

	Button btnSlide;
	RelativeLayout rllBottom;

	// MyArrayAdapterPlace adapter;
	ArrayAdapter adapter;
	ArrayList<MyPlace> lstPlace;
	ListView lvSlide;
	private static final String TAG = "DemoActivity";
	private SlidingUpPanelLayout mLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		// setSupportActionBar((Toolbar) findViewById(R.id.main_toolbar));
		btnSlide = (Button) findViewById(R.id.btnSlide);
		rllBottom = (RelativeLayout) findViewById(R.id.layoutButtom);
		rllBottom.setVisibility(View.INVISIBLE);
		lstImg.add(imgDiemDL);
		lstImg.add(imgGiaoThong);
		lstImg.add(imgKhachSan);
		lstImg.add(imgNhaHang);
		lstImg.add(imgMuaSam);

		btnSlide.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mLayout.hidePanel();
				rllBottom.setVisibility(View.VISIBLE);
			}
		});

		mLayout = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
		mLayout.setPanelSlideListener(new PanelSlideListener() {
			@Override
			public void onPanelSlide(View panel, float slideOffset) {
				Log.i(TAG, "onPanelSlide, offset " + slideOffset);
			}

			@Override
			public void onPanelExpanded(View panel) {
				Log.i(TAG, "onPanelExpanded");

			}

			@Override
			public void onPanelCollapsed(View panel) {
				Log.i(TAG, "onPanelCollapsed");
			}

			@Override
			public void onPanelAnchored(View panel) {
				Log.i(TAG, "onPanelAnchored");
			}

			@Override
			public void onPanelHidden(View panel) {
				Log.i(TAG, "onPanelHidden");
			}
		});
		MapFragment mapFragment = (MapFragment) getFragmentManager()
				.findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);
		mMap = mapFragment.getMap();
		mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		mMap.getUiSettings().setMyLocationButtonEnabled(true);
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(21.028860,
				105.852330), 13));

		lvSlide = (ListView) findViewById(R.id.lvSlide);
		lstPlace = new ArrayList<MyPlace>();
		adapter = new MyArrayAdapterPlace(this,
				android.R.layout.simple_list_item_1, lstPlace);
		lvSlide.setAdapter(adapter);

		imgDiemDL = (ImageView) findViewById(R.id.imgDiemDL);
		imgGiaoThong = (ImageView) findViewById(R.id.imgGiaoThong);
		imgKhachSan = (ImageView) findViewById(R.id.imgKhachSan);
		imgMuaSam = (ImageView) findViewById(R.id.imgMuaSam);
		imgNhaHang = (ImageView) findViewById(R.id.imgNhaHang);
		imgDiemDL.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				status ^= 16; // 1 << 4
				mMap.clear();
				onMapReady(mMap);
				CheckStatusBottom();

			}
		});
		imgGiaoThong.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				status ^= 1;
				mMap.clear();
				onMapReady(mMap);
				CheckStatusBottom();
			}
		});
		imgKhachSan.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				status ^= 4;
				mMap.clear();
				onMapReady(mMap);
				CheckStatusBottom();

			}
		});
		imgMuaSam.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				status ^= 2;
				mMap.clear();
				onMapReady(mMap);
				CheckStatusBottom();

			}
		});
		imgNhaHang.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				status ^= 8;
				mMap.clear();
				onMapReady(mMap);
				CheckStatusBottom();
			}
		});

		FixWidthBottom(imgDiemDL, imgKhachSan, imgNhaHang, imgMuaSam,
				imgGiaoThong);
	}

	public void ImgIsSelected() {
		if (((status >> 4) & 1) == 1) {
			mMap.addMarker(new MarkerOptions().position(
					new LatLng(21.028860, 105.852330)).title("Hồ Hoàn Kiếm"));
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.036388, 105.842712))
					.title("Hoàng Thành Thăng Long")
					.snippet("Khu di tích thành cổ"));

		}
		if (((status >> 2) & 1) == 1) {
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.033370, 105.854253))
					.title("Blue Pearl Hotel")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
					.snippet("34 / 18 Hang Tre St Hoan Kiem District, Hanoi"));
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.030243, 105.849809))
					.title("Golden Sun Villa Hotel")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
					.snippet("68 Hang Trong, Hanoi"));
		}
		if (((status >> 1) & 1) == 1) {
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.037640, 105.849091))
					.title("Chợ Đồng Xuân")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
					.snippet("..."));
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.034597, 105.850275))
					.title("Phố Hàng Ngang")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
					.snippet("Hang Ngang, Hanoi"));
		}
		if (((status >> 3) & 1) == 1) {
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.024723, 105.857978))
					.title("Kem Tràng Tiền")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.snippet("..."));
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.024643, 105.851648))
					.title("Nhà Hàng Jeny Pyo")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
					.snippet("Free..."));
		}
		if (((status >> 0) & 1) == 1) {
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.037640, 105.849091))
					.title("Chợ Đồng Xuân")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
					.snippet("..."));
			mMap.addMarker(new MarkerOptions()
					.position(new LatLng(21.034597, 105.850275))
					.title("Phố Hàng Ngang")
					.icon(BitmapDescriptorFactory
							.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
					.snippet("Hang Ngang, Hanoi"));
		}
	}

	public void FixWidthBottom(ImageView ddl, ImageView ks, ImageView nh,
			ImageView ms, ImageView gt) {
		Display display = getWindowManager().getDefaultDisplay();
		ArrayList<ImageView> arrIv = new ArrayList<ImageView>();
		arrIv.add(ddl);
		arrIv.add(nh);
		arrIv.add(ks);
		arrIv.add(ms);
		arrIv.add(gt);
		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		int height = displaymetrics.heightPixels;
		int width = displaymetrics.widthPixels;

		if (true) {
			int t = (width - 350) / (6);
			int b = t;

			for (ImageView imageView : arrIv) {
				RelativeLayout.LayoutParams arrImageBottom = new RelativeLayout.LayoutParams(
						imageView.getLayoutParams());
				arrImageBottom.setMargins(t, 10, 0, 10);
				imageView.setLayoutParams(arrImageBottom);
				t = t + 70 + b;
			}
		}
	}

	// Kiểm tra trạng thái chọn hay k chọn
	public void CheckStatusBottom() {

		ArrayList<ImageView> lstImg = new ArrayList<ImageView>();
		lstImg.add(imgGiaoThong);
		lstImg.add(imgMuaSam);
		lstImg.add(imgKhachSan);
		lstImg.add(imgNhaHang);
		lstImg.add(imgDiemDL);

		for (int i = lstImg.size() - 1; i >= 0; i--) {
			lstImg.get(i).setAlpha((((status >> i) & 1) == 0 ? 1f : 0.5f));
		}

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
		/*
		 * if (id == R.id.action_settings) { return true; }
		 */
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onMapReady(GoogleMap arg0) {
		// TODO Auto-generated method stub
		ImgIsSelected();
		 mLayout.setVisibility(View.VISIBLE);
	}
}
