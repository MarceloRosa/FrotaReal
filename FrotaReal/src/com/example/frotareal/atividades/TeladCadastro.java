package com.example.frotareal.atividades;
/*
* 
* @author 	Marcelo Rosa / Jorge Lousada* 			
* 			
* @version 1.0
* Classe TeladCadastro: Activity para cadastro de maquinas.
* 
*/


import com.example.frotareal.DAO.FrotaRealDAO;
import com.example.frotareal.Helper.*;
import com.example.frotareal.bean.FrotaRealBean;
import com.example.frotareal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TeladCadastro extends Activity {
	
	private RegistroHelper registroHelper;
	private Button buttonTeladCadastro;	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_telad_cadastro);
		registroHelper =  new RegistroHelper(this);
		buttonTeladCadastro = (Button) findViewById(R.id.buttonTeladCadastro);
		buttonTeladCadastro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FrotaRealBean frotarealBean =  registroHelper.getMaquina();
				FrotaRealDAO frotarealDAO = new FrotaRealDAO(TeladCadastro.this);
				frotarealDAO.registrarMaquina(frotarealBean);
				frotarealDAO.close();
				finish();
			
		}
	});
	
			
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_cadastro, menu);
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
