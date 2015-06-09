package com.example.frotareal.atividades;
/*
* 
* @author 	Marcelo Rosa / Jorge Lousada* 			
* 			
* @version 1.0
* Classe DadosParaManutencao3: Activity para dados manutenção.
* 
*/

import com.example.frotareal.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.GoogleMap.CancelableCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class DadosParaManutencao3 extends FragmentActivity {
	
	private SupportMapFragment mapFrag;
	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_para_manutencao3);
		
		GoogleMapOptions options = new GoogleMapOptions();
		options.zOrderOnTop(true);
		
		mapFrag = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
		
		map = mapFrag.getMap();
		
		/*mapFrag = SupportMapFragment.newInstance(options);
		
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.fragment1, mapFrag);
		ft.commit();*/
		
		configMap();
	}
	public void configMap(){
		map = mapFrag.getMap();
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		
		LatLng latLng = new LatLng(-3.768958, -38.481889);
		
		CameraPosition cameraPosition = new CameraPosition.Builder().target(latLng).zoom(18).bearing(0).tilt(90).build();
		CameraUpdate update = CameraUpdateFactory.newCameraPosition(cameraPosition);
		
		//map.moveCamera(update);
		map.animateCamera(update, 3000, new CancelableCallback(){
			@Override
			public void onCancel() {
				Log.i("Script", "CancelableCallback.onCancel()");
			}

			@Override
			public void onFinish() {
				Log.i("Script", "CancelableCallback.onFinish()");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dados_para_manutencao3, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
