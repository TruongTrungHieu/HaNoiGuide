package com.hou.hanoiguide;

import java.util.ArrayList;
import java.util.List;

import com.cipolat.slidenavigation.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	private String[] titulos;
	private String[] footer_item;
	private DrawerLayout NavDrawerLayout;
	private ListView NavList;
	private RelativeLayout navi;
	private ArrayList<Item_objct> NavItms;
	private ArrayList<Item_objct> FooterItms;
	private TypedArray NavIcons;
	private TypedArray FooterIcons;
	private ActionBarDrawerToggle mDrawerToggle;
	NavigationAdapter NavAdapter;
	NavigationAdapter FooterAdapter;
	final CharSequence[] items = { "Tất cả", "Nhà th�?", "Công viên",
			"Bảo tàng", "Sở thú" };
	private ArrayList<String> itemsSelect = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Drawer Layout
		NavDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		// Lista
		NavList = (ListView) findViewById(R.id.left);
		navi = (RelativeLayout) findViewById(R.id.lista);

		// Declaramos el header el cual sera el layout de header.xml
		View header = getLayoutInflater().inflate(R.layout.header, null);

		FooterIcons = getResources().obtainTypedArray(R.array.footer_iconos);
		footer_item = getResources().getStringArray(R.array.footer_options);

		FooterAdapter = new NavigationAdapter(this, FooterItms);
		// Establecemos header
		NavList.addHeaderView(header);
		// NavList.addFooterView(footer);
		// Tomamos listado de imgs desde drawable
		NavIcons = getResources().obtainTypedArray(R.array.navigation_iconos);
		// Tomamos listado de titulos desde el string-array de los recursos
		// @string/nav_options
		titulos = getResources().getStringArray(R.array.nav_options);
		// Listado de titulos de barra de navegacion
		NavItms = new ArrayList<Item_objct>();
		// Agregamos objetos Item_objct al array
		// �?iểm du lịch
		NavItms.add(new Item_objct(titulos[0], NavIcons.getResourceId(0, -1)));
		// Khách sạn
		NavItms.add(new Item_objct(titulos[1], NavIcons.getResourceId(1, -1)));
		// Nhà hàng
		NavItms.add(new Item_objct(titulos[2], NavIcons.getResourceId(2, -1)));
		// Mua sắm
		NavItms.add(new Item_objct(titulos[3], NavIcons.getResourceId(3, -1)));
		// Giao thông
		NavItms.add(new Item_objct(titulos[4], NavIcons.getResourceId(4, -1)));
		NavItms.add(new Item_objct(footer_item[0], FooterIcons.getResourceId(0,
				-1)));
		NavItms.add(new Item_objct(footer_item[1], FooterIcons.getResourceId(1,
				-1)));
		NavItms.add(new Item_objct(footer_item[2], FooterIcons.getResourceId(2,
				-1)));
		// Declaramos y seteamos nuestro adaptador al cual le pasamos el array
		// con los titulos
		NavAdapter = new NavigationAdapter(this, NavItms);
		NavList.setAdapter(NavAdapter);

		getTitle();

		// Declaramos el mDrawerToggle y las imgs a utilizar
		mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		NavDrawerLayout, /* DrawerLayout object */
		R.drawable.ic_drawer, /* Icono de navegacion */
		R.string.app_name, /* "open drawer" description */
		R.string.hello_world /* "close drawer" description */
		) {

			/** Called when a drawer has settled in a completely closed state. */
			public void onDrawerClosed(View view) {
				Log.e("Cerrado completo", "!!");
			}

			/** Called when a drawer has settled in a completely open state. */
			public void onDrawerOpened(View drawerView) {
				Log.e("Apertura completa", "!!");
			}
		};

		// Establecemos que mDrawerToggle declarado anteriormente sea el
		// DrawerListener
		NavDrawerLayout.setDrawerListener(mDrawerToggle);
		// Establecemos que el ActionBar muestre el Boton Home
		getActionBar().setDisplayHomeAsUpEnabled(true);

		// Establecemos la accion al clickear sobre cualquier item del menu.
		// De la misma forma que hariamos en una app comun con un listview.
		NavList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long id) {
				MostrarFragment(position);
			}
		});

		// Cuando la aplicacion cargue por defecto mostrar la opcion Home
		Fragment fragment = new HomeFragment();
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction()
				.replace(R.id.content_frame, fragment).commit();
	}

	private AlertDialog taomotdialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Loại hình du lịch");
		builder.setMultiChoiceItems(items, null,
				new OnMultiChoiceClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which,
							boolean isChecked) {
						AlertDialog s = (AlertDialog) dialog;
						ListView v = s.getListView();
						if (isChecked) {
							if (items[which] == items[0]) {
								int i = 1;
								itemsSelect.clear();
								while (i < items.length) {
									v.setItemChecked(i, true);
									itemsSelect.add(items[i].toString());
									i++;
								}
							} else {
								itemsSelect.add(items[which].toString());
							}
						} else {
							if (items[which] == items[0]) {
								int i = 0;
								while (i < items.length) {
									v.setItemChecked(i, false);
									i++;
								}
								itemsSelect.clear();
							} else {
								v.setItemChecked(0, false);
								itemsSelect.remove(items[which]);
							}
						}
					}
				});
		builder.setPositiveButton("Tìm kiếm",
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						ArrayList<String> s = new ArrayList<String>();
						for (int i = 0; i < itemsSelect.size(); i++) {
							s.add(itemsSelect.get(i));
						}
						Intent t = new Intent(getApplicationContext(),
								LoaiHinhActivity.class);
						Bundle b = new Bundle();
						b.putStringArrayList("SearchList", s);
						t.putExtras(b);
						startActivity(t);
					}
				});
		AlertDialog myDialog = builder.create();
		return myDialog;
	}

	/*
	 * Pasando la posicion de la opcion en el menu nos mostrara el Fragment
	 * correspondiente
	 */
	private void MostrarFragment(int position) {
		// update the main content by replacing fragments
		Fragment fragment = null;
		switch (position) {
		case 1:
			AlertDialog dialog = taomotdialog();
			dialog.show();
			//
			NavList.setItemChecked(position, true);
			NavList.setSelection(position);
			//
			NavDrawerLayout.closeDrawer(navi);
			break;
		case 2:
			fragment = new ProfileFragment();
			break;
		default:
			// si no esta la opcion mostrara un toast y nos mandara a Home
			Toast.makeText(getApplicationContext(),
					"Opcion " + titulos[position - 1] + "no disponible!",
					Toast.LENGTH_SHORT).show();
			fragment = new HomeFragment();
			position = 1;
			break;
		}
		// Validamos si el fragment no es nulo
		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.content_frame, fragment).commit();
		} else {
			// Si el fragment es nulo mostramos un mensaje de error.
			Log.e("Error  ", "MostrarFragment" + position);
		}
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Pass the event to ActionBarDrawerToggle, if it returns
		// true, then it has handled the app icon touch event
		int id = item.getItemId();
		if (id == R.id.item_refresh) {
			Intent t = new Intent(getApplicationContext(), MapActivity.class);
			startActivity(t);
		}
		// Handle your other action bar items...
		return super.onOptionsItemSelected(item);
	}
}
